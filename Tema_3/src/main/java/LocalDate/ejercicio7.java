package LocalDate;
import java.time.format.DateTimeFormatter;
public class ejercicio7 {

	public static void main(String[]args) {
		
		DateTimeFormatter fecha= DateTimeFormatter.ISO_LOCAL_DATE;
		
		System.out.println("La fecha actual es: " + fecha);
	}
}
