package com.eldenlords;

public class Preguntona extends Casilla {
	public Preguntona() {
		super();
		this.imagen = "?";
		this.habilitada = true;
	}
	
	public void activarEvento() {
		//pedir un pNum al dado
		imprimirPregunta(buscarPregunta(pNum).getPregunta);
		String respuesta = Teclado.getTeclado().leerString();
		if(respuesta/=buscarPregunta(pNum).getRespuesta) {
			jugador.setCoord(Mapa.getMapa().getCentro().x(),Mapa.getMapa().getCentro().y());
		}
	}
	@Override
	public void hacerCamino() {
		this.imagen = "¿";
	}
}
