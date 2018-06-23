package br.edu.unoesc.smo.aula00.srp;

public class QuinzeOuVinteCincoPorcento implements RegraCalculo {

	@Override
	public Double calcular(Funcionario funcionario) {
		if(funcionario.getSalario() > 3000.0){
			return funcionario.getSalario() * 0.75;
		} else {
			return funcionario.getSalario() * 0.85;
		}
	}

}
