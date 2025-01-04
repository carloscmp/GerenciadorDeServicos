package br.com.markdev.gerenciadorDeServicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.markdev.gerenciadorDeServicos.dto.ClienteDTO;
import br.com.markdev.gerenciadorDeServicos.entity.ClienteEntity;
import br.com.markdev.gerenciadorDeServicos.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<ClienteDTO> listarTodos(){
		List<ClienteEntity> clientes = clienteRepository.findAll();
		return clientes.stream().map(ClienteDTO::new).toList();
	}
	
	public void inserir(ClienteDTO cliente) {
		ClienteEntity clienteEntity = new ClienteEntity(cliente);
		clienteRepository.save(clienteEntity);
	}
	
}
