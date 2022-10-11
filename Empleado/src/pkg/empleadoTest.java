package pkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class empleadoTest {
	enum TipoEmpleado{Vendedor,Encargado}
	pkg.empleado.TipoEmpleado tipo;
	float ventasMes;
	float horasExtra;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculoNominaBruta_Vendedor_1100_10() {
		tipo = tipo.Vendedor;
		ventasMes = 1100;
		horasExtra = 10;
		
		float expected = 2400;
		float actual = empleado.calculoNominaBruta (tipo, ventasMes, horasExtra);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}
	@AfterEach
	void testCalculoNominaBruta_Encargado_1100_10() {
		tipo = tipo.Encargado;
		ventasMes = 1100;
		horasExtra = 10;
		
		float expected = 2900;
		float actual = empleado.calculoNominaBruta (tipo, ventasMes, horasExtra);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}
	
	@AfterEach
	void testCalculoNominaBruta_Encargado_800_10() {
		tipo = tipo.Encargado;
		ventasMes = 800;
		horasExtra = 10;
		
		float expected = 2800;
		float actual = empleado.calculoNominaBruta (tipo, ventasMes, horasExtra);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}
	@AfterEach
	void testCalculoNominaBruta_Encargado_1500_10() {
		tipo = tipo.Encargado;
		ventasMes = 1500;
		horasExtra = 10;
		
		float expected = 3000;
		float actual = empleado.calculoNominaBruta (tipo, ventasMes, horasExtra);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}
	
	@AfterEach
	void testCalculoNominaBruta_Encargado_1000_10() {
		tipo = tipo.Encargado;
		ventasMes = 1000;
		horasExtra = 10;
		
		float expected = 2900;
		float actual = empleado.calculoNominaBruta (tipo, ventasMes, horasExtra);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}
	
	@AfterEach
	void testCalculoNominaBruta_Vendedor_1000_10() {
		tipo = tipo.Vendedor;
		ventasMes = 1000;
		horasExtra = 10;
		
		float expected = 2400;
		float actual = empleado.calculoNominaBruta (tipo, ventasMes, horasExtra);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}
	
	@AfterEach
	void testCalculoNominaBruta_Vendedor_1000_0() {
		tipo = tipo.Vendedor;
		ventasMes = 1000;
		horasExtra = 0;
		
		float expected = 2100;
		float actual = empleado.calculoNominaBruta (tipo, ventasMes, horasExtra);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}
	
	

	@Test
	void testCalculoNominaNeta_Tramo0() {
		float expected = 2000;
		float actual = empleado.calculoNominaNeta (2000);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
		
	}

	void testCalculoNominaNeta_Tramo15() {
		float expected = 1870;
		float actual = empleado.calculoNominaNeta (2200);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}
	void testCalculoNominaNeta_Tramo18() {
		float expected = 2050;
		float actual = empleado.calculoNominaNeta (2500);
		assertEquals(actual, expected);
		//fail("Not yet implemented");
	}
}
