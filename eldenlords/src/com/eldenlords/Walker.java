package com.eldenlords;

import java.util.Random;

public class Walker {
	private Coordenada pos = new Coordenada(0,0);
	private int dir;
	private float chanceChange = 0.3f;
	private float chanceWalkerSpawn = 0.05f;
	private Random rng  = new Random();
	private boolean destroyed = false;
	public Walker(int pPosX, int pPosY) {
		this.pos.setX(pPosX);
		this.pos.setY(pPosY);
		this.dir = rng.nextInt(4);
	}

	public int getPosX() {
		return this.pos.x();
	}

	public int getPosY() {
		return this.pos.y();
	}
	public boolean createsNewQ() {
		boolean createsNew = false;
		if(rng.nextInt(100)/100f <= this.chanceWalkerSpawn) {
			createsNew = true;
		}
		return createsNew;
	}
	public void chooseAction() {
		int newDir;
		if(this.destroyed == false) {
			if(rng.nextInt(100)/100f <= this.chanceChange) {
				newDir = rng.nextInt(4);
				while(newDir == this.dir) {
					newDir = rng.nextInt(4);
				}
				dir = newDir;
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
    				if(this.pos.y() < 13) {
    					this.pos.setY(this.pos.y() + 1);
    				}
    				break;
    			case 3:
    				if(this.pos.x() < 13) {
    					this.pos.setX(this.pos.x() + 1);
    				}
    				break;
    			}
    		}
    	}
	}