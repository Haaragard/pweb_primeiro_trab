package br.unisul.pweb.quarta.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.quarta.domain.Atleta;
import br.unisul.pweb.quarta.domain.Competicao;
import br.unisul.pweb.quarta.repository.AtletaRepository;
import br.unisul.pweb.quarta.repository.CompeticaoRepository;

@Service
public class DbService {
	
	@Autowired
	private AtletaRepository atletaRepository;
	
	@Autowired
	private CompeticaoRepository competicaoRepository;

	public void inicializaBancoDeDados() throws ParseException {
	
		Competicao c1 = new Competicao(null, "Corrida de 10KM");
		Competicao c2 = new Competicao(null, "Corrida de 20KM");
		Competicao c3 = new Competicao(null, "Corrida de 30KM");
		Competicao c4 = new Competicao(null, "Corrida de 40KM");
		Competicao c5 = new Competicao(null, "Corrida de 50KM");
		Competicao c6 = new Competicao(null, "Natação de 10KM");
		Competicao c7 = new Competicao(null, "Natação de 20KM");
		Competicao c8 = new Competicao(null, "Natação de 30KM");
		Competicao c9 = new Competicao(null, "Natação de 40KM");
		Competicao c10 = new Competicao(null, "Natação de 50KM");
		
		Atleta at1 = new Atleta(null, "Diogo");
		at1.getModalidades().add("Corrida");
		at1.getModalidades().add("Natação");
		at1.getCompeticoes().add(c1);
		at1.getCompeticoes().add(c2);
		at1.getCompeticoes().add(c3);
		at1.getCompeticoes().add(c5);
		at1.getCompeticoes().add(c8);
		Atleta at2 = new Atleta(null, "Pedro");
		at2.getModalidades().add("Corrida");
		at2.getCompeticoes().add(c1);
		at2.getCompeticoes().add(c2);
		at2.getCompeticoes().add(c3);
		at2.getCompeticoes().add(c4);
		at2.getCompeticoes().add(c5);
		Atleta at3 = new Atleta(null, "Guilherme");
		at3.getModalidades().add("Corrida");
		at3.getModalidades().add("Natação");
		at3.getCompeticoes().add(c1);
		at3.getCompeticoes().add(c2);
		at3.getCompeticoes().add(c5);
		at3.getCompeticoes().add(c9);
		Atleta at4 = new Atleta(null, "Anderson");
		at4.getModalidades().add("Natação");
		at3.getCompeticoes().add(c6);
		at3.getCompeticoes().add(c7);
		at3.getCompeticoes().add(c8);
		at3.getCompeticoes().add(c9);
		at3.getCompeticoes().add(c10);
		
		competicaoRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10));
		atletaRepository.saveAll(Arrays.asList(at1, at2, at3));
		
	}
}
