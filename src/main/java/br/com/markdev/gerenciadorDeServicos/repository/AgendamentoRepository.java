package br.com.markdev.gerenciadorDeServicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.markdev.gerenciadorDeServicos.entity.AgendamentoEntity;

public interface AgendamentoRepository extends JpaRepository<AgendamentoEntity, Long>{

}
