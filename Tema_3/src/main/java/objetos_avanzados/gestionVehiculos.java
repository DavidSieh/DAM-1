package objetos_avanzados;

public class gestionVehiculos {

	
	public static void main(String[]args) {
		
		Vehiculo v1= new Vehiculo("747623","Mercedes","Gris","V1",50,true);
		v1.setMatricula("L9865376X");
		v1.setDisponible(true);
		v1.setMarca("Mercedes");
		v1.setModelo("V1");
		v1.setTarifa(50);
		v1.getColor("Gris");
		
		
		System.out.println("El vehiculo que tenemos disponible es: " + v1.getMarca());
		System.out.println("Su color es: " + v1.setColor());
		System.out.println("El modelo es: " + v1.getModelo());
		System.out.println("Esta dispoble: " + v1.getDisponible());
		System.out.println("La matricula es: " + v1.getMatricula());
		System.out.println("Su coste de alquiler es: " + v1.getTarifa() + "$, por semana.");
	
	}
}
