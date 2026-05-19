package ejerciciossueltos;

import java.util.LinkedList;

public class Ej17<E extends Comparable<E>> extends LinkedList<E> {

    public void insertarOrdenado(E elemento) {
        int i = 0;
        while (i < size() && get(i).compareTo(elemento) < 0) {
            i++;
        }
        add(i, elemento);
    }
}
