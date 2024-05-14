package com.eldenlords;

import java.util.Random;

public class Dado {
	private static Dado miDado = new Dado();
	private Random rng  = new Random();
	
	private Dado() {
		
	}
	public static Dado getDado() {
		return miDado;
	}
	public int tirarDado(int pNum) {
		return rng.nextInt(pNum) + 1;	
	}
}
