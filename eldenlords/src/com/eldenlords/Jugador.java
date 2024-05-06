package com.eldenlords;

public class Jugador {

	private static Jugador miJugador = new Jugador();
	private Coordenada coord;
	private int numPasos;
	private Jugador() {
		this.coord = new Coordenada(Mapa.getMapa().getCentro().x(),Mapa.getMapa().getCentro().y());
		this.numPasos = 0;
	}
	public static Jugador getJugador() {
		return miJugador;
	}
	public static void main(String[] args) {
        Jugador.getJugador().jugarPartida();
    }
	public void jugarPartida() {
		Mapa.getMapa().prepararTablero();
		Mapa.getMapa().cambiarImagen(this.coord);
		while (!Mapa.getMapa().esSalida(this.coord)) {
			System.out.println();
			Mapa.getMapa().posiblesMovimientos(this.coord);
			this.mover();
		}
		System.out.print("Enhorabuena, has salido del laberinto");
		System.out.println();
		System.out.print("Puntuación:" + this.numPasos);
		System.out.println();
		System.out.print("Este ha sido tu recorrido:");
		System.out.println();
		Mapa.getMapa().printMap();
	}
	private void mover() {
		String movimiento = Teclado.getTeclado().leerString();
		switch(movimiento){
		case "Arriba":
			contarMovimiento();
			this.coord.setX(this.coord.x() - 1);
			
			break;
		case "Abajo":
			contarMovimiento();
			this.coord.setX(this.coord.x() + 1);
			
			break;
		case "Derecha":
			contarMovimiento();
			this.coord.setY(this.coord.y() + 1);
			
			break;
		case "Izquierda":
			contarMovimiento();
			this.coord.setY(this.coord.y() - 1);
			
			break;
		case "m":
			Mapa.getMapa().printMap();
			break;
		default:
			System.out.print("No has escrito bien la dirección (asegúrate de empezar con mayúscula).");
			System.out.println();
			break;
		}
	}
	private void contarMovimiento() {
		this.numPasos = this.numPasos + 1;
		Mapa.getMapa().cambiarImagen(this.coord);
	}
}
