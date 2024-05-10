package com.eldenlords;

import java.util.Iterator;

public class ListaPreguntas {
	private ArrayList<Pregunta> lista;
	}

private ListaPreguntas() {
	this.lista = new ArrayList<Pregunta>
	Pregunta preg1= new Pregunta("�Cu�ntos planetas componen el sistema solar?","8");
	lista.a�adirPregunta(preg1);
	Pregunta preg2= new Pregunta("�Qu� cantidad de huesos hay en el cuerpo humano?","206");
	lista.a�adirPregunta(preg2);
	Pregunta preg3= new Pregunta("�En qu� pa�s se encuentra la torre de Pisa?","Italia");
	lista.a�adirPregunta(preg3);
	Pregunta preg4= new Pregunta("�Cu�l es el pa�s m�s grande del mundo?","Rusia");
	lista.a�adirPregunta(preg4);
	Pregunta preg5= new Pregunta("�Cu�l es la moneda oficial de Estados Unidos?","Dolar");
	lista.a�adirPregunta(preg5);
	Pregunta preg6= new Pregunta("�Qui�n traicion� a Jes�s?","Judas");
	lista.a�adirPregunta(preg6);
	Pregunta preg7= new Pregunta("�Cu�l es la monta�a m�s alta del planeta?","Everest");
	lista.a�adirPregunta(preg7);
	return lista;
}

public void getListaPreguntas() {
	return this.lista;
}

private Iterator<Pregunta> getIterador() {
		return this.lista.iterator();
	}

public void a�adirPregunta(Pregunta pPregunta) {
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