package com.eldenlords;

import java.util.ArrayList;

public class ListaPreguntas {
	private ArrayList<Pregunta> lista = new ArrayList<>();
	private ListaPreguntas() {
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
}

}