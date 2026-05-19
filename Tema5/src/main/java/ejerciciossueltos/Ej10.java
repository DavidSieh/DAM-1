package ejerciciossueltos;

import java.util.*;

public class Ej10 {
    public static Set interseccion(Set c1, Set c2) {
        Set resultado = new HashSet<>(c1);
        resultado.retainAll(c2);
        return resultado;
    }
}
