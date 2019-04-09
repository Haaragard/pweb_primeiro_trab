package br.unisul.pweb.quarta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unisul.pweb.quarta.domain.Competicao;

@Repository
public interface CompeticaoRepository extends JpaRepository<Competicao, Integer>{

}
