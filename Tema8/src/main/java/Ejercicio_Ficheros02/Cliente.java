package Ejercicio_Ficheros02;

import java.io.Serializable;


//12.- En un comercio desean mantener los datos de sus clientes. 
//Implementar una aplicación que permita guardar y recuperar los datos de los clientes. 
//Para ello, definir la clase Cliente, que tendrá los siguientes atributos: 
//id: identificador de cliente (entero).

public class Cliente implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
    private String nombre;
    private String telefono;

    public Cliente(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    @Override
    public String toString() {
        return id + " - " + nombre + " - " + telefono;
    }
}