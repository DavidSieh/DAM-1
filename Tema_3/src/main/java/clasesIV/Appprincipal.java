package clasesIV;

public class Appprincipal {

	public static void main(String[]args) {
		
		
		// empleados
		
		
		Directivo D1 = new Directivo("Julio", "45271873F", 25, 40000, 0.10);
		Desarrollador A1 = new Desarrollador("Matías", "67576287X", 45, 16000, true, false, false);
		Desarrollador A2 = new Desarrollador("Mauricio", "898576287X", 35, 16000, false, true, true);
		Desarrollador A3 = new Desarrollador("Matías", "98576287X", 26, 16000, false, true, false);
		Testers B1 = new Testers("Boris", "71095338S", 43, 14000, 3);
		Testers B2 = new Testers("Yorick", "81095338S", 33, 14000, 5);
		
		//empresa
		Empresa E1 = new Empresa(D1, A1, A2, A3, B1, B2);
		
		
        System.out.println(E1.toString());
        E1.mostrarSueldos();
		
	}
}
