package LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce el día: ");
		int fecha=sc.nextInt();
		
		System.out.println("introduce las horas: ");
		int horas=sc.nextInt();
		sc.close();
		
		LocalDateTime Prueba = LocalDateTime.of(2025, 11, fecha, horas, 1, 1);
		
		System.out.println("la hora actual introducida es: " + Prueba +"\nel resultado sumando 3 días y 4 horas: " + Prueba.plusDays(3).plusHours(4));
		
		//mostrar la nueva fecha
		System.out.println("La nueva fecha es: " + Prueba);
		
		//mostrar datos separados
		System.out.println("El año: " +Prueba.getYear());
		System.out.println("El mes: " +Prueba.getMonth());
		System.out.println("El día: " +Prueba.getDayOfWeek());
		System.out.println("El hora: " +Prueba.getHour());
		System.out.println("El minutos: " +Prueba.getMinute());
		System.out.println("El segundos: " +Prueba.getSecond());
	}
}
