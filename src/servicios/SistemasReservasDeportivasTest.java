package servicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SistemasReservasDeportivasTest {
	
	static SistemaReservasDeportivas sistemaReservas;
	
	@BeforeAll
	
	static void setUpBeforeClass() throws Exception {
		
		sistemaReservas = new SistemaReservasDeportivas();
		
	}
	
	@Test
	
	void testReservarPistas() {
		
		assertTrue(sistemaReservas.reservarPista(1, "21-03-2025 12:00", 60));
		assertTrue(sistemaReservas.reservarPista(1, "21-03-2025 12:00", 60));
		assertTrue(sistemaReservas.reservarPista(2, "21-03-2025 12:00", 60));
		assertTrue(sistemaReservas.reservarPista(3, "22-03-2025 12:00", 60));
		assertTrue(sistemaReservas.reservarPista(9, "22-03-2025 12:00", 60));
		
	}
	
	void testCancelarReserva() {
		
		assertTrue(sistemaReservas.cancelarReserva(1));
		assertTrue(sistemaReservas.cancelarReserva(2));
		assertTrue(sistemaReservas.cancelarReserva(3));
		assertTrue(sistemaReservas.cancelarReserva(4));
		assertTrue(sistemaReservas.cancelarReserva(5));
		
	}
}
