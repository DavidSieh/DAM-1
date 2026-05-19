package ejerciciossueltos;

import java.util.*;

public class Ej4 {
    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(10);

            int pos = 0;
            while (pos < lista.size() && lista.get(pos) > num) {
                pos++;
            }
            lista.add(pos, num);
        }

        System.out.println("Lista en orden decreciente: " + lista);
    }
}
