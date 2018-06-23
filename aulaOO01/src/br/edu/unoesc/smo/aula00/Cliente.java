package br.edu.unoesc.smo.aula00;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private String cpf;
	
	private List<Conta> contas;

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void adicionarConta(Conta conta){
		if(contas == null){
			contas = new ArrayList<>();
		}
		contas.add(conta);
	}
	
	public void removerConta(Conta conta){
		if(contas != null){
			contas.remove(conta);
		}
	}
	
	public Double calcularSaldoGeral(){
//		Double total = 0.0;
//		for(Conta conta: contas){
//			total += conta.getSaldo();
//		}
//		return total;
		return contas.stream().mapToDouble(Conta::getSaldo).sum();		
	}
	
	
	public List<Conta> getContas(){
		return contas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
