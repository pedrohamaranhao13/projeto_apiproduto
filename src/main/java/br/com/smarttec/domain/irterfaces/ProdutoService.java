package br.com.smarttec.domain.irterfaces;

import java.util.List;
import java.util.UUID;

import br.com.smarttec.domain.entities.Produto;
import br.com.smarttec.dtos.ProdutoPostDto;
import br.com.smarttec.dtos.ProdutoPutDto;

public interface ProdutoService {

	void create(ProdutoPostDto dto) throws Exception;
	void update(ProdutoPutDto produto) throws Exception;
	void delete(UUID id) throws Exception;
	
	List<Produto> findAll() throws Exception;
	Produto findById(UUID id) throws Exception;
}
