package com.eldenlords;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalidaTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCasillaSalida() {
		Mapa.getMapa().prepararTablero();
		Mapa.getMapa().ponerCasillaFinal(new Coordenada(Mapa.getMapa().calcularCentro() - 1,Mapa.getMapa().calcularCentro()));
		Jugador.getJugador().jugarPartida();
		//Al moverte hacia arriba acaba la partida
	}
}
