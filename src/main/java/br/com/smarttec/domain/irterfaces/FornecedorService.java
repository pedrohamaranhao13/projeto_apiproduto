package br.com.smarttec.domain.irterfaces;

import java.util.List;

import br.com.smarttec.domain.entities.Fornecedor;

public interface FornecedorService {

	List<Fornecedor> findAll() throws Exception;
}
