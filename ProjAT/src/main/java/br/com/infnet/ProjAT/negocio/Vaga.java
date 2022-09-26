package br.com.infnet.ProjAT.negocio;


import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.infnet.ProjAT.negocio.Criterio;

@Entity
@Table (name = "TVaga")
public class Vaga {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	

	private Integer id;
	private String cargo;
	private String descricao;
	private String empresa;
	private String cidade;
	private String estado;
	private String contratacao;
	private Date data;
	
	ArrayList <Criterio> criterios;
	



	public Vaga() {
	}


	public Vaga(Integer id, String cargo, String descricao,String empresa, String cidade, String estado, String contratacao, Date data) {
		this.setId(id);
		this.setCargo(cargo);
		this.setDescricao(descricao);
		this.setEmpresa(empresa);
		this.setCidade(cidade);
		this.setEstado(estado);
		this.setContratacao(contratacao);
		this.setData(data);
	}

	@Override
	public String toString() {

		return String.format ("%s", this.getCargo());

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



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String getEmpresa() {
		return empresa;
	}



	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getContratacao() {
		return contratacao;
	}



	public void setContratacao(String contratacao) {
		this.contratacao = contratacao;
	}



	public Date getData() {
		return data;
	}



	public void setData(Date data) {
		this.data = data;
	}



	public ArrayList<Criterio> getCriterios() {
		return criterios;
	}



	public void setCriterios(ArrayList<Criterio> criterios) {
		this.criterios = criterios;
	}

	

}