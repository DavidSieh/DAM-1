package Rombo;

public class ImplementarRombo {
    
    public static void main(String[] args) {
        Rombo r = new Rombo(10, 6);

        r.mostrarDimensiones();
        System.out.println("Área: " + r.area());
        System.out.println("Perímetro: " + r.perimetro());
        System.out.println("Orientación: " + r.orientacion());

        System.out.println("\nDibujo del rombo:\n");
        r.dibujar();
    }
}

