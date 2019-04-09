package br.unisul.pweb.quarta.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.quarta.domain.Competicao;
import br.unisul.pweb.quarta.repository.CompeticaoRepository;


@Service
public class CompeticaoService {

	@Autowired
	private CompeticaoRepository competicaoRepository;
	
	public Competicao find(Integer id) {
		Optional<Competicao> obj = competicaoRepository.findById(id);
		return obj.orElse(null);
	}
}
