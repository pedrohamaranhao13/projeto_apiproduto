package br.com.smarttec.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.smarttec.domain.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, UUID>{

}
