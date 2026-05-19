package ejerciciossueltos;

import java.util.*;

public class Ej7 {
    public static List eliminaRepetidos(List c) {
        return new ArrayList<>(new LinkedHashSet<>(c));
    }
}
