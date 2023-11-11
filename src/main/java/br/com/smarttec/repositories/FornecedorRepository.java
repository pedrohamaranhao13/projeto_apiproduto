package br.com.smarttec.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.smarttec.domain.entities.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, UUID>{

}
