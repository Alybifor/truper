/**
 * 
 */
package com.example.service;

import java.util.List;

import com.example.dto.ClientesDTO;
import com.example.entity.Clientes;

/**
 * 
 */
public interface ClientesService {
	
	List<Clientes> findByIdCliente(int idCliente);
	
	boolean saveClientes(ClientesDTO cliente);

}
