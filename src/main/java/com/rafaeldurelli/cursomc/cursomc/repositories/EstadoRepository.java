package com.rafaeldurelli.cursomc.cursomc.repositories;

import com.rafaeldurelli.cursomc.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
