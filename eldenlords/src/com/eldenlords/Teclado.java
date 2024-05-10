package com.eldenlords;
import java.util.Scanner;

public class Teclado {
	private Scanner sc = new Scanner(System.in);
	private static Teclado miTeclado = new Teclado();
	
	private Teclado() {
		
	}
	
	public String leerString() {
		return sc.nextLine();
	}
	public static Teclado getTeclado() {
		return miTeclado;
	}
}
