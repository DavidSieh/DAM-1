package FrayDiegoTadeo.UT04;

import java.util.Scanner;

public class UT04 {
	  
	
	
	public static void main(String[] args) {
		
		
		//scanner para que funcione el menuç
		
	        Scanner sc = new Scanner(System.in);
	        int A;
	        
	        //almacen de String builder y asignamos un resultado
	        String ejemplo;
	        StringBuilder sb = new StringBuilder("Hola Mundo");
	        
	        
	        
	        //menu para la selección e explicación de todos los ejemplos.

	        do {
	            System.out.println("-----------------MENU----------------");
	            System.out.println("1.append()");
	            System.out.println("2.insert()");
	            System.out.println("3.reverse()");
	            System.out.println("4.capacity()");
	            System.out.println("5.insert(int, Object)");
	            System.out.println("6.ensureCapacity");
	            System.out.println("7.trimTosize()");
	            System.out.println("8.setLength()");
	            System.out.println("9.indexOf()");
	            System.out.println("10.appendCodePoint()");
	            System.out.println("11.codePointAt");
	            System.out.println("12.offsetByCodePoints()");
	            System.out.println("13.getChars()");
	            System.out.println("14.chars()");
	            System.out.println("15.setLength (limpiar contenido)");
	            System.out.println("0.Salir");
	            A = sc.nextInt();

	            switch (A) {
	                case 1:
	                    System.out.println("append(): Agrega texto al final del contenido.");
	                    sb.append("!");
	                    ejemplo = sb.toString();
	                    System.out.println("Ejemplo: " + ejemplo);
	                    break;
	                case 2:
	                    System.out.println("insert(): Inserta texto en una posición específica.");
	                    sb.insert(4, " Java");
	                    ejemplo = sb.toString();
	                    System.out.println("Ejemplo: " + ejemplo);
	                    break;
	                case 3:
	                    System.out.println("reverse(): Invierte el contenido del StringBuilder.");
	                    sb.reverse();
	                    ejemplo = sb.toString();
	                    System.out.println("Ejemplo: " + ejemplo);
	                    break;
	                case 4:
	                    System.out.println("capacity(): Devuelve la capacidad actual (espacio asignado).");
	                    ejemplo = "Capacidad actual del String: " + sb.capacity();
	                    System.out.println(ejemplo);
	                    break;
	                case 5:
	                    System.out.println("insert(int, Object): Inserta cualquier objeto usando toString().");
	                    sb.insert(0, "OBJETO");
	                    ejemplo = sb.toString();
	                    System.out.println("Ejemplo: " + ejemplo);
	                    break;
	                case 6:
	                    System.out.println("ensureCapacity(): Asegura una capacidad mínima.");
	                    sb.ensureCapacity(50);
	                    ejemplo = "Capacidad mínima asegurada que le asignamos: " + sb.capacity();
	                    System.out.println(ejemplo);
	                    break;
	                case 7:
	                    System.out.println("trimToSize(): Reduce la capacidad para que coincida con la longitud actual.");
	                    sb.trimToSize();
	                    ejemplo = "Capacidad ajustada: " + sb.capacity();
	                    System.out.println(ejemplo);
	                    break;
	                case 8:
	                    System.out.println("setLength(): Cambia la longitud del contenido.");
	                    sb.setLength(5);
	                    ejemplo = sb.toString();
	                    System.out.println("Ejemplo: " + ejemplo);
	                    break;
	                case 9:
	                    System.out.println("indexOf(): Devuelve la posición de la primera aparición de un texto.");
	                    int pos = sb.indexOf("Java");
	                    ejemplo = "Posición de 'Java': " + pos;
	                    System.out.println(ejemplo);
	                    break;
	                case 10:
	                    System.out.println("appendCodePoint(): Agrega un carácter Unicode usando su código.");
	                    sb.appendCodePoint(65); // 'A'
	                    ejemplo = sb.toString();
	                    System.out.println("Ejemplo: " + ejemplo);
	                    break;
	                case 11:
	                    System.out.println("codePointAt(): Devuelve el valor Unicode del carácter en una posición.");
	                    int code = sb.codePointAt(0);
	                    ejemplo = "Unicode en posición 0: " + code;
	                    System.out.println(ejemplo);
	                    break;
	                case 12:
	                    System.out.println("offsetByCodePoints(): Calcula un índice basado en puntos de código Unicode.");
	                    int idx = sb.offsetByCodePoints(0, 2);
	                    ejemplo = "Índice desplazado: " + idx;
	                    System.out.println(ejemplo);
	                    break;
	                case 13:
	                    System.out.println("getChars(): Copia caracteres del StringBuilder a un arreglo.");
	                    char[] arr = new char[10];
	                    sb.getChars(0, Math.min(sb.length(), 10), arr, 0); //lo pillamos de la API directamente para tener un ejemplo funcional
	                    ejemplo = new String(arr);
	                    System.out.println("Ejemplo: " + ejemplo);
	                    break;
	                case 14:
	                    System.out.println("chars(): Devuelve un stream de caracteres.");
	                    System.out.print("Ejemplo: ");
	                    sb.chars().forEach(c -> System.out.print((char) c));
	                    System.out.println();
	                    break;
	                case 15:
	                    System.out.println("setLength(0): Forma rápida de vaciar el StringBuilder.");
	                    sb.setLength(0);
	                    ejemplo = sb.toString();
	                    System.out.println("Ejemplo: '" + ejemplo + "'");
	                    break;
	            }

	        } while (A != 0);

	        System.out.println("SALIENDO........");
	        sc.close();
	    }
	}

