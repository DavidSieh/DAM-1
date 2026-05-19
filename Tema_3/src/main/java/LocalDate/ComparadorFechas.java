package LocalDate;

	import java.time.LocalDate;

	public class ComparadorFechas {

	    public static String compararFechas(LocalDate date1, LocalDate date2) {
	        if (date1.isBefore(date2)) {
	            return "La primera fecha "  + date1 + " es anterior a la segunda " + date2;
	        } else if (date1.isAfter(date2)) {
	            return "La segunda fecha " + date2 + " es anterior a la primera " + date1 ;
	        } else {
	            return "Ambas fechas son iguales: " + date1 + ".";
	        }
	    }

	    public static void main(String[] args) {
	        LocalDate f1 = LocalDate.of(2025, 11, 24);
	        LocalDate f2 = LocalDate.of(2025, 11, 30);

	        System.out.println(compararFechas(f1, f2));
	        System.out.println(compararFechas(f2, f1));
	        System.out.println(compararFechas(f1, f1));
	    }
	}

