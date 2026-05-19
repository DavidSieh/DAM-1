package LocalDate;

	import java.time.LocalTime;

	public class ComparadorHoras {

	    public static String compararHoras(LocalTime time1, LocalTime time2) {
	        if (time1.isBefore(time2)) {
	            return "La primera hora (" + time1 + ") es anterior a la segunda (" + time2 + ").";
	        } else if (time1.isAfter(time2)) {
	            return "La segunda hora (" + time2 + ") es anterior a la primera (" + time1 + ").";
	        } else {
	            return "Ambas horas son iguales: " + time1 + ".";
	        }
	    }

	    public static void main(String[] args) {
	        LocalTime h1 = LocalTime.of(9, 30);   // 09:30
	        LocalTime h2 = LocalTime.of(15, 45);  // 15:45

	        System.out.println(compararHoras(h1, h2));
	        System.out.println(compararHoras(h2, h1));
	        System.out.println(compararHoras(h1, h1));
	    }
	}


