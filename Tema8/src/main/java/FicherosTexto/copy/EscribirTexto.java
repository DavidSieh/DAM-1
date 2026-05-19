package FicherosTexto.copy;

//Escribir en un fichero de texto
//-------------------------------
//La forma recomendada de escribir en un fichero de texto en Java es mediante BufferedWriter junto con FileWriter, utilizando try-with-resources para garantizar el cierre automático del flujo.


//Recomendado: BufferedWriter (equilibrio ideal: rápida, clara y estándar)

import java.io.*;

public class EscribirTexto {
 public static void main(String[] args) {

     File fichero = new File("ficheros", "salida.txt");

     try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {

         bw.write("Primera línea");
         bw.newLine();
         bw.write("Segunda línea");

         System.out.println("Escritura completada.");

     } catch (IOException e) {
         System.err.println("Error: " + e.getMessage());
     }
 }
}

//
////Cómoda: PrintWriter (muy fácil de usar -tipo System.out-)
//
//import java.io.*;
//
//public class EscribirTexto {
// public static void main(String[] args) {
//
//     try (PrintWriter pw = new PrintWriter("salida.txt")) {
//
//         pw.println("Primera línea");
//         pw.println("Segunda línea");
//
//     } catch (Exception e) {
//         System.err.println("Error: " + e.getMessage());
//     }
// }
//}
//
//
////Básica: FileWriter (sin buffer; más simple, pero menos eficiente)
//
//import java.io.*;
//
//public class EscribirTexto {
// public static void main(String[] args) {
//
//     try (FileWriter fw = new FileWriter("salida.txt")) {
//
//         fw.write("Hola mundo\n");
//         fw.write("Otra línea");
//
//     } catch (IOException e) {
//         System.err.println("Error: " + e.getMessage());
//     }
// }
//}



//Importante!!! Para añadir: new FileWriter("salida.txt", true)