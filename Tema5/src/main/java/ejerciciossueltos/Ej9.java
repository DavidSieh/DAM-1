package ejerciciossueltos;

import java.util.*;

public class Ej9 {
    public static Set union(Set c1, Set c2) {
        Set resultado = new HashSet<>(c1);
        resultado.addAll(c2);
        return resultado;
    }
}
