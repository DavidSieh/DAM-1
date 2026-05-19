package EjerciciosUT3;

public class cuentasambosdatos01 {

	public static void main (String[]args) {
		
		//cuenta con ambos datos
		
		CrearCuenta Cuenta = new CrearCuenta ("José Juanjo Juanjez", (float) 12.34564);
		
		System.out.println("Nombre del Titular:" + Cuenta.gettitular());
		System.out.println("Cantidad depositada:" + Cuenta.getcantidad());
		
	}
}
