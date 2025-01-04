package br.com.markdev.gerenciadorDeServicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.markdev.gerenciadorDeServicos.entity.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long>{

}
