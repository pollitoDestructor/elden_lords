package com.eldenlords;

import java.util.ArrayList;

public class ListaPreguntas {
	private ArrayList<Pregunta> lista = new ArrayList<>();
	public ListaPreguntas() {
	Pregunta preg1 = new Pregunta("�Cu�ntos planetas componen el sistema solar?","8");
	lista.add(preg1);
	Pregunta preg2 = new Pregunta("�Qu� cantidad de huesos hay en el cuerpo humano?","206");
	lista.add(preg2);
	Pregunta preg3 = new Pregunta("�En qu� pa�s se encuentra la torre de Pisa?","Italia");
	lista.add(preg3);
	Pregunta preg4 = new Pregunta("�Cu�l es el pa�s m�s grande del mundo?","Rusia");
	lista.add(preg4);
	Pregunta preg5 = new Pregunta("�Cu�l es la moneda oficial de Estados Unidos?","Dolar");
	lista.add(preg5);
	Pregunta preg6 = new Pregunta("�Qui�n traicion� a Jes�s?","Judas");
	lista.add(preg6);
	Pregunta preg7 = new Pregunta("�Cu�l es la monta�a m�s alta del planeta?","Everest");
	lista.add(preg7);
	Pregunta preg8 = new Pregunta("�Qu� animal produce m�s lana?","Oveja");
	lista.add(preg8);
	Pregunta preg9 = new Pregunta("�Cu�l es el resultado de sumar un n�mero a su opuesto?","0");
	lista.add(preg9);
	Pregunta preg10 = new Pregunta("�C�mo se llama la numeraci�n que emplea los d�gitos del 0 al 9 y las letras de la A a la F?","Hexadecimal");
	lista.add(preg10);
	Pregunta preg11 = new Pregunta("�Por d�nde debe circular un reba�o de ovejas en una carretera?","Derecha");
	lista.add(preg11);
	Pregunta preg12 = new Pregunta("�Cu�l es la mascota de la franquicia Pok�mon?","Pikachu");
	lista.add(preg12);
}
	public boolean hacerPregunta(int pNumPregunta) {
		return lista.get(pNumPregunta).hacerPregunta();
	}

}