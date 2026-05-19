package com.frayd.dam.Prueba03;

public abstract class Vivienda {

    // Atributos
    // Constantes (para valores por defecto)
    protected static final double PRECIO_BASE = 350000;
    protected static final int PLANTAS_DEFECTO = 1;
    // Propiedades de la vivienda (variables)
    protected int numPlantas;
    protected Planta[] plantas;
    protected double precio;

    // Constructor por defecto
    public Vivienda() {
        this.numPlantas = PLANTAS_DEFECTO;
        this.plantas = new Planta[numPlantas];
        this.precio = PRECIO_BASE;
    }

    // Constructor parametrizado
    public Vivienda(int numPlantas, double precio) {
        this.numPlantas = numPlantas;
        this.plantas = new Planta[numPlantas];
        this.precio = precio;
    }

    // Getters
    public int getNumPlantas() {
        return numPlantas;
    }

    public Planta[] getPlantas() {
        return plantas;
    }

    public double getPrecio() {
        return precio;
    }

    // Método para añadir planta
    public void setPlanta(int index, Planta planta) {
        if (index >= 0 && index < plantas.length) {
            plantas[index] = planta;
        }
    }

    // Cálculo superficie habitable
    public double calcularSuperficieHabitable() {
        double total = 0;
        for (Planta p : plantas) {
            if (p != null) {
                total += p.calcularSuperficiePlanta();
            }
        }
        return total;
    }

    // Cálculo total ventanas
    public int calcularTotalVentanas() {
        int total = 0;
        for (Planta p : plantas) {
            if (p != null) {
                total += p.calcularVentanasPlanta();
            }
        }
        return total;
    }

    // Método abstracto obligatorio
    public abstract double calcularPrecio();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nº de plantas: ").append(numPlantas)
          .append("\nPrecio base: ").append(precio).append(" €");
        for (Planta p : plantas) {
            if (p != null) {
                sb.append("\n").append(p.toString());
            }
        }
        sb.append("\nTotal ventanas: ").append(calcularTotalVentanas());
        sb.append("\nSuperficie habitable: ")
          .append(String.format("%.2f", calcularSuperficieHabitable()))
          .append(" m2");
        return sb.toString();
    }

}
