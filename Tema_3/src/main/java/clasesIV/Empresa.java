package clasesIV;

public class Empresa {
	
	Directivo D1 = new Directivo("Julio", "45271873F", 25, 40000, 0.10);
	Desarrollador A1 = new Desarrollador("Matías", "67576287X", 45, 16000, true, false, false);
	Desarrollador A2 = new Desarrollador("Mauricio", "898576287X", 35, 16000, false, true, true);
	Desarrollador A3 = new Desarrollador("Matías", "98576287X", 26, 16000, false, true, false);
	Testers B1 = new Testers("Boris", "71095338S", 43, 14000, 3);
	Testers B2 = new Testers("Yorick", "81095338S", 33, 14000, 5);
	public Empresa(Directivo d1, Desarrollador a1, Desarrollador a2, Desarrollador a3, Testers b1, Testers b2) {
		D1 = d1;
		A1 = a1;
		A2 = a2;
		A3 = a3;
		B1 = b1;
		B2 = b2;
	}
	public Directivo getD1() {
		return D1;
	}
	public void setD1(Directivo d1) {
		D1 = d1;
	}
	public Desarrollador getA1() {
		return A1;
	}
	public void setA1(Desarrollador a1) {
		A1 = a1;
	}
	public Desarrollador getA2() {
		return A2;
	}
	public void setA2(Desarrollador a2) {
		A2 = a2;
	}
	public Desarrollador getA3() {
		return A3;
	}
	public void setA3(Desarrollador a3) {
		A3 = a3;
	}
	public Testers getB1() {
		return B1;
	}
	public void setB1(Testers b1) {
		B1 = b1;
	}
	public Testers getB2() {
		return B2;
	}
	public void setB2(Testers b2) {
		B2 = b2;
	}
	public void mostrarSueldos() {
        System.out.println("Sueldos de los empleados:");
        
        if (D1 != null) System.out.println("Directivo con la suma de su bono: "+ (D1.getSueldo() + D1.getBonus()) + "$");
        if (A1 != null) System.out.println("Desarrollador 1 sueldo: " + A1.getSueldo() + "$");
        if (A2 != null) System.out.println("Desarrollador 2 sueldo: " + A2.getSueldo() + "$");
        if (A3 != null) System.out.println("Desarrollador 3 sueldo: " + A3.getSueldo() + "$");
        if (B1 != null) System.out.println("Tester 1 sueldo: " + B1.getSueldo() + "$");
        if (B2 != null) System.out.println("Tester 2 sueldo: " + B2.getSueldo()+ "$");
    }
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Empleados contratados en la empresa:\n" + "\n");

	    if (D1 != null) sb.append(D1.toString()).append("\n");
	    if (A1 != null) sb.append(A1.toString()).append("\n");
	    if (A2 != null) sb.append(A2.toString()).append("\n");
	    if (A3 != null) sb.append(A3.toString()).append("\n");
	    if (B1 != null) sb.append(B1.toString()).append("\n");
	    if (B2 != null) sb.append(B2.toString()).append("\n");

	    return sb.toString();
	}

	
	
}
