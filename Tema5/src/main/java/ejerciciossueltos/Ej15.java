package ejerciciossueltos;

import java.util.*;

public class Ej15 {
    public static List<Character> uneCadenas(List<Character> c1, List<Character> c2) {
        List<Character> resultado = new ArrayList<>(c1);
        resultado.addAll(c2);
        return resultado;
    }
}

