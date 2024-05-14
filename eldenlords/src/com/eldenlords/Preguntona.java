package com.eldenlords;

public class Preguntona extends Casilla {
	private ListaPreguntas listaPreguntas;
	public Preguntona() {
		super();
		this.imagen = "?";
		this.habilitada = true;
		listaPreguntas = new ListaPreguntas();
	}
	
	public void activarEvento() {
		int numPregunta = Dado.getDado().tirarDado(7);
		boolean correcta = this.listaPreguntas.hacerPregunta(numPregunta - 1);
		if(correcta) {
			System.out.print("Respuesta correcta.");
			System.out.println();
		} else {
			System.out.print("mal :(");
			System.out.println();
			Jugador.getJugador().setCoord(Mapa.getMapa().getCentro());
		}
	}
	@Override
	public void hacerCamino() {
		this.imagen = "¿";
	}
}
