package LocalDate;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class Ejercicio1 {

	  public static void main(String[] args) {
	        // 1. Fecha de nacimiento usando LocalDate
	        LocalDate fechaNacimiento = LocalDate.of(1999, 11, 24); // <-- aquí pones tu fecha real
	        System.out.println("Mi fecha de nacimiento es: " + fechaNacimiento);

	        // 2. Hora actual usando LocalTime.now()
	        LocalTime horaActual = LocalTime.now();
	        System.out.println("La hora actual es: " + horaActual);

	        // 3. Fecha y hora actuales usando LocalDateTime.now()
	        LocalDateTime fechaHoraActual = LocalDateTime.now();
	        System.out.println("La fecha y hora actuales son: " + fechaHoraActual);
	    }
	}

