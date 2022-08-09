package br.com.kadu.nextlevelkadu.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(value = MicrozonaFaixasCepPK.class)
public class MicrozonaFaixasCep implements Serializable{
	private static final long serialVersionUID = 1L;

	// chave primaria composta
	@Id
	@Column(name = "microzona")
	private String codigoMicrozona;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MICROZONAFAIXASCEP_SEQ")
	private Integer codigo;
	
	// atributos
	private String cepInicial;
	private String cepFinal;
	
	public MicrozonaFaixasCep() {

	}

	public MicrozonaFaixasCep(String codigoMicrozona, Integer codigo, String cepInicial, String cepFinal, Microzona microzona{
		super();
		this.codigoMicrozona = codigoMicrozona;
		this.codigo = codigo;
		this.cepInicial = cepInicial;
		this.cepFinal = cepFinal;
//		this.microzona = microzona;
	}

	public String getCodigoMicrozona() {
		return codigoMicrozona;
	}

	public void setCodigoMicrozona(String siglaDoEstado) {
		this.codigoMicrozona = siglaDoEstado;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCepInicial() {
		return cepInicial;
	}

	public void setCepInicial(String nome) {
		this.cepInicial = cepInicial;
	}

	public String getCepFinal() {
		return cepFinal;
	}

	public void setCepFinal(String status) {
		this.cepFinal = status;
	}

//	public Microzona getMicrozona() {
//		return microzona;
//	}
//
//	public void setMicrozona(Microzona microzona) {
//		this.microzona = microzona;
//	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((codigoMicrozona == null) ? 0 : codigoMicrozona.hashCode());
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
		RotaDeEntrega other = (RotaDeEntrega) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (codigoMicrozona == null) {
			if (other.codigoMicrozona != null)
				return false;
		} else if (!codigoMicrozona.equals(other.codigoMicrozona))
			return false;
		return true;
	}
		

}
