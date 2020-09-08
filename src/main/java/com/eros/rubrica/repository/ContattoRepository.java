package com.eros.rubrica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eros.rubrica.model.Contatto;

@Repository("contattoRepository")
public interface ContattoRepository extends JpaRepository<Contatto, Long>{

}
