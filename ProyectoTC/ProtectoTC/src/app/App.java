package app;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class App {
    public static void main(final String[] args) throws Exception {
        try{
            final CharStream input = CharStreams.fromFileName("src/app/codigo.c");
            final reglasLexer lexer = new reglasLexer(input);
            final CommonTokenStream tokens = new CommonTokenStream(lexer);
            final reglasParser parser = new reglasParser(tokens);
            final reglasBaseListener escucha = new MiListener();
            parser.addParseListener(escucha);

            //parser.prog();

            final ParseTree tree = parser.prog();
            System.out.println(escucha);
            System.out.println(tree.toStringTree(parser));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}