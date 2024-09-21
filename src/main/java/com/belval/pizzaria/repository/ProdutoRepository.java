package com.belval.pizzaria.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.belval.pizzaria.entity.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
    
    //Select * from Produto where descricao = <parametro>
    //List<Produto> findByDescricaoContains(String descricao);
    List<Produto> findByDescricao(String descricao);

}
