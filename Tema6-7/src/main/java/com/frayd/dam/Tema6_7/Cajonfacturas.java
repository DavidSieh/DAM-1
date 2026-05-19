package com.frayd.dam.Tema6_7;


import java.util.ArrayList;

public class Cajonfacturas{
	
  private ArrayList<Factura> facturas;

  //constructor
  public Cajonfacturas(){
   this.facturas = new ArrayList<Factura>();
  }

  //anadir una nueva factura --> Mejorar con más controles
  public void anadirFactura(Factura f){
   this.facturas.add(f);
  }

  // buscar una factura
  public Factura buscarFactura(int numero){
	  Factura f = null;
	  boolean encontrado = false;
	  for(int i=0;i<facturas.size() && !encontrado;i++){
	      if (facturas.get(i).getNumero()==numero){
	        f = facturas.get(i);
	        encontrado = true;
	      }
	  }
	  return f;
  }


  public ArrayList<Factura> facturasPendientes(){
   ArrayList<Factura> pendientes = new ArrayList<Factura>();
   for(int i=0;i<facturas.size();i++){
      if (!facturas.get(i).isPagada()){
        pendientes.add(facturas.get(i));
      }
     }
   return pendientes;
  }

 

}
