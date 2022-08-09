package br.com.kadu.nextlevelkadu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.kadu.nextlevelkadu.dto.ClienteDto;

@Entity //defino que o objeto é uma tabela, tenta criar a estrutura, se o nome da tabela for diferente da definição @Entity(name = "CLI"
public class Cliente {
	
    @Id //Define a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incremento, código é sequencial
	private Integer codigo;
	private String nome;
	private String cpf;

	public Cliente() {
		super();
	}

	public Cliente(Integer codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
	}

	public Cliente(ClienteDto clienteDto) {
		this.codigo = null;
		this.nome = clienteDto.getNome();
		this.cpf = clienteDto.getCpf();
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Cliente other = (Cliente) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
		
}
