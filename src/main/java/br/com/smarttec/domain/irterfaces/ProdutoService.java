package br.com.smarttec.domain.irterfaces;

import java.util.List;
import java.util.UUID;

import br.com.smarttec.domain.entities.Produto;

public interface ProdutoService {

	void create(Produto produto) throws Exception;
	void update(Produto produto) throws Exception;
	void delete(UUID id) throws Exception;
	
	List<Produto> findAll() throws Exception;
	Produto findById(UUID id) throws Exception;
}
