/**
 * 
 */
package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Clientes;

/**
 * 
 */
@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Integer> {

}
