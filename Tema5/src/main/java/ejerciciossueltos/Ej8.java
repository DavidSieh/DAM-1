package ejerciciossueltos;

import java.util.*;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");
        List<String> lista = Arrays.asList(palabras);

        Set<String> repetidas = new HashSet<>();
        Set<String> noRepetidas = new HashSet<>();

        for (String p : lista) {
            if (!noRepetidas.add(p)) {
                repetidas.add(p);
            }
        }

        System.out.println("Repetidas: " + repetidas);

        noRepetidas.removeAll(repetidas);
        System.out.println("No repetidas: " + noRepetidas);
    }
}
