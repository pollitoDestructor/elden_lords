package com.eldenlords;

public class Mapa {
	private static Mapa miMapa = new Mapa();
	private Casilla[][] tablero = new Casilla[25][25];

	
	
	public Mapa() {
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
    
    public void habilitarCasilla(Coordenada pCoord) {
    	this.tablero[pCoord.x()][pCoord.y()].habilitarCasilla();
    }
    
    public Coordenada getCentro() {
    	return new Coordenada((int)this.tablero.length/2,(int)this.tablero.length/2);
    }
    
    public boolean estaHabilitada(Coordenada pCoord) {
    	return this.tablero[pCoord.x()][pCoord.y()].estaHabilitada();
    }
    public void ponerCasillaFinal(Coordenada pCoord) {
    	this.tablero[pCoord.x()][pCoord.y()] = new Salida();
    }
}