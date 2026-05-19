package Tema_4;

public class Teoria_variasdimensiones {

	public static void main(String[]args) {
//		
//		Scanner sc =  new Scanner(System.in);
//		final int FILA = 2;
//		final int COLUMNA = 4;
		
//		String[] nombres = {"Ivan", "Carlos", "Abel", "Cristofer", "Adrian", "David", "Luis"};
//		
//		System.out.println("Listado de personas en el aula: ");
//		
//		
//		for(int posicion = 0; posicion< nombres.length; posicion++) {
//		System.out.println(nombres[posicion]);
//		}
//		
//		
//			System.out.println("el cuarto nombre: " + nombres[3]);
//			
//		System.out.println("Deme los nombres de los alumnos: ");
//		String nombres2[][]  = new String[FILA][COLUMNA];
//		for (int f = 0; f<FILA; f++)
//			for (int c = 0; c<COLUMNA; c++) {
//			nombres2[f][c]=sc.nextLine();
//			
//			}
//			
//		
//			for (int f = 0; f<FILA; f++)
//				for (int c = 0; c<COLUMNA; c++) {
//				System.out.println(nombres2[f][c]=sc.nextLine() + "\t");
//				}
//			System.out.println();
//			sc.close();
		
		final int DIM3=5;
		final int FIL =2;
		final int COL=3;
		
		int notas[][][] = new int [DIM3][FIL][COL];
		
		for(int t=0; t<DIM3;t++) {
			for(int f=0; f<FIL;f++) {
				for(int c=0; c<COL;c++) {
					notas[0][0][0] = (notas[0][0][0]=((int) Math.random()*1));
				}
			}
		}
	}
}
