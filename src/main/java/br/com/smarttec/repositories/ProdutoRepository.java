package br.com.smarttec.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.smarttec.domain.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, UUID>{

}
