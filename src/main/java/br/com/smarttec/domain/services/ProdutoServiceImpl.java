package br.com.smarttec.domain.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.smarttec.domain.entities.Produto;
import br.com.smarttec.domain.irterfaces.ProdutoService;
import br.com.smarttec.repositories.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService{
	
	@Autowired
	ProdutoRepository produtoRepository;

	@Override
	public void create(Produto produto) throws Exception {
		produtoRepository.save(produto);
		
	}

	@Override
	public void update(Produto produto) throws Exception {
		produtoRepository.save(produto);
		
	}

	@Override
	public void delete(UUID id) throws Exception {
		Produto produto = findById(id);
		produtoRepository.delete(produto);
		
	}

	@Override
	public List<Produto> findAll() throws Exception {
		return (List<Produto>) produtoRepository.findAll();
	}

	@Override
	public Produto findById(UUID id) throws Exception {
		return produtoRepository.findById(id).get();
	}


}
