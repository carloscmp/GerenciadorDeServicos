package br.com.markdev.gerenciadorDeServicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.markdev.gerenciadorDeServicos.entity.ServicoEntity;

public interface ServicoRepository extends JpaRepository<ServicoEntity, Long>{

}
