package br.edu.unoesc.smo.aula00.ocp;

public class Frete implements CalcularFrete {

	public double calcula(String cidade) {
		if ("SAO PAULO".equals(cidade.toUpperCase())) {
			return 15;
		}
		return 30;
	}

}
