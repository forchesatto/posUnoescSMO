package br.edu.unoesc.smo.aula00;

public class Poupanca extends Conta {

	private Double rendimento;

	@Override
	public boolean verificarSaldoSaque(Double valor) {
		return (getSaldo() >= valor);
	}

	public Double getRendimento() {
		return rendimento;
	}

	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}

}
