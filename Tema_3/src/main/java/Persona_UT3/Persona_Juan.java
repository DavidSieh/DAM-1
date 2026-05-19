package Persona_UT3;
import java.util.Scanner;
public class Persona_Juan {
	
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
		int edad;
		double peso;
		double altura;
		
		
		System.out.println("introduce tu DNI" );
		String DNI=sc.next().toLowerCase();
		System.out.println("introduce tu edad " );
		edad=sc.nextInt();
		System.out.println("introduce tu peso " );
		peso=sc.nextDouble();
		System.out.println("introduce tu altura" );
		altura=sc.nextDouble();
		System.out.println("introduce tu sexo" );
		String sexo=sc.next().toLowerCase();
		sc.close();
		
		
		
		Persona p1= new Persona("Juan",0,"71095338S",null,0, 0);
		p1.setNombre("Juan");
		p1.setDNI(DNI);
		p1.setEdad(edad);
		p1.setPeso(peso);
		p1.setAltura(altura);
		p1.setSexo(sexo);
		
		
		System.out.println("----------------------------------------------" );
		System.out.println("mi nombre es " + p1.getNombre());
		System.out.println("mi DNI es " + p1.getDNI());
		System.out.println("mi edad es " + p1.getEdad());
		System.out.println("mi peso es " + p1.getPeso());
		System.out.println("mi altura es " + p1.getAltura());
		System.out.println("mi sexo es " + p1.getSexo());
		System.out.println("----------------------------------------------" );
		System.out.println("el IMC es " + calculoIMC(peso, altura));
		System.out.println("----------------------------------------------" );
		System.out.println( esMayordeEdad(edad));
		System.out.println("----------------------------------------------" );
		System.out.println( generarDNI(DNI));
		
		
		
		//métodos
		
	}  private static String generarDNI(String dNI) {
        int numero = (int) (Math.random() * 90000000) + 10000000; 
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = letras.charAt(numero % 23);
        return numero + String.valueOf(letra);
    }
	private static int esMayordeEdad(int edad) {
		if (edad<18)
			System.out.println("Es menor de edad");
		else if(edad>=18)
			System.out.println("es mayor de edad");
			
		return edad;
	}
	private static double calculoIMC(double peso, double altura) {
		double calculoIMC;
		
		calculoIMC= peso/Math.pow(altura, 2);
		
		if(calculoIMC>=20 && calculoIMC<=25) {
			System.out.println(" 0 " + " peso normal");
		}else if(calculoIMC>25) {
			System.out.println(" 1 " + " sobrepeso");
		}else if(calculoIMC<20) {
			System.out.println(" -1 ");
		}
		return calculoIMC;
	}

}
