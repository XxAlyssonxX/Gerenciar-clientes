package com.gerenciador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciador.entities.Gerenciamento;

public interface  GerenciamentoRepository extends JpaRepository<Gerenciamento,Long>{

}
