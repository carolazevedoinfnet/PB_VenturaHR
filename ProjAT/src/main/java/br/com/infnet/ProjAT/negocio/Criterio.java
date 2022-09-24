package br.com.infnet.ProjAT.negocio;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.com.infnet.ProjAT.negocio.Resposta;

@Entity
@Table (name ="TCriterios")
public class Criterio {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String nome;
	private Integer perfil;
	private Integer peso;
	
	 
	@ManyToMany(mappedBy = "criterios", cascade = CascadeType.DETACH)
	private List<Resposta> respostas;

	public Criterio() {		
	}
	
	public Criterio(Integer id, String nome, Integer perfil, Integer peso, List<Resposta> respostas) {
		super();
		this.id = id;
		this.nome = nome;
		this.perfil = perfil;
		this.peso = peso;
		this.respostas = respostas;
		
		
	}
	
	@Override
	public String toString() {
		return this.getNome();
	}

	public void imprimir() {
		System.out.println(this);

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

	public Integer getPerfil() {
		return perfil;
	}

	public void setPerfil(Integer perfil) {
		this.perfil = perfil;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	
	  public List<Resposta> getRespostas() { return respostas; } public void
	  setRespostas(List<Resposta> respostas) { this.respostas = respostas; }
	 
}