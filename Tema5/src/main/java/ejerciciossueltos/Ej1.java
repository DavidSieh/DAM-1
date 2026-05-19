package ejerciciossueltos;

import java.util.*;

public class Ej1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            lista.add(r.nextInt(100));
        }

        System.out.println("Lista original: " + lista);

        Collections.sort(lista);

        System.out.println("Lista ordenada creciente: " + lista);
    }
}
