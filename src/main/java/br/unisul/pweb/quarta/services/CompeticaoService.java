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
public class CompeticaoService {

	@Autowired
	private CompeticaoRepository competicaoRepository;

	@Autowired
	private AtletaRepository atletaRepository;
	
	public Competicao find(Integer id) {
		Optional<Competicao> obj = competicaoRepository.findById(id);
		return obj.orElse(null);
	}
	
	public List<Competicao> search(String nome, List<Integer> ids) {
		List<Atleta> atletas = atletaRepository.findAllById(ids);
		return competicaoRepository.findDistinctByNomeContainingAndAtletasIn(nome, atletas);
	}
}
