package com.eldenlords;

public class Jugador {
<<<<<<< Upstream, based on elden_lords/master

=======
	private static Jugador miJugador = new Jugador();
	private Coordenada coord;
	private int numPasos;
	public Jugador() {
		this.coord = new Coordenada(Mapa.getMapa().getCentro().x(),Mapa.getMapa().getCentro().y());
		this.numPasos = 0;
	}
	public void jugarPartida() {
		Mapa.getMapa().prepararTablero();
		this.numPasos = 1;
		
	}
>>>>>>> 57914bf Jugador creado
}
