package model.entity;

import java.time.LocalDate;

public class Aluno {
	private String codigo;
	private String nome;
	private String cpf;
	private LocalDate dataNascimento;
	private Plano tipo;
	
	public Aluno(String codigo, String nome, String cpf, LocalDate dataNascimento, Plano tipo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.tipo = tipo;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
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
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Plano getTipo() {
		return tipo;
	}
	public void setTipo(Plano tipo) {
		this.tipo = tipo;
	}
	
	
	
}
