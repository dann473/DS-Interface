package model.entity;

public class Funcionario {
	private Integer codigo;
	private String nome;
	private String cpf;
	private String senha;
	
	
	public Funcionario(Integer codigo, String nome, String cpf, String senha) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
