package com.eldenlords;

import java.util.Iterator;

public class ListaPreguntas {
	private ArrayList<Pregunta> lista;
	}

private ListaPreguntas() {
	this.lista = new ArrayList<Pregunta>
	Pregunta preg1= new Pregunta("¿Cuántos planetas componen el sistema solar?","8");
	lista.añadirPregunta(preg1);
	Pregunta preg2= new Pregunta("¿Qué cantidad de huesos hay en el cuerpo humano?","206");
	lista.añadirPregunta(preg2);
	Pregunta preg3= new Pregunta("¿En qué país se encuentra la torre de Pisa?","Italia");
	lista.añadirPregunta(preg3);
	Pregunta preg4= new Pregunta("¿Cuál es el país más grande del mundo?","Rusia");
	lista.añadirPregunta(preg4);
	Pregunta preg5= new Pregunta("¿Cuál es la moneda oficial de Estados Unidos?","Dolar");
	lista.añadirPregunta(preg5);
	Pregunta preg6= new Pregunta("¿Quién traicionó a Jesús?","Judas");
	lista.añadirPregunta(preg6);
	Pregunta preg7= new Pregunta("¿Cuál es la montaña más alta del planeta?","Everest");
	lista.añadirPregunta(preg7);
	return lista;
}

public void getListaPreguntas() {
	return this.lista;
}

private Iterator<Pregunta> getIterador() {
		return this.lista.iterator();
	}

public void añadirPregunta(Pregunta pPregunta) {
	this.lista.add(pPregunta);
}

public Pregunta buscarPregunta(pNum) {
	int aux=pNum;
	Pregunta unPregunta = null;
	Pregunta unPregunta1 = null;
	Iterator<Pregunta>itr=this.getIterador();
	while(itr.hasNext() && aux>0)
	{
		unPregunta=itr.next();
		aux=aux-1;
		
	}
	unPregunta1=unPregunta;
	return unPregunta1;
	}