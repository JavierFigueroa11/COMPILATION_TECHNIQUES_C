package app;

import java.util.ArrayList;

import app.models.Funcion;
import app.models.TablaSimbolos;
import app.models.Variable;

public class MiListener extends reglasBaseListener {

    TablaSimbolos tablaS = new TablaSimbolos();

	@Override public void exitProg(reglasParser.ProgContext ctx) { 
        System.out.println(tablaS.getContexto());
    }
 
	@Override public void enterBloque(reglasParser.BloqueContext ctx) { 
        tablaS.agregarContexto();
    }
 
	@Override public void exitBloque(reglasParser.BloqueContext ctx) { 
        tablaS.eliminarContexto();
    }
 
	@Override public void exitDeclaracionDatos(reglasParser.DeclaracionDatosContext ctx) { 
        
        String id = ctx.ID().getText();
        String tipoDato = ctx.tipodato().getText();

        Boolean aux = true;

        if(ctx.ID().getText().equals("<INVALID>")){
            System.out.println("Error sintáctico: Formato incorrecto en lista de declaración de variables.");
        }else{
            if(tablaS.encontrarIDLocal(id) != null){
                System.out.println("Error semántico: Variable duplicada en linea " + ctx.getStart().getLine());
            } else{
                Variable var = new Variable();
                var.settipoDato(tipoDato);
                var.setNombre(id);
                var.setUsado(Boolean.FALSE);
                
                
                if(ctx.getStop().getType() == 44){ //entero
                    if(!ctx.tipodato().getText().equals("int")){
                        System.out.println("Error semántico: Tipos de datos incompatibles en linea " + ctx.getStart().getLine());
                        aux = false;
                    }
                } else if(ctx.getStop().getType() == 46){ //char
                    if(!ctx.tipodato().getText().equals("char")){
                        System.out.println("Error semántico: Tipos de datos incompatibles en linea " + ctx.getStart().getLine());
                        aux = false;
                    }
                } else if(ctx.getStop().getType() == 47){ //double
                    if(!ctx.tipodato().getText().equals("double")){
                        System.out.println("Error semántico: Tipos de datos incompatibles en linea " + ctx.getStart().getLine());
                        aux = false;
                    }
                } 

                if(aux == true) {
                    if(ctx.asignacion() != null){
                        var.setInicializado(Boolean.TRUE);
                    }
                    tablaS.agregarID(var);
                }
            }    
        }       
    }

	@Override public void exitAsignacionDatos(reglasParser.AsignacionDatosContext ctx) {
        String id = ctx.ID().getText();

        if(tablaS.encontrarTodosID(id) == null){
            System.out.println("Error semántico: Se usó un identificador sin declarar. Linea " + ctx.getStart().getLine());
        }else{
            Variable var = new Variable();
            var.setNombre(id);
            var.setUsado(Boolean.TRUE);
            var.setInicializado(Boolean.TRUE);
            tablaS.agregarID(var);
        }
    }

	@Override public void exitFactor(reglasParser.FactorContext ctx) { 
        if(ctx.ID() != null){
            String id = ctx.ID().getText();

            if(tablaS.encontrarTodosID(id) == null){
                System.out.println("Error semántico: Se usó un identificador sin declarar. Linea " + ctx.getStart().getLine());
            } else{
                   if(tablaS.encontrarTodosID(id).getInicializado() == null){
                        System.out.println("Error semántico: Se usó un identificador sin inicializar. Linea " + ctx.getStart().getLine());
                    } else{
                        Variable var = new Variable();
                        var.setNombre(id);
                        var.setUsado(Boolean.TRUE);
                        var.setInicializado(Boolean.TRUE);
                        tablaS.agregarID(var);
                    } 
            }

        }
    }

	@Override public void exitDefinicionFuncion(reglasParser.DefinicionFuncionContext ctx) { 
       
        String id = ctx.ID().getText();
        String tipoDato = ctx.tipodato().getText();
        Funcion func = new Funcion();

        reglasParser.ParametrosContext param = ctx.parametros();
        ArrayList<Variable> argumentos = new ArrayList<Variable>();
            
        /*declaracion arriba*/
        if(ctx.instruccion().PYC() != null){
            
            tablaS.agregarContexto();

            if(tablaS.encontrarTodosID(id) != null){
                System.out.println("Error semántico: La de función ya fue declarada. Linea " + ctx.getStart().getLine());
            } else{

                func.settipoDato(tipoDato);
                func.setNombre(id);
                func.setInicializado(Boolean.TRUE);
                func.setUsado(Boolean.FALSE);

                while(param != null && param.tipodato() != null){
                    Variable var = new Variable();
                    var.settipoDato(param.tipodato().getText());
                    var.setNombre(param.ID().getText());
                    var.setUsado(Boolean.FALSE);
                    var.setInicializado(Boolean.FALSE);
                    argumentos.add(var);
                    param = param.parametros();
                }
                
                func.setArgumentos(argumentos);

                tablaS.agregarID(func);
            }

        } else if(ctx.instruccion() != null){
            
            func.settipoDato(tipoDato);
            func.setNombre(id);
            func.setUsado(Boolean.TRUE);

            while(param != null && param.tipodato() != null){
                Variable var = new Variable();
                var.settipoDato(param.tipodato().getText());
                var.setNombre(param.ID().getText());
                var.setUsado(Boolean.FALSE);
                var.setInicializado(Boolean.FALSE);
                argumentos.add(var);
                param = param.parametros();
            }
            
            func.setArgumentos(argumentos);

            tablaS.agregarID(func);
        } 
    }

	@Override public void exitLlamadaFuncion(reglasParser.LlamadaFuncionContext ctx) {
            String id = ctx.ID().getText();

        if(tablaS.encontrarTodosID(id) == null){
            System.out.println("Error semántico: Se usó un identificador de función sin declarar. Linea " + ctx.getStart().getLine());
        } else {
            Funcion f = new Funcion();
            f.setNombre(id);
            f.setUsado(Boolean.TRUE);  
            
            reglasParser.ParametrosContext param = ctx.parametros();
            ArrayList<Variable> argumentos = new ArrayList<Variable>();

            while(param != null && param.tipodato() != null){
                Variable var = new Variable();
                var.settipoDato(param.tipodato().getText());
                var.setNombre(param.ID().getText());
                var.setUsado(Boolean.FALSE);
                var.setInicializado(Boolean.FALSE);
                argumentos.add(var);
                param = param.parametros();
            }
            
            f.setArgumentos(argumentos);

            tablaS.agregarID(f);
        }
     }

     @Override public void exitErrorPYC(reglasParser.ErrorPYCContext ctx) { 
        System.out.println("Error sintáctico: falta ';'. Linea: " + ctx.getStart().getLine());
    }

	@Override public void exitErrorPAFor(reglasParser.ErrorPAForContext ctx) {
        System.out.println("Error sintáctico: falta '('. Linea: " + ctx.getStart().getLine());
    }

	@Override public void exitErrorPAWhile(reglasParser.ErrorPAWhileContext ctx) { 
        System.out.println("Error sintáctico: falta '('. Linea: " + ctx.getStart().getLine());
    }

	@Override public void exitErrorPAIf(reglasParser.ErrorPAIfContext ctx) { 
        System.out.println("Error sintáctico: falta '('. Linea: " + ctx.getStart().getLine());
    }

	@Override public void exitErrorPALlamadaFuncion(reglasParser.ErrorPALlamadaFuncionContext ctx) { 
        System.out.println("Error sintáctico: falta '('. Linea: " + ctx.getStart().getLine());
    }

	@Override public void exitErrorPADefFuncion(reglasParser.ErrorPADefFuncionContext ctx) { 
        System.out.println("Error sintáctico: falta '('. Linea: " + ctx.getStart().getLine());
    }

	@Override public void exitErrorPCFor(reglasParser.ErrorPCForContext ctx) {
        System.out.println("Error sintáctico: falta ')'. Linea: " + ctx.getStart().getLine());
     }

	@Override public void exitErrorPCWhile(reglasParser.ErrorPCWhileContext ctx) { 
        System.out.println("Error sintáctico: falta ')'. Linea: " + ctx.getStart().getLine());
    }

	@Override public void exitErrorPCIf(reglasParser.ErrorPCIfContext ctx) {
        System.out.println("Error sintáctico: falta ')'. Linea: " + ctx.getStart().getLine());
     }

	@Override public void exitErrorPCLlamadaFuncion(reglasParser.ErrorPCLlamadaFuncionContext ctx) { 
        System.out.println("Error sintáctico: falta ')'. Linea: " + ctx.getStart().getLine());
    }

	@Override public void exitErrorPCDefFuncion(reglasParser.ErrorPCDefFuncionContext ctx) { 
        System.out.println("Error sintáctico: falta ')'. Linea: " + ctx.getStart().getLine());
    }
}