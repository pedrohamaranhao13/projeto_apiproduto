package br.com.smarttec.domain.entities;

import java.util.UUID;

import lombok.Data;

@Data
public class Produto {

	private UUID id;
	private String nome;
	private String descricao;
	private Double preco;
	private Integer quantidade;
	private Fornecedor fornecedor;
	private Categoria categoria;
	
}
