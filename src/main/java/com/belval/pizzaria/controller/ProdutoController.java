package com.belval.pizzaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.belval.pizzaria.entity.Produto;
import com.belval.pizzaria.repository.ProdutoRepository;

public class ProdutoController {
//ctrl + shift + o importa as dependencias
	@Autowired
    private ProdutoRepository repository;
	@GetMapping("/produtos")
		public ResponseEntity<Iterable<Produto>> obterProdutos() {
			return ResponseEntity
					.status(HttpStatus.OK)
					.body(repository.findAll());
		}
}
