package provincias;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodigosPostales {
    public static void main(String[] args) {

        Map<Integer, String> capitales = new HashMap<>();

        // Castilla y León
        capitales.put(47001, "Valladolid");
        capitales.put(24001, "León");
        capitales.put(37001, "Salamanca");
        capitales.put(49001, "Zamora");
        capitales.put(05001, "Ávila");
        capitales.put(9001, "Burgos");
        capitales.put(34001, "Palencia");
        capitales.put(42001, "Soria");
        capitales.put(48001, "Burgos");

        // Extremadura
        capitales.put(06001, "Badajoz");
        capitales.put(10001, "Cáceres");

        // Castilla-La Mancha
        capitales.put(02001, "Albacete");
        capitales.put(13001, "Ciudad Real");
        capitales.put(16001, "Cuenca");
        capitales.put(45001, "Toledo");
        capitales.put(19001, "Guadalajara");

        System.out.println("=== Códigos postales introducidos ===");
        capitales.forEach((cp, ciudad) -> System.out.println(cp + " → " + ciudad));

        Scanner sc = new Scanner(System.in);

        // Buscar por código postal
        System.out.print("\nIntroduce un código postal: ");
        int cpBuscado = sc.nextInt();

        if (capitales.containsKey(cpBuscado)) {
            System.out.println("Capital asociada: " + capitales.get(cpBuscado));
        } else {
            System.out.println("No existe ninguna capital con ese código postal.");
        }

        // Eliminar Valladolid y Badajoz por código postal
        capitales.remove(47001); // Valladolid
        capitales.remove(06001); // Badajoz

        // Eliminar Albacete por nombre
        capitales.entrySet().removeIf(entry -> entry.getValue().equalsIgnoreCase("Albacete"));

        System.out.println("\n=== Datos después de eliminar Valladolid, Badajoz y Albacete ===");
        capitales.forEach((cp, ciudad) -> System.out.println(cp + " → " + ciudad));

        sc.close();
    }
}
