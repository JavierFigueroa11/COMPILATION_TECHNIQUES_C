package app.models;

import java.util.ArrayList;

public class Funcion extends ID {
    ArrayList<Variable> argumentos;

    public ArrayList<Variable> getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(ArrayList<Variable> argumentos) {
        this.argumentos = argumentos;
    }

    public void addArgumento(Variable arg) {
        if(this.argumentos != null){
            this.argumentos.add(arg);
        }else{
            this.argumentos = new ArrayList<Variable>();
            this.argumentos.add(arg);
        }
        
    }  
}