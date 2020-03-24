package com.bbva.bdcb.dto.personas;

import com.bbva.apx.dto.AbstractDTO;

public class DataIn extends AbstractDTO{
	private static final long serialVersionUID = 2967738299478120150L;
	private String numeroDeTarjeta;
	private String numeroDeCuotas;
	
	/**
	 * Constructor
	 */
	public DataIn(){}

	/**
	 * @return
	 * Method to get
	 */
	public String getNumeroDeTarjeta() {
		return numeroDeTarjeta;
	}

	/**
	 * @param numeroDeTarjeta
	 * Method to set
	 */
	public void setNumeroDeTarjeta(String numeroDeTarjeta) {
		this.numeroDeTarjeta = numeroDeTarjeta;
	}
	
	/**
	 * @return
	 * Method to get
	 */
	public String getNumeroDeCuotas(){
		return numeroDeCuotas;
	}
	
	/**
	 * @param numeroDeCuotas
	 * Method to set
	 */
	public void setNumeroDeCuotas(String numeroDeCuotas){
		this.numeroDeCuotas = numeroDeCuotas;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDeCuotas == null) ? 0 : numeroDeCuotas.hashCode());
		result = prime * result + ((numeroDeTarjeta == null) ? 0 : numeroDeTarjeta.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataIn other = (DataIn) obj;
		if (numeroDeCuotas == null) {
			if (other.numeroDeCuotas != null)
				return false;
		} else if (!numeroDeCuotas.equals(other.numeroDeCuotas))
			return false;
		if (numeroDeTarjeta == null) {
			if (other.numeroDeTarjeta != null)
				return false;
		} else if (!numeroDeTarjeta.equals(other.numeroDeTarjeta))
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DataIn [numeroDeTarjeta=" + numeroDeTarjeta + ", numeroDeCuotas=" + numeroDeCuotas + "]";
	}

}
