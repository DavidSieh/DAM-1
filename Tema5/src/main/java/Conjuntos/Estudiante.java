package Conjuntos;
	
import java.time.LocalDate; 
import java.time.Period; 
import java.util.ArrayList; 

public class Estudiante { 
	private String numMatricula; 
	private String nombre; 
	private LocalDate fNacimiento; 
	private ArrayList<Double> notas; 
	
	public Estudiante(String numMatricula, String nombre, LocalDate fNacimiento) { 
		this.numMatricula = numMatricula; 
		this.nombre = nombre; 
		this.fNacimiento = fNacimiento; 
		this.notas = new ArrayList<>(); 
		} 
	
	public String getNumMatricula() { 
		return numMatricula; 
		} 
	
	public String getNombre() { 
		return nombre; 
		}
	
	public LocalDate getfNacimiento() { 
		return fNacimiento; 
		} 
	
	public int getEdad() { 
		return Period.between(fNacimiento, LocalDate.now()).getYears(); 
	} 
	
	public void agregarNota(double nota) { 
		notas.add(nota); 
		
	} 
	
	public double calcularPromedio() { 
		if (notas.isEmpty()) return 0.0; 
		double suma = 0; for (double n : notas) suma += n; 
		return suma / notas.size(); 
		} 
	
	@Override 
	public String toString() { 
		return nombre + " (" + numMatricula + "), Edad: " + getEdad(); 
		} 
	}
