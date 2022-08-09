package br.com.kadu.nextlevelkadu.model;

import java.io.Serializable;

public class MicrozonaFaixasCepPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private String codigoMicrozona;
	private Integer codigo;
	
	public MicrozonaFaixasCepPK() {
	
	}

	public MicrozonaFaixasCepPK(String codigoMicrozona, Integer codigo) {
		super();
		this.codigoMicrozona = codigoMicrozona;
		this.codigo = codigo;
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
		RotaDeEntregaPK other = (RotaDeEntregaPK) obj;
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
