package Herencia_Ejercicio2;

public class App {


public static void main(String[]args) {
	
	Bicicleta B1 = new Bicicleta("Roja", "Modelo B1", 700, "Petronas", "Vinilo", 6);
	Coche C1 = new Coche("negro", "Cactur", 15000, "Renault", 2000, "Diesel", 4);
	Moto M1 = new Moto("Amarilla", "HArvey", 16000, "Mercedes", 2000, "Diesel", "2");
	Patinete P1 = new Patinete("Gris", "Marca", 200, "PAtines Jaime", "Acero", 2); 
	
	System.out.println(B1);
	System.out.println(C1);
	System.out.println(M1);
	System.out.println(P1);
	
}

}
