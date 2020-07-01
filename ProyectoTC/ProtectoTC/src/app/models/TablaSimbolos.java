package app.models;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class TablaSimbolos {

    List<Map<String,ID>> contexto;

    public TablaSimbolos(){
        contexto = new LinkedList<Map<String,ID>>();
    }

    public void agregarContexto(){
        contexto.add(new HashMap<>());
    }
    
    public Map<String,ID> getContexto(){
        return ((LinkedList<Map<String,ID>>)contexto).getLast();
    }

    public void agregarID(ID id){
        getContexto().put(id.getIdContexto(), id);
    }

    public ID encontrarIDLocal(String id){
        return getContexto().get(id);
    }

    public ID encontrarTodosID(String id){
        ID i = encontrarIDLocal(id);
        ListIterator<Map<String,ID>> iterador = contexto.listIterator(contexto.size()-1);

        while(iterador.hasPrevious() && (i == null)){
            i = iterador.previous().get(id);
        }

        return i;
    }

    public void eliminarContexto(){
        if(contexto.size() > 1){
            ((LinkedList<Map<String,ID>>)contexto).removeLast();
        }
    }

    @Override
    public String toString(){
        return "Tabla de Simbolos - contextos" + contexto;
    }
}