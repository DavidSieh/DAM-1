package Ejercicios_Arrays2;

public class Indices_Enteros {
	
	public static void main (String[]args) {
		
		int Org[]= {34,54,12,85,45};
		int Res[]= new int[Org.length];
		
		//función para ordenar todo el array
		
		for(int i = 0; i<=Org.length-1;i++)	{
			int lugar= 0;
			for (int j = 1; j<Org.length;j++){
				if (Org[j]>Org[lugar]) {
					lugar = j;
				
				}
			}
			Res[i] = lugar;
			Org[lugar] = Integer.MIN_VALUE;
		}
		System.out.println("Orden del Array por indices:");
	for (int i=0; i <Org.length; i++) {
		System.out.println(+ Res[i] + "");
		
	}
	
}
}


