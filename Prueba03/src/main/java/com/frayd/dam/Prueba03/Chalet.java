package com.frayd.dam.Prueba03;

public class Chalet extends Vivienda {

    // Atributos
    private static final double PRECIO_METRO = 750; // para valor por defecto
    private double metrosParcela;
    private boolean buhardilla;

    // Constructor por defecto
    public Chalet() {
        super();
        this.metrosParcela = 0;
        this.buhardilla = false;
    }

    // Constructor parametrizado
    public Chalet(int numPlantas, double precio, double metrosParcela, boolean buhardilla) {
        super(numPlantas, precio);
        this.metrosParcela = metrosParcela;
        this.buhardilla = buhardilla;
    }

    // Getters
    public double getMetrosParcela() {
        return metrosParcela;
    }

    public boolean isBuhardilla() {
        return buhardilla;
    }

    // Cálculo precio (CLAVE DEL EJERCICIO)
    @Override
    public double calcularPrecio() {
        return this.precio + (calcularSuperficieHabitable() * PRECIO_METRO);
    }

    // Mostrar los datos del Chalet
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== CHALET ===\n");
        sb.append(super.toString());
        sb.append("\nMetros de parcela: ").append(metrosParcela);
        sb.append("\nBuhardilla: ").append(buhardilla ? "Sí" : "No");
        sb.append("\nPrecio total: ").append(calcularPrecio()).append(" €");
        return sb.toString();
    }

}