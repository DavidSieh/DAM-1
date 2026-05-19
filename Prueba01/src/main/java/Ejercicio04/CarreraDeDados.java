package Ejercicio04;
import java.util.Random;
import java.util.Scanner;
public class CarreraDeDados {
	
	public static void main(String[]args) {
		
		double n =  Math.random();
		Scanner sc=new Scanner(System.in);
		
		double jugador=0;
		double maquina=0;
		
	
		System.out.println("Bienvenido a la Carrera de Dados, ¿Listo para jugar?");
	

          
		 while (jugador < 30 && maquina < 30) {

	            // Turno del jugador
	            int tiroJugador = (int)(Math.random() * 6) + 1;
	            jugador += tiroJugador;
	            System.out.println("Jugador tira: " + tiroJugador + " | Total: " + jugador);

	            if (jugador >= 30) break;

	            // Turno de la máquina
	            int tiroMaquina = (int)(Math.random() * 6) + 1;
	            maquina += tiroMaquina;
	            System.out.println("Máquina tira: " + tiroMaquina + " | Total: " + maquina);
	            
	           
	            sc.nextLine();
	        }

	        if (jugador >= 30) {
	            System.out.println("¡El jugador ha ganado!");
	        } else {
	            System.out.println("¡La máquina ha ganado!");
	        }

	        sc.close();
	    }
	}
	



