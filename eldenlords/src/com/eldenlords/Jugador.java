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
	public void setCoord(int pCoord) {
		this.coord = pCoord;
	}
	public void jugarPartida() {
		Mapa.getMapa().prepararTablero();
		Mapa.getMapa().cambiarImagen(this.coord);
		while (!Mapa.getMapa().esSalida(this.coord)) {
			System.out.println();
			Mapa.getMapa().posiblesMovimientos(this.coord);
			try {
				this.mover();
			} catch(NoEsDireccionException me) {
				System.out.print("No has escrito bien la dirección (asegúrate de empezar con mayúscula).");
				System.out.println();
			}
		}
		System.out.print("Enhorabuena, has salido del laberinto");
		System.out.println();
		System.out.print("Puntuación:" + this.numPasos);
		System.out.println();
		System.out.print("Este ha sido tu recorrido:");
		System.out.println();
		Mapa.getMapa().printMap();
	}
	private void mover() throws NoEsDireccionException{
		String movimiento = Teclado.getTeclado().leerString();
		switch(movimiento){
		case "Arriba":
			try {
				this.coord.setX(this.coord.x() - 1);
				if(!Mapa.getMapa().estaHabilitada(this.coord)) {
					throw (new PosicionOcupadaException());
				} else {
					contarMovimiento();
				}
			} catch (PosicionOcupadaException me) {
				System.out.print("La dirección introducida está ocupada");
				System.out.println();
				this.coord.setX(this.coord.x() + 1);
			}
			
			break;
		case "Abajo":
			try {
				this.coord.setX(this.coord.x() + 1);
				if(!Mapa.getMapa().estaHabilitada(this.coord)) {
					throw (new PosicionOcupadaException());
				} else {
					contarMovimiento();
				}
			} catch (PosicionOcupadaException me) {
				System.out.print("La dirección introducida está ocupada");
				System.out.println();
				this.coord.setX(this.coord.x() - 1);
			}
			break;
		case "Derecha":
			try {
				this.coord.setY(this.coord.y() + 1);
				if(!Mapa.getMapa().estaHabilitada(this.coord)) {
					throw (new PosicionOcupadaException());
				} else {
					contarMovimiento();
				}
			} catch (PosicionOcupadaException me) {
				System.out.print("La dirección introducida está ocupada");
				System.out.println();
				this.coord.setY(this.coord.y() - 1);
			}			
			break;
		case "Izquierda":
			try {
				this.coord.setY(this.coord.y() - 1);
				if(!Mapa.getMapa().estaHabilitada(this.coord)) {
					throw (new PosicionOcupadaException());
				} else {
					contarMovimiento();
				}
			} catch (PosicionOcupadaException me) {
				System.out.print("La dirección introducida está ocupada");
				System.out.println();
				this.coord.setY(this.coord.y() + 1);
			}
			break;
		case "m":
			Mapa.getMapa().printMap();
			break;
		default:
			throw(new NoEsDireccionException());
		}
	}
	private void contarMovimiento() {
		this.numPasos = this.numPasos + 1;
		Mapa.getMapa().cambiarImagen(this.coord);
	}
}
