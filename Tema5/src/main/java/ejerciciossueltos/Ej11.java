package ejerciciossueltos;

import java.util.*;

public class Ej11 {
    public static Set diferencia(Set c1, Set c2) {
        Set resultado = new HashSet<>(c1);
        resultado.removeAll(c2);
        return resultado;
    }
}
