package com.frayd.dam.Prueba03;

import java.util.HashSet;
import java.util.Set;

public class Planta {

    // Atributos
    private static final String[] NOMBRES_VALIDOS = {"Bajo", "Primera", "Segunda"}; // constante: array con los nómbres válidos de planta
    private String nombre;
    private Set<Habitacion> habitaciones;

    // Constructor
    public Planta(String nombre) {
        this.nombre = validarNombre(nombre);
        this.habitaciones = new HashSet<>();
    }

    // Validación de nombre
    private String validarNombre(String nombre) {
        for (String n : NOMBRES_VALIDOS) {
            if (n.equalsIgnoreCase(nombre)) {
                return n;
            }
        }
        return "Bajo";
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public Set<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    // Añadir habitación
    public boolean addHabitacion(Habitacion h) {
        return habitaciones.add(h);
    }

    // Eliminar habitación
    public boolean removeHabitacion(Habitacion h) {
        return habitaciones.remove(h);
    }

    // Cálculo superficie
    public double calcularSuperficiePlanta() {
        double total = 0;
        for (Habitacion h : habitaciones) {
            total += h.getSuperficie();
        }
        return total;
    }

    // Cálculo ventanas
    public int calcularVentanasPlanta() {
        int total = 0;
        for (Habitacion h : habitaciones) {
            total += h.getNumVentanas();
        }
        return total;
    }

    // Mostar la información
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planta: ").append(nombre)
          .append(" - Nº habitaciones: ").append(habitaciones.size());
        for (Habitacion h : habitaciones) {
            sb.append("\n  - ").append(h.toString());
        }
        return sb.toString();
    }

}