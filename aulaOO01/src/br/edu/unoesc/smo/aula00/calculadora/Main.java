package br.edu.unoesc.smo.aula00.calculadora;

public class Main {

	public void imprimeResultado(Operacao operacao, int valor1, int valor2){
		System.out.println("Resultado="+operacao.calcular(valor1, valor2));
	}
	
	public static void main(String[] args) {
		Main objeto1 = new Main();
		objeto1.imprimeResultado(new Soma(), 10, 20);
		objeto1.imprimeResultado(new Subtracao(), 10, 20);
	}

}
