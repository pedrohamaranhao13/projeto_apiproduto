package br.com.smarttec.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.smarttec.domain.entities.Categoria;
import br.com.smarttec.domain.irterfaces.CategoriaService;
import br.com.smarttec.repositories.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Override
	public List<Categoria> findAll() throws Exception {
		return (List<Categoria>) categoriaRepository.findAll();
	}

	
}
