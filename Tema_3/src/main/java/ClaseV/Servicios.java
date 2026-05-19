package ClaseV;

import java.time.LocalDate;

public class Servicios {
	
	//atributos necesarios de la clase servicios.
	
	protected double Coste;
	protected String Cuenta;
	protected LocalDate Fecha;
	protected String Nombre;
	protected String Apodo;
	protected boolean Titularidad;
	protected String IBAN;
	
	//constructor de la clase servicios, con sus respectivos atributos.
	
	public Servicios(double Coste, String Nombre, String Apodo, boolean Titularidad, String IBAN, String Cuenta) {
		
		this.Coste = Coste;
		this.Fecha = LocalDate.now();
		this.Nombre = Nombre;
		this.Apodo = Apodo;
		this.Titularidad = Titularidad;
		this.IBAN = IBAN;
		this.Cuenta=Cuenta;
	}

	//setter y getters necesarios.

	public String getCuenta() {
		return Cuenta;
	}

	public void setCuenta(String cuenta) {
		Cuenta = cuenta;
	}

	public double getCoste() {
		return Coste;
	}


	public void setCoste(double coste) {
		Coste = coste;
	}


	public LocalDate getFecha() {
		
		return Fecha;
	}


	public void setFecha(LocalDate fecha) {
		Fecha = fecha;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getApodo() {
		return Apodo;
	}


	public void setApodo(String apodo) {
		Apodo = apodo;
	}


	public boolean getTitularidad() {
		
		return Titularidad;
	}


	public void setTitularidad(boolean titularidad) {
		Titularidad = titularidad;
	}


	public String getIBAN() {
		return IBAN;
	}


	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	
	public String mostrarTitularidad() {
        if (Titularidad) {
            return "ES EL TITULAR";
        } else {
            return "NO ES EL TITULAR";
        }
	}

}
