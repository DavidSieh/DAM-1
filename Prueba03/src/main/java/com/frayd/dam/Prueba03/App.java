package com.frayd.dam.Prueba03;

public class App {

    public static void main(String[] args) {

        // =====================================================
        // 1️.- CREAR HABITACIONES
        // =====================================================
        Habitacion h1 = new Habitacion("Salón", 30, 3);
        Habitacion h2 = new Habitacion("Cocina", 15, 1);
        Habitacion h3 = new Habitacion("Dormitorio", 20, 2);
        Habitacion h4 = new Habitacion("Baño", 10, 1);

        Habitacion h5 = new Habitacion("Dormitorio 2", 25, 2);
        Habitacion h6 = new Habitacion("Baño 2", 12, 1);

        // =====================================================
        // 2️.- CREAR PLANTAS
        // =====================================================
        Planta plantaBaja = new Planta("Bajo");
        plantaBaja.addHabitacion(h1);
        plantaBaja.addHabitacion(h2);

        Planta plantaPrimera = new Planta("Primera");
        plantaPrimera.addHabitacion(h3);
        plantaPrimera.addHabitacion(h4);

        Planta plantaSegunda = new Planta("Segunda");
        plantaSegunda.addHabitacion(h5);
        plantaSegunda.addHabitacion(h6);

        // =====================================================
        // 3️.- CREAR CHALET
        // =====================================================
        Chalet chalet = new Chalet(2, 350000, 300, true);
        chalet.setPlanta(0, plantaBaja);
        chalet.setPlanta(1, plantaPrimera);

        // =====================================================
        // 4️.- CREAR ADOSADO
        // =====================================================
        Adosado adosado = new Adosado(2, 350000, true);
        adosado.setPlanta(0, plantaBaja);
        adosado.setPlanta(1, plantaSegunda);

        // =====================================================
        // 5️.- MOSTRAR VIVIENDAS
        // =====================================================
        System.out.println("===== VIVIENDAS =====\n");

        mostrarVivienda(chalet);
        mostrarVivienda(adosado);

        // =====================================================
        // 6️.- PROBAR HABITACIÓN DUPLICADA
        // =====================================================
        System.out.println("\n===== PRUEBA DUPLICADOS =====");

        Habitacion duplicada = new Habitacion("Salón", 50, 5);

        boolean añadida = plantaBaja.addHabitacion(duplicada);

        System.out.println("Intentando añadir habitación 'Salón' duplicada...");
        System.out.println("¿Se ha añadido? " + añadida);

        // =====================================================
        // 7️.- ELIMINAR HABITACIÓN
        // =====================================================
        System.out.println("\n===== ELIMINAR HABITACIÓN =====");

        boolean eliminada = plantaPrimera.removeHabitacion(h4);

        System.out.println("Eliminando 'Baño' de planta primera...");
        System.out.println("¿Se ha eliminado? " + eliminada);

        // =====================================================
        // 8️.- MOSTRAR DE NUEVO
        // =====================================================
        System.out.println("\n===== VIVIENDAS ACTUALIZADAS =====\n");

        mostrarVivienda(chalet);
    }

    // =====================================================
    // MÉTODO AUXILIAR
    // =====================================================
    public static void mostrarVivienda(Vivienda v) {

        System.out.println(v.toString());

        System.out.println("→ Total ventanas: " + v.calcularTotalVentanas());
        System.out.println("→ Superficie habitable: "
                + String.format("%.2f", v.calcularSuperficieHabitable()) + " m2");

        System.out.println("-----------------------------------\n");
    }
    
}