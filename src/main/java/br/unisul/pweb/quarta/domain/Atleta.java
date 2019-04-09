package br.unisul.pweb.quarta.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Atleta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private ArrayList<String> modalidades = new ArrayList<String>();
	
	@ManyToMany
	@JoinTable(name="ATLETA_COMPETICAO", 
		joinColumns = @JoinColumn(name = "atletas_id"),
		inverseJoinColumns = @JoinColumn(name = "compeicoes_id")
	)
	private List<Competicao> competicoes = new ArrayList<>();
	
	public Atleta() {
	}
	
	public Atleta(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getModalidades() {
		return modalidades;
	}

	public void setModalidades(ArrayList<String> modalidades) {
		this.modalidades = modalidades;
	}

	public List<Competicao> getCompeticoes() {
		return competicoes;
	}

	public void setCompeticoes(List<Competicao> competicoes) {
		this.competicoes = competicoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atleta other = (Atleta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
