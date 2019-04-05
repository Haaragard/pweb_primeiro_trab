package br.unisul.pweb.quarta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unisul.pweb.quarta.domain.Atleta;
import br.unisul.pweb.quarta.domain.Competicao;

@Repository
public interface AtletaRepository extends JpaRepository<Atleta, Integer>{
	
	List<Atleta> findDistinctByNomeContainingAndCompeticoesIn(
			String nome,
			List<Competicao> competicoes
	);
}
