package app.models;

public class ID {

    String tipoDato;
    String nombre;  
    Boolean inicializado;
    Boolean usado;
    int idContexto;

    //getters and setters
    public String gettipoDato(){
        return tipoDato;
    }
    public void settipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getInicializado() {
        return inicializado;
    }

    public void setInicializado(Boolean inicializado) {
        this.inicializado = inicializado;
    }

    public Boolean isUsado() {
        return usado;

    }
    public void setUsado(Boolean usado) {
        this.usado = usado;  
    }
    
    public String getIdContexto() {
        return nombre;
    }

    public void setIdContexto(int idContexto) {
        this.idContexto = idContexto;
    }

    @Override
    public String toString() {
        return "Tipo:" + this.tipoDato + ", " + " Nombre:" + this.nombre + " usada:" + this.usado;

    }
}