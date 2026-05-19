package Examen_Tren;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class Gestor_vagones {
	
	
	 private static final String RUTA = "ficheros/vagones.txt";
	 private final static int CANTIDAD = 10;
	 private static int contador = 0;
	 private static Pasajero[] pasajeros = new Pasajero[CANTIDAD];

	
	
	public static void main (String[]args) {
		
		menu();
		
	}


	private static void menu() {
		Scanner sc =  new Scanner(System.in);
		int opcion;
		
	     do {
	            System.out.println("1. Sube pasajero");
	            System.out.println("2. Baja pasajero");
	            System.out.println("3. Guardar información del vagón en el fichero");
	            System.out.println("4. Ver estado del vagón");
	            System.out.println("5. Calcular total obtenido por la venta de billetes");
	            System.out.println("6. salir");
	            
	            opcion = sc.nextInt();
	            sc.nextLine();

	            switch (opcion) {
	                case 1: subir(sc);break;
	                case 2: bajar(sc);break;
	                case 3: guardar();;break;
	                case 4: visualizarVagón();break;
	                case 5: calcularTotalBilletes();break;
	                case 6: System.out.println("Saliendo...");;break;
	            }
	        } while (opcion != 6);

	        sc.close();
	    }
		 
	private static void calcularTotalBilletes() {
	    double total = 0;

	    for (int i = 0; i < contador; i++) {
	        total += pasajeros[i].getBillete();
	    }

	    System.out.println("Total obtenido por la venta de billetes: " + total + " €");
	}



		private static void visualizarVagón() {
		    if (contador == 0) {
		        System.out.println("El vagón está vacío.");
		        return;
		    }


		    for (int i = 0; i < contador; i++) {
		        Pasajero p = pasajeros[i];

		        System.out.println("\nPasajero " + (i + 1));
		        System.out.println("Nombre: " + p.getNombre());
		        System.out.println("Edad: " + p.getEdad());
		        System.out.println("Correo: " + p.getCorreo());
		        System.out.println("Billete final: " + p.getBillete());

		        if (p instanceof Abonado) {
		            Abonado a = (Abonado) p;
		            System.out.println("Tipo: ABONADO (" + a.getTipo() + ")");
		        } else if (p instanceof No_abonado) {
		            No_abonado n = (No_abonado) p;
		            System.out.println("Tipo: NO ABONADO (código descuento: " + n.isCodigo() + ")");
		        }
		    }
		}



		private static void bajar(Scanner sc) {
		    System.out.print("Correo del cliente a eliminar: ");
		    String correo = sc.nextLine();

		    boolean encontrado = false;

		    for (int i = 0; i < contador; i++) {
		        if (pasajeros[i].getCorreo().equalsIgnoreCase(correo)) {
		            encontrado = true;

		            
		            for (int j = i; j < contador - 1; j++) {
		                pasajeros[j] = pasajeros[j + 1];
		            }

		            pasajeros[contador - 1] = null;
		            contador--;

		            System.out.println("Pasajero eliminado correctamente");
		            break;
		        }
		    }

		    if (!encontrado) {
		        System.out.println("No existe ningún pasajero con ese correo");
		    }
		}

	


	private static void subir(Scanner sc) {
		
		   int opcion;
		   do {
	            
	            System.out.println("1. Abonado");
	            System.out.println("2. No abonado");
	            System.out.println("3. Salir");
	            
	            opcion = sc.nextInt();
	            sc.nextLine();

	            switch (opcion) {
	                case 1:   
	                System.out.println("\nAgregando Abonado....");

	                System.out.print("Nombre: ");
	                String nombre = sc.nextLine();

	                System.out.print("Edad: ");
	                int edad = sc.nextInt();
	                sc.nextLine();

	                System.out.print("Correo: ");
	                String correo = sc.nextLine();

	                System.out.print("Precio base del billete(65,55$): ");
	                double billete = sc.nextDouble();
	                sc.nextLine();

	                System.out.print("Tipo de abono (mensual/anual/joven): ");
	                String tipo = sc.nextLine();

	                
	                Abonado a = new Abonado(nombre, edad, correo, billete, tipo);

	                
	                a.calcularPrecioBillete();

	                if (contador < CANTIDAD) {
	                    pasajeros[contador] = a;
	                    contador++;
	                    System.out.println("Abonado subido correctamente. Precio final: " + a.getBillete());
	                } else {
	                    System.out.println("No caben más pasajeros");
	                }
	               
	                break;
	                
	                
	                case 2: 
		                System.out.println("\nAgregando Abonado....");

		                System.out.print("Nombre: ");
		                String nombre1 = sc.nextLine();

		                System.out.print("Edad: ");
		                int edad1 = sc.nextInt();
		                sc.nextLine();

		                System.out.print("Correo: ");
		                String correo1 = sc.nextLine();

		                System.out.print("Precio base del billete: ");
		                double billete1 = sc.nextDouble();
		                sc.nextLine();

		                System.out.print("codigo de descuento (True or false): ");
		                boolean codigo = sc.nextBoolean();

		                
		                No_abonado b = new No_abonado(nombre1, edad1, correo1, billete1, codigo);

		                
		                b.calcularPrecioBillete();

		                if (contador < CANTIDAD) {
		                    pasajeros[contador] = b;
		                    contador++;
		                    System.out.println("Abonado subido correctamente. Precio final: " + b.getBillete());
		                } else {
		                    System.out.println("No caben más pasajeros");
		                }
	                
		                break;
	                
	                case 3: System.out.println("Saliendo...");break;
	            }
	        } while (opcion != 3);
		
	}


	private static void guardar() {
	    FileWriter fw = null;
	    PrintWriter pw = null;

	    try {
	        fw = new FileWriter(RUTA);
	        pw = new PrintWriter(fw);

	        System.out.println("Comenzamos a escribir en el fichero...");

	        for (int i = 0; i < contador; i++) {
	            pw.println(pasajeros[i]); 
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


	}


