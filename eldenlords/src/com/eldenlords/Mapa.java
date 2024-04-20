package com.eldenlords;

import java.util.ArrayList;
import java.util.Iterator;

import com.pmoo.projecto.Walker;
import com.pmoo.projecto.mapa;

public class mapa {
	private static mapa miMapa = new mapa();
	private int roomSize = 15;
	private int maxWalkers = 10;
	private float percentToFill = 0.3f;
	private String[][] map = new String[this.roomSize][this.roomSize];
	private ArrayList<Walker> walkers;
	
	
	public mapa() {
		this.map = new String[this.roomSize][this.roomSize];
	}
	
	public static mapa getMapa() {
		return miMapa;
	}
	private Iterator<Walker>getIterador(){
		return this.walkers.iterator();
	}
    
    public void setUpMap() {
    	for (int i = 0; i<this.map.length; i++) {
    		for(int j = 0;j<this.map.length; j++) {
    			this.map[i][j]= "#";
    		}
    	}
    }
    public void genMap() {
    	this.walkers = new ArrayList<Walker>();
    	int filledMap = 1;
    	int desPosX = 7;
    	int desPosY= 7;
    	int endPosX = 7;
    	int endPosY= 7;
    	boolean wantsToAdd = false;
    	Walker cWalker;
    	this.walkers.add(new Walker(7,7));
    	this.walkers.add(new Walker(7,7));
    	this.walkers.add(new Walker(7,7));
    	Iterator<Walker> itr = this.getIterador();
    	this.map[7][7]= "·";
    	while(filledMap/(15*15f)<this.percentToFill) {
    		wantsToAdd = false;
    		while(filledMap/(15*15)<this.percentToFill&& itr.hasNext() && wantsToAdd == false) {
    			cWalker = itr.next();
    			cWalker.chooseAction();
    			if(this.map[cWalker.getPosX()][cWalker.getPosY()] == "#") {
    				this.map[cWalker.getPosX()][cWalker.getPosY()] = "·";
    				filledMap = filledMap + 1;
    				endPosX = cWalker.getPosX();
        	    	endPosY= cWalker.getPosY();
    			}
    			if(this.walkers.size() < this.maxWalkers && cWalker.createsNewQ()) {
    				wantsToAdd = true;
    				desPosX = cWalker.getPosX();
    				desPosY = cWalker.getPosY();
    			}
    			
    		}
    		if(wantsToAdd == true){
    			this.walkers.add(new Walker(desPosX,desPosY));
			}
    		itr = walkers.listIterator();
    	}
    	this.map[endPosX][endPosY] = "!";
    }
    public void printMap()
    {
    	String matrix[][] = this.map;
        for (int i = 0; i < matrix.length; i++)
	  {
	    for (int j = 0; j < matrix[i].length; j++)
	    {
		System.out.print(matrix[i][j] + " ");
	     }
	     System.out.println();
	   }
	}
    
    
}