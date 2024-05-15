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
		Mapa.getMapa().prepararTablero();
        Jugador.getJugador().jugarPartida();
    }
	public void setCoord(Coordenada pCoord) {
		this.coord = pCoord;
	}
	public void jugarPartida() {
		
		Mapa.getMapa().cambiarImagen(this.coord);
		while (!Mapa.getMapa().esSalida(this.coord)) {
			System.out.println();
			Mapa.getMapa().posiblesMovimientos(this.coord);
			try {
				this.mover();
				Mapa.getMapa().activarEvento(this.coord);
			} catch(NoEsDireccionException me) {
				System.out.print("No has escrito bien la dirección.");
				System.out.println();
			}
		}
		
	}
	private void mover() throws NoEsDireccionException{
		String movimiento = Teclado.getTeclado().leerString().toLowerCase();
		switch(movimiento){
		case "arriba":
			try {
				
				this.coord.setX(this.coord.x() - 1);
				if(!Mapa.getMapa().estaHabilitada(this.coord)) {
					throw (new PosicionOcupadaException());
				} 
				contarMovimiento();
			} catch (PosicionOcupadaException me) {
				System.out.print("La dirección introducida está ocupada");
				System.out.println();
				this.coord.setX(this.coord.x() + 1);
			}
			
			break;
		case "abajo":
			try {
				
				this.coord.setX(this.coord.x() + 1);
				if(!Mapa.getMapa().estaHabilitada(this.coord)) {
					throw (new PosicionOcupadaException());
				}
				contarMovimiento();
			} catch (PosicionOcupadaException me) {
				System.out.print("La dirección introducida está ocupada");
				System.out.println();
				this.coord.setX(this.coord.x() - 1);
			}
			break;
		case "derecha":
			try {
				
				this.coord.setY(this.coord.y() + 1);
				if(!Mapa.getMapa().estaHabilitada(this.coord)) {
					throw (new PosicionOcupadaException());
				}
				contarMovimiento();
			} catch (PosicionOcupadaException me) {
				System.out.print("La dirección introducida está ocupada");
				System.out.println();
				this.coord.setY(this.coord.y() - 1);
			}			
			break;
		case "izquierda":
			try {
				
				this.coord.setY(this.coord.y() - 1);
				if(!Mapa.getMapa().estaHabilitada(this.coord)) {
					throw (new PosicionOcupadaException());
				} 
				contarMovimiento();
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
	public int puntuacion() {
		return this.numPasos;
	}
}
