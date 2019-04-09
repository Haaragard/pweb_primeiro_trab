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
	
		Competicao c1 = new Competicao(null, "Corrida de 10KM", "01/01/2018");
		Competicao c2 = new Competicao(null, "Corrida de 20KM", "03/02/2018");
		Competicao c3 = new Competicao(null, "Corrida de 30KM", "07/03/2018");
		Competicao c4 = new Competicao(null, "Corrida de 40KM", "02/04/2018");
		Competicao c5 = new Competicao(null, "Corrida de 50KM", "23/05/2018");
		Competicao c6 = new Competicao(null, "Natação de 10KM", "10/06/2018");
		Competicao c7 = new Competicao(null, "Natação de 20KM", "15/07/2018");
		Competicao c8 = new Competicao(null, "Natação de 30KM", "18/08/2018");
		Competicao c9 = new Competicao(null, "Natação de 40KM", "05/09/2018");
		Competicao c10 = new Competicao(null, "Natação de 50KM", "19/10/2018");
		
		Atleta at1 = new Atleta(null, "Diogo");
		at1.getModalidades().add("Corrida");
		at1.getModalidades().add("Natação");
		at1.getCompeticoes().addAll(Arrays.asList(c1, c2, c3, c4, c5, c8));
		Atleta at2 = new Atleta(null, "Pedro");
		at2.getModalidades().add("Corrida");
		at2.getCompeticoes().addAll(Arrays.asList(c1, c2, c3, c4, c5));
		Atleta at3 = new Atleta(null, "Guilherme");
		at3.getModalidades().add("Corrida");
		at3.getModalidades().add("Natação");
		at3.getCompeticoes().addAll(Arrays.asList(c1, c2, c5, c9));
		Atleta at4 = new Atleta(null, "Anderson");
		at4.getModalidades().add("Natação");
		at4.getCompeticoes().addAll(Arrays.asList(c6, c7, c8, c9, c10));
		
		competicaoRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10));
		atletaRepository.saveAll(Arrays.asList(at1, at2, at3));
		
	}
}
