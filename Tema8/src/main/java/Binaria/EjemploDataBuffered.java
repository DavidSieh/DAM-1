package Binaria;

//Ejemplo 1: Data + Buffered (primitivos eficientes)
//Guardar y leer datos (edad, altura, nombre) de forma eficiente

//ESCRITURA
import java.io.*;

public class EjemploDataBuffered {

 public static void main(String[] args) {

     try (DataOutputStream dos =
             new DataOutputStream(
                 new BufferedOutputStream(
                     new FileOutputStream("datos.dat")))) {

         dos.writeInt(25);
         dos.writeDouble(1.75);
         dos.writeUTF("Ana");

         System.out.println("Datos escritos.");

     } catch (IOException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}




////LECTURA
//try (DataInputStream dis =
//     new DataInputStream(
//         new BufferedInputStream(
//             new FileInputStream("datos.dat")))) {
//
// int edad = dis.readInt();
// double altura = dis.readDouble();
// String nombre = dis.readUTF();
//
// System.out.println(nombre + " - " + edad + " - " + altura);
//
//}


//Ejemplo 4: Mezcla avanzada (Data + Object + Buffered)
//Guardar: un número, un texto y un objeto

//Ejemplo 2: Object + Buffered (objetos completos)
//Guardar y recuperar datos

//CLASE
//import java.io.Serializable;
//
//class Persona implements Serializable {
// String nombre;
// int edad;
//
// public Persona(String nombre, int edad) {
//     this.nombre = nombre;
//     this.edad = edad;
// }
//}
//
////ESCRITURA
//try (ObjectOutputStream oos =
//     new ObjectOutputStream(
//         new BufferedOutputStream(
//             new FileOutputStream("personas.dat")))) {
//
// oos.writeObject(new Persona("Luis", 30));
// oos.writeObject(new Persona("Marta", 28));
//
// System.out.println("Objetos guardados.");
//
//}
//
//
////LECTURA
//try (ObjectInputStream ois =
//     new ObjectInputStream(
//         new BufferedInputStream(
//             new FileInputStream("personas.dat")))) {
//
// Persona p1 = (Persona) ois.readObject();
// Persona p2 = (Persona) ois.readObject();
//
// System.out.println(p1.nombre + " " + p1.edad);
// System.out.println(p2.nombre + " " + p2.edad);
//
//} catch (ClassNotFoundException e) {
// e.printStackTrace();
//}

//try (ObjectOutputStream oos =
//     new ObjectOutputStream(
//         new BufferedOutputStream(
//             new FileOutputStream("mixto.dat")))) {
//
// oos.writeInt(100);
// oos.writeUTF("Hola mundo");
// oos.writeObject(new Persona("Carlos", 40));
//
//}
//
//
////LECTURA
//try (ObjectInputStream ois =
//     new ObjectInputStream(
//         new BufferedInputStream(
//             new FileInputStream("mixto.dat")))) {
//
// int numero = ois.readInt();
// String texto = ois.readUTF();
// Persona p = (Persona) ois.readObject();
//
// System.out.println(numero);
// System.out.println(texto);
// System.out.println(p.nombre);
//
//}