package Conjuntos;
import java.util.Comparator;

	public class ComparadorPorEdad implements Comparator<Estudiante> {
	    @Override
	    public int compare(Estudiante e1, Estudiante e2) {
	        int comp = Integer.compare(e1.getEdad(), e2.getEdad());
	        if (comp == 0) {
	            return e1.getNumMatricula().compareTo(e2.getNumMatricula());
	        }
	        return comp;
	    }
	}

