package app.models;

public class Variable extends ID {
    @Override
    public boolean equals(Object o) {
        if (o instanceof Variable) {
            if (nombre.equals(((Variable) o).nombre) && tipoDato.equals(((Variable) o).tipoDato)) {
                return true;
            }
        }
        return false;
    }
}