package io.github.jonathan.clientes.model.repository;

import io.github.jonathan.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
