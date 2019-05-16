import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Main {

	public void testSuma() {
		System.out.println("Suma de enteros...");
		Suma s = new Suma(3,2);
		assertTrue(s.Sumar() == 5);
	}
	
	public void testResta() {
		System.out.println("Resta de enteros...");
		Resta r = new Resta(3,2);
		assertTrue(r.Restar() == 1);
	}
	
	public void testDivision() {
		System.out.println("Division de enteros...");
		Division d = new Division(6,2);
		assertTrue(d.Dividir() == 3);
	}
	
	public void testMultiplicacion() {
		System.out.println("Multiplicacion de enteros");
		Multiplicacion m = new Multiplicacion(3,2);
		assertTrue(m.Multiplicar() == 3);
	}

	
	
}
