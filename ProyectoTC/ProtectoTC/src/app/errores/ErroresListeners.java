package app.errores;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;


public class ErroresListeners extends BaseErrorListener {

    private ErroresEncontrados error;

    public ErroresListeners() {
        this.error = new ErroresEncontrados();
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e) {
        String position = "[" + line + ":" + charPositionInLine + "]";
        error.errorSintactico(position, msg);
    }

}