package br.com.infnet.ProjAT.negocio;


import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table (name = "TResposta")
public class Resposta {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(columnDefinition = "DATE")
	private LocalDate data;
	
	
	@ManyToMany(cascade = CascadeType.DETACH)
	@JoinTable(name ="TRespostaCriterios",
		joinColumns = {@JoinColumn(name="idResposta")},
		inverseJoinColumns = {@JoinColumn(name="idCriterio")})	
	
	private List<Criterio> criterios;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	@JoinColumn(name = "idVaga")
	private Vaga vaga;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	

	public Resposta() {
		
	}
	

	@Override
	public String toString() {
		return String.format("%d - Resposta para %s ,dia: %s.", 
		
				this.id,
				this.vaga,
				this.data
			
			
				);
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



	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}



	public Vaga getVaga() {
		return vaga;
	}


	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public List<Criterio> getCriterios() {
		return criterios;
	}


	public void setCriterios(List<Criterio> criterios) {
		this.criterios = criterios;
	}


	
}