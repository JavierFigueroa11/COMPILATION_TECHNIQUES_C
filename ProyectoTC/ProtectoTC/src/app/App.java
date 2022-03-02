package app;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import app.Cod3Direcciones.*;
import app.errores.ErroresListeners;

public class App {
    public static void main(final String[] args) throws Exception {
    
        CharStream input = CharStreams.fromFileName("src/app/codigo.c");
        reglasLexer lexer = new reglasLexer(input);            
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        reglasParser parser = new reglasParser(tokens);
        reglasBaseListener escucha = new MiListener();            
        parser.addParseListener(escucha);


        ErroresListeners errorsListener = new ErroresListeners();
        parser.removeErrorListeners();
        parser.addErrorListener(errorsListener);

        ParseTree tree = parser.prog();
        /*System.out.println(escucha);
        System.out.println(tree.toStringTree(parser));*/

        Cod3DirVisitor visitor = new Cod3DirVisitor();

        visitor.visit(tree);
        visitor.getResultado();
        visitor.generateCode();

        
    }
}