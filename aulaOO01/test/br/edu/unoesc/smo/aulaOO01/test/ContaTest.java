package br.edu.unoesc.smo.aulaOO01.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.unoesc.smo.aula00.Cliente;
import br.edu.unoesc.smo.aula00.Conta;
import br.edu.unoesc.smo.aula00.Corrente;
import br.edu.unoesc.smo.aula00.Poupanca;

public class ContaTest {

	@Test
	public void deveDepositar100Reais(){
		Conta conta = new Poupanca();
		conta.depositar(100.0);
		assertEquals(Double.valueOf(100.0), conta.getSaldo());
	}
	
	@Test
	public void naoDeveSacar100ReaisPoupanca(){
		Conta conta = new Poupanca();
		conta.sacar(100.0);
		assertEquals(Double.valueOf(0.0), conta.getSaldo());
	}
	
	@Test
	public void deveSacar100ReaisPoupanca(){
		Poupanca poupanca = new Poupanca();
		poupanca.setRendimento(100.0);
		poupanca.depositar(200.00);
		poupanca.sacar(100.00);
		assertEquals(Double.valueOf(100.0), poupanca.getSaldo());
	}
	@Test
	public void deveSacarLimiteCorrente(){
		Corrente corrente = new Corrente();
		corrente.setLimite(300.0);
		corrente.depositar(100.0);
		corrente.sacar(200.0);
		assertEquals(Double.valueOf(-100.0), corrente.getSaldo());
	}
	
	
	
	
	
	@Test
	public void devePopularCliente(){
		Cliente cliente = new Cliente("Andre", "9999");
		Conta conta = new Poupanca();
		conta.setCliente(cliente);
		//só para ver a navegação
		System.out.println(conta.getCliente().getNome());
		//testa se é o mesmo cliente
		assertEquals(cliente, conta.getCliente());
		assertEquals(conta, cliente.getContas().get(0));
	}
	
	@Test
	public void deveCalcularSaldoGeral(){
		Cliente cliente = new Cliente("Andre", "9999");
		Conta conta = new Poupanca();
		conta.depositar(100.00);
		conta.setCliente(cliente);
		
		Conta conta2 = new Poupanca();
		conta2.depositar(300.00);
		conta2.setCliente(cliente);
		
		assertEquals(Double.valueOf(400.00), cliente.calcularSaldoGeral());
		
	}
	
	
	
}
