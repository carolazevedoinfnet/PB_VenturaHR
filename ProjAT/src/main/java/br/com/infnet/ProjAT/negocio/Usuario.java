package br.com.infnet.ProjAT.negocio;


import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "TUsuario")
public class Usuario {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String nome;
	private String endereco;
	private String telefone;
	private String login;
	private String email;
	private String senha;
	private String cpf;
	private Character tipo;
	public static final char ADMINISTRADOR = 'A';
	public static final char CANDIDATO = 'C';
	public static final char EMPRESA = 'E';
	

	
	public Usuario() {
		
	}
	
	
	public Usuario(String nome, String endereco, String telefone, String login, String email, String senha, String cpf, String razao, String cnpj, Character tipo ) {
		this();
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setLogin(login);
		this.setEmail(email);
		this.setSenha(senha);
		this.setCpf(cpf);
		this.setTipo(tipo);
	
	}

	
	@Override
	public String toString() {
		return String.format("%s - %s - %s", 

				this.nome,
				this.login,
				this.senha
	
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


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Character getTipo() {
		return tipo;
	}


	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}


	public static char getAdministrador() {
		return ADMINISTRADOR;
	}


	public static char getCandidato() {
		return CANDIDATO;
	}


	public static char getEmpresa() {
		return EMPRESA;
	}
	


}