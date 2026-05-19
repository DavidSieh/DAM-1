package LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class ejercicio3 {
	
	public static void main (String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduce la hora: ");
		int hora=sc.nextInt();
		
		System.out.println("introduce los minutos: ");
		int minutos=sc.nextInt();
		sc.close();
		// Suma 90 mintos y muestra el resultado
		
		LocalTime horaUsuario = LocalTime.of(hora, minutos);
		
		
		System.out.println("la hora actual introducida es: " + horaUsuario +"\nel resultado menos 90 minutos: " + horaUsuario.minusMinutes(90));
		
		//restar 2 horas.
		
		System.out.println("La hora restando 2 horas: " + horaUsuario.minusHours(2));
		
		//Indicar si la fecha antes o despues del Scanner.
		
		
		
		if(horaUsuario.isBefore(horaUsuario))
		System.out.println("La hora es antes del Scanner.");
		else
			System.out.println("La hora es anterior");
	}

}
