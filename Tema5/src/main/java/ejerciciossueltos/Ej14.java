package ejerciciossueltos;

import java.util.*;

public class Ej14 {
    public static List<Character> leeCadena() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce cadena: ");
        String cad = sc.nextLine();

        List<Character> lista = new ArrayList<>();
        for (char c : cad.toCharArray()) {
            lista.add(c);
        }
        return lista;
    }
}

