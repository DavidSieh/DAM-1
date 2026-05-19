package Reto;

import java.util.Scanner;

public class Ejercicio9 {

public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Introduceun código de envío: ");
	    String matricula = sc.nextLine();

	    // Expresión regular para validar el dni
	    String regex = " ^MRW-ESP-[0-9]{5}-[A-Z]{5}$";
	    String regex2 = "^SEUR-[0-9]{8}-(BCN|MAD|VLN)$";
	    String regex3 = "^DHL-(JP|CN|US)-[0-9]{9}$";
	    
	    
	    //para ver si coincide con los parametros.
	    if (matricula.matches(regex)) {
	        System.out.println("Codigo de envio de MRW");
	    }if (matricula.matches(regex2)){
	    	 System.out.println("codigo de envio de SEUR");
	    }if (matricula.matches(regex3)){
	    	 System.out.println("codigo de DHL");
	    }

	    sc.close();
	}
	}