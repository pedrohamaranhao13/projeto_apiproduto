package br.com.smarttec.domain.irterfaces;

import java.util.List;

import br.com.smarttec.domain.entities.Categoria;

public interface CategoriaService {
	
	List<Categoria> findAll() throws Exception;

}
