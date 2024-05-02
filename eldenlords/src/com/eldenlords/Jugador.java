package com.eldenlords;

public class Jugador {

	private static Jugador miJugador = new Jugador();
	private Coordenada coord;
	private int numPasos;
	public Jugador() {
		this.coord = new Coordenada(Mapa.getMapa().getCentro().x(),Mapa.getMapa().getCentro().y());
		this.numPasos = 0;
	}
	public static Jugador getJugador() {
		return miJugador;
	}
	public void jugarPartida() {
		Mapa.getMapa().prepararTablero();
		Mapa.getMapa().cambiarImagen(this.coord);
		while (!Mapa.getMapa().esSalida(this.coord)) {
			Mapa.getMapa().posiblesMovimientos(this.coord);
			this.mover();
		}
		
	}
	private void mover() {
		String movimiento = Teclado.getTeclado().leerString();
		switch(movimiento){
		case "Arriba":
			this.coord.setX(this.coord.x() - 1);
			contarMovimiento();
			break;
		case "Abajo":
			this.coord.setX(this.coord.x() + 1);
			contarMovimiento();
			break;
		case "Derecha":
			this.coord.setY(this.coord.y() + 1);
			contarMovimiento();
			break;
		case "Izquierda":
			this.coord.setY(this.coord.y() - 1);
			contarMovimiento();
			break;
		case "m":
			Mapa.getMapa().printMap();
			break;
		}
	}
	private void contarMovimiento() {
		this.numPasos = this.numPasos + 1;
		Mapa.getMapa().cambiarImagen(this.coord);
	}
}
