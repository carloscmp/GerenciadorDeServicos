package br.com.markdev.gerenciadorDeServicos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.markdev.gerenciadorDeServicos.dto.ClienteDTO;
import br.com.markdev.gerenciadorDeServicos.service.ClienteService;

@RestController
@RequestMapping(value = "/cliente")
@CrossOrigin
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<ClienteDTO> listarTodos(){
		return clienteService.listarTodos();
	}
	
	@PostMapping
	public void inserir(@RequestBody ClienteDTO cliente) {
		clienteService.inserir(cliente);
	}
	
}
