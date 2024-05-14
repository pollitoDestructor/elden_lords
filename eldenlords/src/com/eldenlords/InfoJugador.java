package com.eldenlords;

public class InfoJugador {
	private int numPasos;
	private String nombre;

	public InfoJugador(int pNumPasos,String pNombre) {
		this.numPasos = pNumPasos;
		this.nombre = pNombre;
	}

	public void imprimirInfoJugador() {
		System.out.print(this.nombre + " " + this.numPasos);
	}
}