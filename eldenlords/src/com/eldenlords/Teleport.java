package com.eldenlords;

public class Teleport extends Casilla {
	public Teleport() {
		super();
		this.imagen = "@";
		this.habilitada = true;
	}
	
	public void activarEvento() {
		if(this.imagen == "@") {
			int fila, columna;
			fila=Dado.getDado().tirarDado(Mapa.getMapa().calcularCentro() * 2);
			columna=Dado.getDado().tirarDado(Mapa.getMapa().calcularCentro() * 2);
			Coordenada casillaNueva = new Coordenada(fila,columna);
	    	if (Mapa.getMapa().estaHabilitada(casillaNueva)) {
	    		System.out.print("Has sido teletransportado :P");
				System.out.println();
	    		Jugador.getJugador().setCoord(casillaNueva);
	    		Mapa.getMapa().activarEvento(casillaNueva);
	    	} else {
	    		this.activarEvento();
	    	}
	    	this.imagen = "0";
	    }
	}
	
	@Override
	public void hacerCamino() {
		this.imagen = "0";
	}
}
