package com.eldenlords;

public class Mapa {
	private static Mapa miMapa = new Mapa();
	private Casilla[][] tablero = new Casilla[25][25];

	
	
	private Mapa() {
		this.tablero = new Casilla[25][25];
		
	}
	
	public static Mapa getMapa() {
		return miMapa;
	}
	
    public void prepararTablero() {
    	
    	for (int i = 0; i<this.tablero.length; i++) {
    		for(int j = 0;j<this.tablero.length; j++) {
    			this.tablero[i][j]= new Casilla();
    		}
    	}
    	Generador.getGenerador().generarMapa();
    }
    
    public void printMap()
    {
    	Casilla matrix[][] = this.tablero;
        for (int i = 0; i < matrix.length; i++)
	  {
	    for (int j = 0; j < matrix[i].length; j++)
	    {
		System.out.print(matrix[i][j].getImagen() + " ");
	     }
	     System.out.println();
	   }
	}
    
    public void activarEvento(Coordenada pCoord) {
    	this.tablero[pCoord.x()][pCoord.y()].activarEvento();
    }
    public void habilitarCasilla(Coordenada pCoord) {
    	this.tablero[pCoord.x()][pCoord.y()].habilitarCasilla();
    }
    
    public Coordenada getCentro() {
    	return new Coordenada((int)this.tablero.length/2,(int)this.tablero.length/2);
    }
    
    public int calcularCentro() {
    	return (int)this.tablero.length/2;
    }
    
    public boolean estaHabilitada(Coordenada pCoord) {
    	return this.tablero[pCoord.x()][pCoord.y()].estaHabilitada();
    }
    public void ponerCasillaFinal(Coordenada pCoord) {
    	this.tablero[pCoord.x()][pCoord.y()] = new Salida();
    }
    public void ponerCasillaTeleport(Coordenada pCoord) {
    	this.tablero[pCoord.x()][pCoord.y()] = new Teleport();
    }
    public void ponerCasillaPreguntona(Coordenada pCoord) {
    	this.tablero[pCoord.x()][pCoord.y()] = new Preguntona();
    }
    public int getTamano() {
    	return this.tablero.length;
    }
    public boolean esSalida(Coordenada pCoord) {
    	return this.tablero[pCoord.x()][pCoord.y()].esSalida();
    }
    public void posiblesMovimientos(Coordenada pCoord) {
    	System.out.print("Posibles movimientos:");
    	System.out.println();
    	if(this.tablero[pCoord.x() - 1][pCoord.y()].habilitada) {
    		System.out.print("Arriba");
    		System.out.println();
    	}
    	if(this.tablero[pCoord.x() + 1][pCoord.y()].habilitada) {
    		System.out.print("Abajo");
    		System.out.println();
    	}
    	if(this.tablero[pCoord.x()][pCoord.y() - 1].habilitada) {
    		System.out.print("Izquierda");
    		System.out.println();
    	}
    	if(this.tablero[pCoord.x()][pCoord.y() + 1].habilitada) {
    		System.out.print("Derecha");
    		System.out.println();
    	}
    }
    public void cambiarImagen(Coordenada pCoord) {
    	this.tablero[pCoord.x()][pCoord.y()].hacerCamino();
    }
}