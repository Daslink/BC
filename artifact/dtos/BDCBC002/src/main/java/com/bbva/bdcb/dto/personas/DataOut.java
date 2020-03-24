package com.bbva.bdcb.dto.personas;

import java.util.Arrays;

import com.bbva.apx.dto.AbstractDTO;

public class DataOut extends AbstractDTO {
	private static final long serialVersionUID = 4527030947955455380L;
	private String entidad;
	private String centro;
	private String producto;
	private String NumeroContrato;
	private String nombreTitular;
	private String direccionTitular;
	private String[] cuotas;
	
	/**
	 * Constructor
	 */
	public DataOut(){}

	/**
	 * @return
	 * Method to get
	 */
	public String getEntidad() {
		return entidad;
	}

	/**
	 * @param entidad
	 * Method to set
	 */
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getCentro() {
		return centro;
	}

	/**
	 * @param entidad
	 * Method to set
	 */
	public void setCentro(String centro) {
		this.centro = centro;
	}
	
	/**
	 * @return
	 * Method to get
	 */
	public String getProducto() {
		return producto;
	}

	/**
	 * @param entidad
	 * Method to set
	 */
	public void setProducto(String producto) {
		this.producto = producto;
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getNumeroContrato() {
		return NumeroContrato;
	}

	/**
	 * @param entidad
	 * Method to set
	 */
	public void setNumeroContrato(String numeroContrato) {
		NumeroContrato = numeroContrato;
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getNombreTitular() {
		return nombreTitular;
	}

	/**
	 * @param entidad
	 * Method to set
	 */
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getDireccionTitular() {
		return direccionTitular;
	}

	/**
	 * @return
	 * Method to get
	 */
	public void setDireccionTitular(String direccionTitular) {
		this.direccionTitular = direccionTitular;
	}

	/**
	 * @param entidad
	 * Method to set
	 */
	public String[] getCuotas() {
		return cuotas;
	}

	/**
	 * @return
	 * Method to get
	 */
	public void setCuotas(String[] cuotas) {
		this.cuotas = cuotas;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((NumeroContrato == null) ? 0 : NumeroContrato.hashCode());
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
		result = prime * result + Arrays.hashCode(cuotas);
		result = prime * result + ((direccionTitular == null) ? 0 : direccionTitular.hashCode());
		result = prime * result + ((entidad == null) ? 0 : entidad.hashCode());
		result = prime * result + ((nombreTitular == null) ? 0 : nombreTitular.hashCode());
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
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
		DataOut other = (DataOut) obj;
		if (NumeroContrato == null) {
			if (other.NumeroContrato != null)
				return false;
		} else if (!NumeroContrato.equals(other.NumeroContrato))
			return false;
		if (centro == null) {
			if (other.centro != null)
				return false;
		} else if (!centro.equals(other.centro))
			return false;
		if (!Arrays.equals(cuotas, other.cuotas))
			return false;
		if (direccionTitular == null) {
			if (other.direccionTitular != null)
				return false;
		} else if (!direccionTitular.equals(other.direccionTitular))
			return false;
		if (entidad == null) {
			if (other.entidad != null)
				return false;
		} else if (!entidad.equals(other.entidad))
			return false;
		if (nombreTitular == null) {
			if (other.nombreTitular != null)
				return false;
		} else if (!nombreTitular.equals(other.nombreTitular))
			return false;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DataOut [entidad=" + entidad + ", centro=" + centro + ", producto=" + producto + ", NumeroContrato="
				+ NumeroContrato + ", nombreTitular=" + nombreTitular + ", direccionTitular=" + direccionTitular
				+ ", cuotas=" + Arrays.toString(cuotas) + "]";
	}
}
