package ejerciciossueltos;

import java.util.*;

public class Ej13 {
    public static List fusion(List<Integer> l1, List<Integer> l2) {
        List<Integer> resultado = new ArrayList<>();
        int i = 0, j = 0;

        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) <= l2.get(j)) {
                resultado.add(l1.get(i++));
            } else {
                resultado.add(l2.get(j++));
            }
        }

        resultado.addAll(l1.subList(i, l1.size()));
        resultado.addAll(l2.subList(j, l2.size()));

        return resultado;
    }
}

