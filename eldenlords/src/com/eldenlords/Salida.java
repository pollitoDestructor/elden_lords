package com.eldenlords;

public class Salida extends Casilla{
	public Salida() {
		super();
		this.salida = true;
		this.imagen = "!";
		this.habilitada = true;
	}
	
	@Override
	public void activarEvento() {
		
		System.out.print("Enhorabuena, has salido del laberinto");
		System.out.println();
		System.out.print("Puntuación:" + Jugador.getJugador().puntuacion());
		System.out.println();
		System.out.print("Este ha sido tu recorrido:");
		System.out.println();
		Mapa.getMapa().printMap();
		System.out.print("Ingrese su nombre:");
		System.out.println();
		InfoJugador ganador = new InfoJugador(Jugador.getJugador().puntuacion(), Teclado.getTeclado().leerString());
		System.out.println();
		Ranking.getRanking().añadirRanking(ganador);
		Ranking.getRanking().ordenarRanking();
		Ranking.getRanking().imprimirRanking();
	}
}
