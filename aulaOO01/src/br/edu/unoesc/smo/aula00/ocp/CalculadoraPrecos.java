package br.edu.unoesc.smo.aula00.ocp;

public class CalculadoraPrecos {
	
	private TabelaPreco tabelaPreco;
	private CalcularFrete calcularFrete;
	
	public CalculadoraPrecos(TabelaPreco tabelaPreco, 
			CalcularFrete calcularFrete) {
		this.tabelaPreco = tabelaPreco;
		this.calcularFrete = calcularFrete;
	}

	public double calcula(Compra produto) {
		double desconto = tabelaPreco.descontoPara(produto.getValor());
		double frete = calcularFrete.calcula(produto.getCidade());
		return produto.getValor() * (1 - desconto) + frete;
	}
}
