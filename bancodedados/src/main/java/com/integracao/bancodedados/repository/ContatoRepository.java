package com.integracao.bancodedados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.integracao.bancodedados.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
