package LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	       
		Scanner sc = new Scanner(System.in);

	        // Pedir fecha al usuario.
	        System.out.print("Introduce el día: ");
	        int dia = sc.nextInt();
	        System.out.print("Introduce el mes: ");
	        int mes = sc.nextInt();
	        System.out.print("Introduce el año: ");
	        int anio = sc.nextInt();

	        // Creamos el objeto.
	        LocalDate fechaUsuario = LocalDate.of(anio, mes, dia);
	        System.out.println("La fecha introducida es: " + fechaUsuario.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

	        //Día de la semana
	        DayOfWeek diaSemana = fechaUsuario.getDayOfWeek();
	        System.out.println("El día de la semana es: " + diaSemana);

	        //Fecha dentro de 100 días
	        LocalDate fechaMas100 = fechaUsuario.plusDays(100);
	        System.out.println("La fecha dentro de 100 días será: " + fechaMas100.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

	        //Fecha hace 6 meses
	        LocalDate fechaMenos6Meses = fechaUsuario.minusMonths(6);
	        System.out.println("La fecha hace 6 meses era: " + fechaMenos6Meses.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

	        //Comparación con la fecha actual
	        LocalDate fechaActual = LocalDate.now();
	        if (fechaUsuario.isBefore(fechaActual)) {
	            System.out.println("La fecha introducida es ANTERIOR a la fecha actual.");
	        } else if (fechaUsuario.isEqual(fechaActual)) {
	            System.out.println("La fecha introducida es IGUAL a la fecha actual.");
	        } else {
	            System.out.println("La fecha introducida es POSTERIOR a la fecha actual.");
	        }

	        sc.close();
	    }
	}

