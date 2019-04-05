package br.unisul.pweb.quarta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.quarta.domain.Atleta;
import br.unisul.pweb.quarta.domain.Competicao;
import br.unisul.pweb.quarta.repository.AtletaRepository;
import br.unisul.pweb.quarta.repository.CompeticaoRepository;

@Service
public class AtletaService {

	@Autowired
	private AtletaRepository atletaRepository;
	
	@Autowired
	private CompeticaoRepository competicaoRepository;
	
	public Atleta find(Integer id) {
		Optional<Atleta> obj = atletaRepository.findById(id);
		return obj.orElse(null);
	}
	
	public List<Atleta> search(String nome, List<Integer> ids) {
		List<Competicao> competicoes = competicaoRepository.findAllById(ids);
		return atletaRepository.findDistinctByNomeContainingAndCompeticoesIn(nome,competicoes);
	}
	
}
