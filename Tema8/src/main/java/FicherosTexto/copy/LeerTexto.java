package FicherosTexto.copy;



public class LeerTexto {
}

	// Leer de un fichero de texto
	// ---------------------------
	// La forma recomendada de leer un fichero de texto en Java es mediante BufferedReader junto con FileReader, utilizando un bucle con readLine() y try-with-resources para asegurar el cierre del flujo.


	// Recomendado: BufferedReader (estándar: la forma más usada, eficiente y correcta)

//	import java.io.*;
//
//	public class LeerTexto {
//	    public static void main(String[] args) {
//
//	        File fichero = new File("ficheros", "entrada.txt");
//
//	        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
//
//	            String linea;
//
//	            while ((linea = br.readLine()) != null) {
//	                System.out.println(linea);
//	            }
//
//	        } catch (IOException e) {
//	            System.err.println("Error: " + e.getMessage());
//	        }
//	    }
//	}


	// Cómoda: Scanner (más fácil de usar, pero menos eficiente)



//	public class LeerTexto {
//	    public static void main(String[] args) {
//
//	        try (Scanner sc = new Scanner(new File("entrada.txt"))) {
//
//	            while (sc.hasNextLine()) {
//	                System.out.println(sc.nextLine());
//	            }
//
//	        } catch (FileNotFoundException e) {
//	            System.err.println("Error: " + e.getMessage());
//	        }
//	    }
//	}


	// Básica: FileReader (sin buffer; más "bajo nivel")
	// ineficiente; lectura carácter a carácter

//	import java.io.*;
//
//	public class LeerTexto {
//	    public static void main(String[] args) {
//
//	        try (FileReader fr = new FileReader("entrada.txt")) {
//
//	            int c;
//
//	            while ((c = fr.read()) != -1) {
//	                System.out.print((char) c);
//	            }
//
//	        } catch (IOException e) {
//	            System.err.println("Error: " + e.getMessage());
//	        }
//	    }
//	}



	// Versión más correcta (control de codificación y más profesional):

//	BufferedReader br =
//	    new BufferedReader(
//	        new InputStreamReader(
//	            new FileInputStream("entrada.txt"), "UTF-8"));