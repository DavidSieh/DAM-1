package Binaria;

//Ejemplo 3: Copia de fichero binario (Buffered)
//Copiar cualquier fichero (imagen, pdf, etc.)

import java.io.*;

public class CopiaBinaria {

 public static void main(String[] args) {

     try (
         BufferedInputStream bis = new BufferedInputStream(new FileInputStream("origen.jpg"));
         BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copia.jpg"))
     ) {

         int byteLeido;

         while ((byteLeido = bis.read()) != -1) {
             bos.write(byteLeido);
         }

         System.out.println("Copia realizada.");

     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
