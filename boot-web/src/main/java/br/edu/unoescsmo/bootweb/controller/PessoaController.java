package br.edu.unoescsmo.bootweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.unoescsmo.bootweb.model.Pessoa;
import br.edu.unoescsmo.bootweb.regras.PessoaRegra;

@Controller
public class PessoaController {

	@Autowired
	private PessoaRegra pessoaRegra;
	
	@GetMapping("/pessoa/salvar")
	@ResponseBody
	public String salvar(){
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("999999");
		pessoa.setNome("André");
		pessoaRegra.salvar(pessoa);
		return "salvo com sucesso";
	}
	
	@GetMapping("/pessoa/listar")
	@ResponseBody
	public List<Pessoa> listar(){
		return pessoaRegra.listar();
	}
	
	@GetMapping("/pessoa/deletar")
	@ResponseBody
	public String deletar(){
		pessoaRegra.delete(new Pessoa(1L));
		return "pessoa deletada";
	}
	
	@GetMapping("/pessoa/cpf/{cpf}")
	@ResponseBody
	public List<Pessoa> listarCpf(@PathVariable("cpf")String cpf){
		return pessoaRegra.listarPorCPF(cpf);
	}
	
	@GetMapping("/pessoa/nome/{nome}")
	@ResponseBody
	public List<Pessoa> listarNome(@PathVariable("nome")String nome){
		return pessoaRegra.listarPorNome(nome);
	}
}
