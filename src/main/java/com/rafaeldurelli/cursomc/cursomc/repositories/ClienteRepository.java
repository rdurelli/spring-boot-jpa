package com.rafaeldurelli.cursomc.cursomc.repositories;


import com.rafaeldurelli.cursomc.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
