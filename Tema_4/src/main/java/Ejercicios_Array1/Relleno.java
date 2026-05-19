package Ejercicios_Array1;

public class Relleno {
	
	public static void main(String[]args)  {
		
		
		int[][] matriz = new int [5][5];
		int valor = 0;
		
    	//Corrección de lourdes
		for(int a= 0; a<matriz.length;a++) {
			 valor = a;
			boolean hemosllegadoacuatro=false;
			for (int b=0; b<matriz[a].length; b++) {
				matriz[a][b] = valor;
				if(valor ==4){
					hemosllegadoacuatro = true;
				}
				if (hemosllegadoacuatro) {
					valor--;
				}else {
					valor++;
				}
		}
			
		}
		
		for(int a = 0; a<matriz.length;a++) {
			for(int b = 0; b<matriz.length;b++) {
				System.out.print(matriz[a][b] + " ");
			}
			System.out.println();
		}
			
	}

}
