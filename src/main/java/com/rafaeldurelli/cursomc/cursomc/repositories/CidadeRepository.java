package com.rafaeldurelli.cursomc.cursomc.repositories;

import com.rafaeldurelli.cursomc.cursomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
