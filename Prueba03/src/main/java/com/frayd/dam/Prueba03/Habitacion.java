package com.frayd.dam.Prueba03;

import java.util.Objects;

public class Habitacion {

    // Atributos
    private String nombre;
    private double superficie;
    private int numVentanas;

    // Constructor completo
    public Habitacion(String nombre, double superficie, int numVentanas) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.numVentanas = numVentanas;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getNumVentanas() {
        return numVentanas;
    }

    // equals y hashCode, basados SOLO en nombre
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Habitacion)) return false;
        Habitacion that = (Habitacion) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    // Mostrar la información
    @Override
    public String toString() {
        return nombre +
                " (superficie: " + superficie +
                " m2, ventanas: " + numVentanas + ")";
    }

}
