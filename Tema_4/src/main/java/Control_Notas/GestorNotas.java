package Control_Notas;

public class GestorNotas {
	
	protected Alumno [] notas = new Alumno [20];
	
//	Funcionalidades
//	1. Añadir alumno
//	2. Eliminar alumno por nombre
//	3. Modificar la nota de un alumno
//	4. Mostrar alumnos aprobados (nota ≥ 5)
//	5. Calcular la nota media de la clase
	
	 public boolean anadirAlumno(Alumno alumno) {
	        for (int i = 0; i < notas.length; i++) {
	            if (notas[i] == null) {
	                notas[i] = alumno;
	                return true;
	            }
	        }
	        return false; // biblioteca llena
	    }
	
	 public boolean eliminarAlumno(String nombre) {
	        for (int i = 0; i < notas.length; i++) {
	            if (notas[i] != null && notas[i].getNombre().equals(nombre)) {
	                notas[i] = null;
	                return true;
	            }
	        }
	        return false;
	    }
	 
	 public boolean modNotas(String nombre, double nuevaNota) {
		 for(int i = 0; i <notas.length; i++) {
			 if(notas[i] != null && notas[i].getNombre().equals(nombre)) {
				notas[i].setNota(nuevaNota);
				return true;
			 }
		 }
		 return false;
	 }

	 public void mostrarAlumnos() {
		 boolean hayAlumnos = false;

	        for (Alumno l : notas) {
	            if (l != null) {
	                System.out.println(l);
	                hayAlumnos = true;
	            }
	        }

	        if (!hayAlumnos) {
	            System.out.println("No hay Alumnos registrados.");
	        }
		
	 }

	 public double notaMedia() {
		 double suma = 0; 
		 int contador = 0; 
		 for (Alumno a : notas) { 
			 if (a != null) { 
				 suma += a.getNota(); 
				 contador++; 
				 } 
			 } 
		 if (contador == 0) { 
			 return -1; // no hay alumnos 
			 } return suma / contador; 
			 
	 }

	 public void mostrarAprobados() { 
		 boolean hayAprobados = false;
		 for (Alumno a : notas) { 
			 if (a != null && a.getNota() >= 5) { 
				 System.out.println(a); hayAprobados = true; 
				 } 
			 } if (!hayAprobados) {
				 System.out.println("No hay alumnos aprobados."); 
				 } 
			 }
	 }

