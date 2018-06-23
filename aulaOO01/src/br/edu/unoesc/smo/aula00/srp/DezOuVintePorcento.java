package br.edu.unoesc.smo.aula00.srp;

public class DezOuVintePorcento implements RegraCalculo {

	@Override
	public Double calcular(Funcionario funcionario) {
		if(funcionario.getSalario() > 2000.0){
			return funcionario.getSalario() * 0.80;
		} else {
			return funcionario.getSalario() * 0.90;
		}
	}

}
