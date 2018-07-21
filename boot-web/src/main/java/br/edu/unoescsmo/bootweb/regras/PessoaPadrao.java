package br.edu.unoescsmo.bootweb.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.bootweb.model.Pessoa;
import br.edu.unoescsmo.bootweb.repository.PessoaRepository;

@Service
public class PessoaPadrao implements PessoaRegra{

	@Autowired
	private PessoaRepository pessoaRepository; 
	
	@Override
	public void salvar(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}
	
	public void delete(Pessoa pessoa){
		pessoaRepository.delete(pessoa);
	}
	
	public List<Pessoa> listar(){
		return pessoaRepository.findAll();
	}
	
	@Override
	public List<Pessoa> listarPorCPF(String cpf) {
		return pessoaRepository.porCpf(cpf);
	}
	
	@Override
	public List<Pessoa> listarPorNome(String nome) {
		return pessoaRepository.findByNomeLike("%"+nome+"%");
	}

	@Override
	public Pessoa buscarPorCodigo(Long codigo) {
		return pessoaRepository.findById(codigo).orElse(new Pessoa());
	}
	
	@Override
	public List<Pessoa> dadosGrid(){
		return pessoaRepository.dadosGrid();
	}
	
}
