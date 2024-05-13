package com.eldenlords;

import java.util.ArrayList;

public class ListaPreguntas {
	private ArrayList<Pregunta> lista = new ArrayList<>();
	private ListaPreguntas() {
	Pregunta preg1 = new Pregunta("¿Cuántos planetas componen el sistema solar?","8");
	lista.add(preg1);
	Pregunta preg2 = new Pregunta("¿Qué cantidad de huesos hay en el cuerpo humano?","206");
	lista.add(preg2);
	Pregunta preg3 = new Pregunta("¿En qué país se encuentra la torre de Pisa?","Italia");
	lista.add(preg3);
	Pregunta preg4 = new Pregunta("¿Cuál es el país más grande del mundo?","Rusia");
	lista.add(preg4);
	Pregunta preg5 = new Pregunta("¿Cuál es la moneda oficial de Estados Unidos?","Dolar");
	lista.add(preg5);
	Pregunta preg6 = new Pregunta("¿Quién traicionó a Jesús?","Judas");
	lista.add(preg6);
	Pregunta preg7 = new Pregunta("¿Cuál es la montaña más alta del planeta?","Everest");
	lista.add(preg7);
}

}