package com.frayd.dam.Tema6_7.Herencia1;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	public static void main (String[]args) {
		
		menu();
		
	}

	
	//Funcionalidades del menu
	
	private static void menu() {
		ArrayList<Figura> figuras = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int opcion;

		do {
		    System.out.println("1. Crear Círculo");
		    System.out.println("2. Crear Cuadrado");
		    System.out.println("3. Crear Rectángulo");
		    System.out.println("4. Crear Triangulo");
		    System.out.println("5. Crear Rombo");
		    System.out.println("6. Mostrar todas las figuras");
		    System.out.println("7. Salir");
		    System.out.print("Opción a elegir: ");

		    opcion = sc.nextInt();

		    switch(opcion) {
		        case 1: crearCirculo(sc,figuras); break;
		        case 2: crearCuadrado(sc,figuras); break;
		        case 3: crearRectangulo(sc,figuras); break;
		        case 4: crearTriangulo(sc,figuras); break;
		        case 5: crearRombo(sc,figuras); break;
		        case 6: mostrarFiguras(figuras); break;
		        case 7: System.out.println("Saliendo..."); break;
		        default: System.out.println("ERROR"); break;
		    }

		} while(opcion != 7);

		sc.close();
	}



	// método para imprimir todos los datos almacenados en la lista
	
	private static void mostrarFiguras(ArrayList<Figura> figuras ) {
		
		for(Figura f : figuras) {
			System.out.println(f);
		}
		
	}
	
	//metodo de creación del rombo.

	private static void crearRombo(Scanner sc, ArrayList<Figura> figuras) {
		
		sc.nextLine();
		
		System.out.println("Introduce el color");
		String Color= sc.nextLine();
		
		System.out.println("Introduce los cm del lado del Rombo");
		double lado = sc.nextDouble();
		
		System.out.println("Introduce los cm de diagonal mayor");
		double diagonalM = sc.nextDouble();
	
		System.out.println("Introduce los cm de diagonal menor");
		double diagonalm = sc.nextDouble();
		
		Rombo nuevo = new Rombo(Color, lado, diagonalM, diagonalm);
		
		figuras.add(nuevo);
		
	}
	
	//metodo de creación del triangulo.

	private static void crearTriangulo(Scanner sc, ArrayList<Figura> figuras) {
		
		sc.nextLine();
		
		System.out.println("Introduce el color");
		String Color= sc.nextLine();
		
		System.out.println("Introduce altura triangulo");
		double altura = sc.nextDouble();
		
		System.out.println("Introduce base triangulo");
		double base = sc.nextDouble();
		
		System.out.println("Introduce los cm del lado del triangulo");
		double lado = sc.nextDouble();
		
		Triangulo nuevo = new Triangulo(Color, altura, base, lado);
		
		figuras.add(nuevo);
		
	}
	
	
	//metodo de creación del Rectangulo.
	private static void crearRectangulo(Scanner sc, ArrayList<Figura> figuras) {
		
		sc.nextLine();
		
		System.out.println("Introduce el color");
		String Color= sc.nextLine();
		
		System.out.println("Introduce altura rectangulo");
		double altura = sc.nextDouble();
		
		System.out.println("Introduce base rectangulo");
		double base = sc.nextDouble();
		
		Rectangulo nuevo = new Rectangulo(Color, base, altura);
		
		figuras.add(nuevo);
		
	}

	
	//metodo de creación de Cuadrado
	private static void crearCuadrado(Scanner sc, ArrayList<Figura> figuras) {
		
		sc.nextLine();
		
		System.out.println("Introduce el color");
		String Color= sc.nextLine();
		
		System.out.println("Introduce los cm del lado del cuadrado");
		double lado = sc.nextDouble();
		
		cuadrado nuevo = new cuadrado(Color, lado);
		
		figuras.add(nuevo);
		
	}

	
	//Metodo de creación del circulo.
	private static void crearCirculo(Scanner sc, ArrayList<Figura> figuras) {
		sc.nextLine();
		System.out.println("Introduce el color");
		String Color= sc.nextLine();
		
		System.out.println("Introduce los cm del diametro del circulo");
		double diametro = sc.nextDouble();
		
		
		circulo nuevo = new circulo(Color, diametro);
		
		figuras.add(nuevo);
		
	}
}

