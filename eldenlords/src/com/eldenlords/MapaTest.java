package com.eldenlords;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MapaTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	
	
	
	@Test
	void testSePegaContraLaPared() {
		Mapa.getMapa().prepararTablero();
		Jugador.getJugador().jugarPartida();
		//Si te mueves en l�nea recta en cualquier direcci�n, llegar� u n momento en el que no te deje, ya que habr� una pared
	}

	

}
