package com.eldenlords;

public class Pregunta {
	private String pregunta;
	private String respuesta;


	public Pregunta(String pPregunta,String pRespuesta) {
		this.pregunta = pPregunta;
		this.respuesta = pRespuesta;
	}
	
	public boolean hacerPregunta() {
		System.out.println();
		System.out.print("Pregunta sorpresa: " + this.pregunta);
		System.out.println();
		String respuestaDada = Teclado.getTeclado().leerString();
		boolean correcto;
		if(this.respuesta.toLowerCase().equals(respuestaDada.toLowerCase())) {
			correcto = true;
		} else {
			correcto = false;
		}
		return correcto;
	}

}