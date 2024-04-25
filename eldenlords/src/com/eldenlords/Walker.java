package com.eldenlords;

import java.util.Random;

public class Walker {
	private Coordenada pos = new Coordenada(0,0);
	private int dir;
	private float chanceChange = 0.25f;
	private float chanceWalkerSpawn = 0.05f;
	private float probCasillaEspecial = 0.05f;
	private float probTeleport = 0.2f;
	private Random rng  = new Random();
	public Walker(int pPosX, int pPosY) {
		this.pos.setX(pPosX);
		this.pos.setY(pPosY);
		this.dir = rng.nextInt(4);
	}

	public Coordenada getCoord() {
		return this.pos;
	}
	public boolean creaNuevoWalker() {
		boolean creaNuevo = false;
		if(rng.nextInt(100)/100f <= this.chanceWalkerSpawn) {
			creaNuevo = true;
		}
		return creaNuevo;
	}
	public int tipoCasilla() {
		int casilla = 0;
		if(rng.nextInt(100)/100f<=this.probCasillaEspecial) {
			if(rng.nextInt(100)/100f<=this.probTeleport) {
				casilla = 1;
			} else {
				casilla = 2;
			}
		} else {
			casilla = 0;
		}
		return casilla;
	}
	public void chooseAction() {
		int limite = Mapa.getMapa().getTamano() - 2;
		int nDir;
			if(rng.nextInt(100)/100f <= this.chanceChange) {
				nDir = rng.nextInt(4);
				while(nDir == this.dir) {
					nDir = rng.nextInt(4);
				}
				dir = nDir;
			}
    
			switch(this.dir) {
			//   1
			// 0   2
			//   3
    			case 0:
    				if(this.pos.y() > 1) {
    					this.pos.setY(this.pos.y() - 1);
    				}
    				break;
    			case 1:
    				if(this.pos.x() > 1) {
    					this.pos.setX(this.pos.x() - 1);
    				}
    				break;
    			case 2:
    				if(this.pos.y() < limite) {
    					this.pos.setY(this.pos.y() + 1);
    				}
    				break;
    			case 3:
    				if(this.pos.x() < limite) {
    					this.pos.setX(this.pos.x() + 1);
    				}
    				break;
    			}
    		}
	}