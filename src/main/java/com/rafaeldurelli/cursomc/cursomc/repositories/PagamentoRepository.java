package com.rafaeldurelli.cursomc.cursomc.repositories;

import com.rafaeldurelli.cursomc.cursomc.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
