package com.frayd.dam.Prueba02_3P;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorSuper {
	
	 private static final String RUTA = "datos/seccion.dat";
	 private final static int CANTIDAD = 10;
	 private static int contador = 0;
	 private static Producto[] hueco = new Producto[CANTIDAD];
	 @SuppressWarnings("unused")
	private static ArrayList<Producto> Producto = new ArrayList<>();
	 
	 protected static void menu() {
			Scanner sc =  new Scanner(System.in);
			int opcion;
			
		     do {
		            System.out.println("1. Añadir Producto");
		            System.out.println("2. Retirar Producto");
		            System.out.println("3. Guardar información");
		            System.out.println("4. Mostrar datos almacenados en fichero binario");
		            System.out.println("5. Salir de la app");
		            System.out.print("Opcion: ");
		            
		            opcion = sc.nextInt();
		            sc.nextLine();

		            switch (opcion) {
		                case 1: anadirProducto(sc);break;
		                case 2: retirarProducto(sc);break;
		                case 3: guardar();;break;
		                case 4: mostrarDatosFichero();break;
		                case 5: System.out.println("Saliendo...");;break;
		            }
		        } while (opcion != 5);

		        sc.close();
		    }


	 private static void mostrarDatosFichero() {
		    if (contador == 0) {
		        System.out.println("El alamacen está vacío.");
		        return;
		    }


		    for (int i = 0; i < contador; i++) {
		        Producto p = hueco[i];

		        System.out.println("\nPasajero " + (i + 1));
		        System.out.println("Nombre: " + p.getNombre());
		        System.out.println("Edad: " + p.getCodigo());
		        System.out.println("Correo: " + p.getPrecio());
		        System.out.println("Billete final: " + p.getSeccion());

		        if (p instanceof Perecedero) {
		            Perecedero a = (Perecedero) p;
		            System.out.println("Tipo: PERECEDERO (" + a.getCaducidad() + ")");
		        } else if (p instanceof noPerecedero) {
		        	noPerecedero n = (noPerecedero) p;
		            System.out.println("Tipo: NO PERECDERO (código descuento: " + n.getDescuento() + ")");
		        }
		    }
		}


		private static void guardar() {
		    FileWriter fw = null;
		    PrintWriter pw = null;

		    try {
		        fw = new FileWriter(RUTA);
		        pw = new PrintWriter(fw);

		        System.out.println("Comenzamos a escribir en el fichero...");

		        for (int i = 0; i < contador; i++) {
		            pw.println(hueco[i]); 
		        }

		    } catch (IOException e) {
		        e.printStackTrace();
		    } finally {
		        try {
		            if (pw != null) pw.close();
		            if (fw != null) fw.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		}


	 private static void retirarProducto(Scanner sc) {
		   System.out.print("Codigo del Producto a eliminar: ");
		    String codigo = sc.nextLine();
		    
		    int codigo1 = Integer.parseInt(codigo);

		    boolean encontrado = false;

		    for (int i = 0; i < contador; i++) {
		        if (hueco[i].getCodigo() == codigo1) {
		            encontrado = true;
		            
		            
		            for (int j = i; j < contador - 1; j++) {
		                hueco[j] = hueco[j + 1];
		            }

		            hueco[contador - 1] = null;
		            contador--;

		            System.out.println("Producto eliminado correctamente");
		            break;
		        }
		    }

		    if (!encontrado) {
		        System.out.println("No existe ningún producto con ese codigo");
		    }
	}


	 private static void anadirProducto(Scanner sc){
		   int opcion;
		  
		   do {
	            
	            System.out.println("1. Perecedero");
	            System.out.println("2. No Perecedero");
	            System.out.println("3. Salir");
	            
	            opcion = sc.nextInt();
	            sc.nextLine();

	           
	            switch (opcion) {
	                case 1:   
	                	
	                System.out.println("\nAgregando Producto Perecedero....");

	                System.out.print("Nombre: ");
	                String nombre = sc.nextLine();

	                System.out.print("Codigo (9 digitos lo he hecho con enteros ): ");
	                String codigo = sc.nextLine();
	                
	                
	                System.out.print("Precio base del producto(3.99$): ");
	                String precio = sc.nextLine();

	                System.out.print("Sección: ");
	                String Seccion = sc.nextLine();
	                
	                
	                System.out.print("Caducidad (2026-05-13 por defecto): ");
	                String Caducidad = sc.nextLine();
	                

	                
	                int codigo1 = Integer.parseInt(codigo);
	                double precio1 = Double.parseDouble(precio);
	                LocalDate Fecha1 = LocalDate.parse(Caducidad);
	                
	                Perecedero a = new Perecedero(nombre, codigo1, precio1, Seccion, Fecha1);

	                
	                a.calcularPrecioFinal();

	                if (contador < CANTIDAD) {
	                    hueco[contador] = a;
	                    contador++;
	                    System.out.println("Producto añadido correctamente. Precio final: " + a.getPrecio());
	                } else {
	                    System.out.println("No caben más productos");
	                }
	               
	                break;
	                
	             
	                case 2: 
		                System.out.println("\nAgregando No Perecedero....");

		                System.out.print("Nombre: ");
		                String nombre1 = sc.nextLine();
		                
		                
		                System.out.print("Codigo (9 digitos lo he hecho con enteros ): ");
		                String codigo2 = sc.nextLine();
		                sc.nextLine();
		                
		                System.out.print("Precio base del billete(3.99$): ");
		                String precio2 = sc.nextLine();

		                System.out.print("Sección: ");
		                String Seccion1 = sc.nextLine();
		                sc.nextLine();

		                System.out.print("codigo de descuento (introducir false): ");
		                String descuento = sc.nextLine();

		                int codigo3 = Integer.parseInt(codigo2);
		                double precio3 = Double.parseDouble(precio2);
		                boolean descuento1 = descuento.contains("false");
		                
		                
		                noPerecedero b = new noPerecedero(nombre1, codigo3, precio3, Seccion1, descuento1);
		                
		                
		                b.calcularPrecioFinal();

		                if (contador < CANTIDAD) {
		                    hueco[contador] = b;
		                    contador++;
		                    System.out.println("No Perecedero añadido correctamente. Precio final: " + b.getPrecio());
		                } else {
		                    System.out.println("No caben más Productos");
		                }
		                
	                
		                break;
	                
	                case 3: System.out.println("Saliendo...");break;
	            }
	         
	        	
	        
		   }while (opcion != 3);
		
	 }
	 
	 

	

}
