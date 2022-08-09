package br.com.kadu.nextlevelkadu.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.kadu.nextlevelkadu.model.Cliente;

public class ClienteDto {

	@NotNull 
	@NotEmpty 
	@Size(min = 5, max = 50)
	private String nome;
		
	@NotNull
	@NotEmpty
	private String cpf;
	
	public ClienteDto() {
		super();
	}

	public ClienteDto(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
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
	
	public Cliente toEntity() {
		return new Cliente(this);
	}

}


