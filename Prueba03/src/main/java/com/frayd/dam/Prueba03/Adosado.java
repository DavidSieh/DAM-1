package com.frayd.dam.Prueba03;

public class Adosado extends Vivienda {

    // Atributos
    private static final double PRECIO_METRO = 350; // constante, para valor por defeto
    private boolean garaje;

    // Constructor por defecto
    public Adosado() {
        super();
        this.garaje = true;
    }

    // Constructor parametrizado
    public Adosado(int numPlantas, double precio, boolean garaje) {
        super(numPlantas, precio);
        this.garaje = garaje;
    }

    // Getter
    public boolean isGaraje() {
        return garaje;
    }

    // Cálculo precio
    @Override
    public double calcularPrecio() {
        return this.precio + (calcularSuperficieHabitable() * PRECIO_METRO);
    }

    // Mostrar los datos del Adosado
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== ADOSADO ===\n");
        sb.append(super.toString());
        sb.append("\nGaraje: ").append(garaje ? "Sí" : "No");
        sb.append("\nPrecio total: ").append(calcularPrecio()).append(" €");
        return sb.toString();
    }

}
