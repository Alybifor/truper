/**
 * 
 */
package com.example.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 
 */
@Valid
public class ClientesDTO {
	
	//@NotNull
	//@NotBlank
	//@NotBlank
	private String nombreCliente;

	//@NotNull
	//@NotBlank
	//@NotBlank
	private String nombreListaCompra;
	
	/**
	 * 
	 */
	public ClientesDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the nombreCliente
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}

	/**
	 * @param nombreCliente the nombreCliente to set
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	/**
	 * @return the nombreListaCompra
	 */
	public String getNombreListaCompra() {
		return nombreListaCompra;
	}

	/**
	 * @param nombreListaCompra the nombreListaCompra to set
	 */
	public void setNombreListaCompra(String nombreListaCompra) {
		this.nombreListaCompra = nombreListaCompra;
	}

}
