package br.edu.unoesc.smo.aula00;

public class Corrente extends Conta {

	private Double limite;

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	@Override
	public boolean verificarSaldoSaque(Double valor) {
		return ((getSaldo() + limite) >= valor);
	}

	
}
