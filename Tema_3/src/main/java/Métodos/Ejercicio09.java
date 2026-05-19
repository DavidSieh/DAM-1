package Métodos;
import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[]args){
		int mes,anio;

		Scanner sc=new Scanner(System.in);
		do{
			System.out.print("Escribe el mes:");
			mes=sc.nextInt();                 //pedimos el mes
		}while(mes<1 || mes>12);

		System.out.print("Escribe el anio:");
		anio=sc.nextInt();              //pedimos el anio
		sc.close();

		calendario(mes,anio);  // llamamos al metodo calendario para que haga el trabajo

	}

	// metodo que escribe el calendario en pantalla
	public static void calendario(int mes,int anio){
		
		
		String nombreMes="";
		switch (mes){ // switch para poner el nombre del mes
			case 1:nombreMes="Enero";
			break;
			case 2:nombreMes="Febrero";
			break;
			case 3:nombreMes="Marzo";
			break;
			case 4:nombreMes="Abril";
			break;
			case 5:nombreMes="Mayo";
			break;
			case 6:nombreMes="Junio";
			break;
			case 7:nombreMes="Julio";
			break;
			case 8:nombreMes="Agosto";
			break;
			case 9:nombreMes="Septiembre";
			break;
			case 10:nombreMes="Octubre";
			break;
			case 11:nombreMes="Noviembre";
			break;
			case 12:nombreMes="Diciembre";
			break;
		}

		// escribimos el encabezado
		System.out.println("\n\t   "+nombreMes+"   "+anio);
		System.out.println("\n    L    M    M    J    V    S    D");



		int diasMes=diasQueTieneElMes(mes, anio); //averiguo cuantos dias tien el mes;


		int diaSemana=diaComienzoMes(mes,anio); // usamos el metodo para averiguar en
		// que dia comienza el mes
		
		// Desplazo el cursor para que comience en el dia adecuado
		if (diaSemana==0) {
			diaSemana=7; //si el dia es domingo lo cambiamos por 7
		}
		
		for(int i=1;i<diaSemana;i++){
			System.out.print("     ");
		}

		// Bucle que imprime los dias que tenga el mes
		for(int i=1;i<=diasMes;i++){

			if(i<10)   //escribimos el dia: si es de una cifra ponemos un espacio mas
				System.out.print("    "+i);
			else
				System.out.print("   "+i);
			
			diaSemana++; // cuando escribimos un dia avanzamos el dia de la semana
			
			if (diaSemana==8){ // Si nos hemos pasado del domingo
							   // pongo dia a lunes y cambiamos de linea
				diaSemana=1;
				System.out.println();
			}

		}

	}

	// metodo que averigua si un anio es bisiesto
	public static boolean bisiesto(int anio){
		return (anio%4==0 && anio%100!=0)||(anio%400==0);
	}

	// metodo que calcula en que dia de la semana comienza un mes.
	// retorna un valor de 0 a 6    0-domingo, 1-lunes, 2-martes,...,6-sabado
	public static int diaComienzoMes(int mes,int anio){
		if(mes<=2)
			return (anio+31*(mes-1)+(anio-1)/4-3*((anio+99)/100)/4)%7;
		else
			return (anio+31*(mes-1)-(4*mes+23)/10+anio/4-(3*(anio/100+1))/4)%7;
	}
	
	//metodo que nos retorna cuantos dias tiene el mes
	public static int diasQueTieneElMes(int mes,int anio){
		
		switch(mes){  // switch para averiguar cuantos dias tiene el mes
		case 2:
			if(bisiesto(anio))  // tenemos cuidado de si el anio es bisiesto
			return 29;
		else
			return 28;
		
		case 4:
		case 6:
		case 9:
		case 11:return 30;
		
		default:return 31;
		}
	}

}

