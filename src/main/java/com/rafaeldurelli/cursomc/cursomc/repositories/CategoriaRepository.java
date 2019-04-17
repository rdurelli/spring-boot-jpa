package com.rafaeldurelli.cursomc.cursomc.repositories;

import com.rafaeldurelli.cursomc.cursomc.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
