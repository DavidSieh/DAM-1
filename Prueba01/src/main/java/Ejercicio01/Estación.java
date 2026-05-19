package Ejercicio01;
import java.util.Scanner;
public class Estación {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("introduce un mes");
		String mes=sc.nextLine().toLowerCase();
	
		
		
				switch(mes) {
				case "diciembre":System.out.println("otoño");;break;
				case "enero":System.out.println("invierno");;break;
				case "febrero":System.out.println("invierno");;break;
				case "marzo":System.out.println("Verano");;break;
				case "abril":System.out.println("primavera");;break;
				case "mayo":System.out.println("primavera");;break;
				case "junio":System.out.println("primavera");;break;
				case "julio":System.out.println("verano");;break;
				case "agosto":System.out.println("verano");;break;
				case "septiembre":System.out.println("otoño");;break;
				case "octubre":System.out.println("otoño");;break;
				case "noviembre":System.out.println("otoño");;break;
				default: System.out.println("ERROR");break;
				}
				
				sc.close();
	}
}
