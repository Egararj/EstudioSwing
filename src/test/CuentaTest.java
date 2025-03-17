package test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import modelo.Cuenta;

class CuentaTest {
	
	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	@Test
	void testNombreCuenta() {
		// Cuenta cuenta=new Cuenta();
		// cuenta.setPersona("Pepe");
		Cuenta cuenta = new Cuenta("Pepe", new BigDecimal("1000.12345"));
		String esperado = "Pepe";
		
		String real = cuenta.getPersona();
		assertNotNull(real);
		// Assertions.assertEquals(esperado, real);
		assertEquals(esperado, real);
		assertTrue(real.equals("Pepe"));

	}

}
