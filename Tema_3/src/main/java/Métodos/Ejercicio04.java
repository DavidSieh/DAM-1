package Métodos;
import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
        int dia = 0;
        int mes = 0;

        System.out.println("Introduzca un día: ");
        dia = sc.nextInt();

        System.out.println("Introduzca el mes: ");
        mes = sc.nextInt();

        System.out.println("El día corresponde al número: " + calculoFecha(dia, mes));

        sc.close();
    }

    public static int calculoFecha(int dia, int mes) {

        int totalDias = 0;

        for (int i = 1; i < mes; i++) {
            switch (i) {
                case 2:
                    totalDias += 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    totalDias += 30;
                    break;
                default:
                    totalDias += 31;
            }
        }

        totalDias += dia; // añadimos el día del mes actual
        return totalDias;
    }
}
