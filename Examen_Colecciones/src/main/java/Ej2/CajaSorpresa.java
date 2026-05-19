package Ej2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CajaSorpresa {
	
	private HashMap<Integer, List<String>> cajas;
	
	public CajaSorpresa() {
		cajas=new HashMap<>();
	}

	public HashMap<Integer, List<String>> getCajas() {
		return cajas;
	}

	public void setCajas(HashMap<Integer, List<String>> cajas) {
		this.cajas = cajas;
	}
	
	
	
	//Agregamos las sorpresas en las respectivas cajas.
	public void agregarSorpresa(int idCaja, String Sorpresa) {
		if(cajas.containsKey(idCaja)) {
			cajas.get(idCaja).add(Sorpresa);
		}else {
			ArrayList<String> nuevalista = new ArrayList<>();
			nuevalista.add(Sorpresa);
			cajas.put(idCaja, nuevalista);
		}
		
	}
	
	public void modificarSorpresa(int idCaja, String sorpresaAntigua,String sorpresaActual) {
		if( cajas.containsKey(idCaja)) {
			List<String> lista = cajas.get(idCaja);
			int indice=lista.indexOf(sorpresaAntigua);
			if(indice != -1) {
				lista.set(indice, sorpresaActual);
			}
		}
	}
	
	public void eliminarCaja(int idCaja) {
		cajas.remove(idCaja);
	}

}
