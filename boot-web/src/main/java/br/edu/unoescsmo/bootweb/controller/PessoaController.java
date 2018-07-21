package br.edu.unoescsmo.bootweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.unoescsmo.bootweb.model.Pessoa;
import br.edu.unoescsmo.bootweb.regras.PessoaRegra;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	private PessoaRegra pessoaRegra;
	
	@PostMapping("/salvar")
	public String salvar(Pessoa pessoa){
		pessoaRegra.salvar(pessoa);
		return "redirect:/pessoa/listar";
	}
	
	@GetMapping("/listar")
	public String listar(Model model){
		//Torna a lista de pessoa acessivel no JSP
		model.addAttribute("pessoas", pessoaRegra.listar());
		//Caminho + Nome do jsp que será renderizado para a tela
		return "pessoa/lista";
	}
	
	@GetMapping("/novo")
	public String novo(){
		return "pessoa/novo";
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
