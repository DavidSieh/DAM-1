package Ejercicio_Ficheros02;

import java.io.*;
import java.util.*;

//12.- En un comercio desean mantener los datos de sus clientes. 
//Implementar una aplicación que permita guardar y recuperar los datos de los clientes. 
//Para ello, definir la clase Cliente, que tendrá los siguientes atributos: 
//id: identificador de cliente (entero).


public class Init {

    private static final String FILE = "ficheros/clientes.bin";
    private static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {

        cargar();

        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n1. Añadir");
            System.out.println("2. Modificar");
            System.out.println("3. Borrar");
            System.out.println("4. Listar");
            System.out.println("0. Salir");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> add(sc);
                case 2 -> mod(sc);
                case 3 -> del(sc);
                case 4 -> list();
            }
        } while (op != 0);

        guardar();
    }

    static void cargar() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {
            clientes = (ArrayList<Cliente>) ois.readObject();
        } catch (Exception ignored) {}
    }

    static void guardar() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(clientes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void add(Scanner sc) {
        System.out.print("ID: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Nombre: ");
        String nom = sc.nextLine();
        System.out.print("Teléfono: ");
        String tel = sc.nextLine();

        clientes.add(new Cliente(id, nom, tel));
    }

    static void mod(Scanner sc) {
        System.out.print("ID a modificar: ");
        int id = sc.nextInt(); sc.nextLine();

        for (Cliente c : clientes) {
            if (c.getId() == id) {
                System.out.print("Nuevo nombre: ");
                c.setNombre(sc.nextLine());
                System.out.print("Nuevo teléfono: ");
                c.setTelefono(sc.nextLine());
                return;
            }
        }
        System.out.println("No encontrado.");
    }

    static void del(Scanner sc) {
        System.out.print("ID a borrar: ");
        int id = sc.nextInt();

        clientes.removeIf(c -> c.getId() == id);
    }

    static void list() {
        clientes.forEach(System.out::println);
    }
}
