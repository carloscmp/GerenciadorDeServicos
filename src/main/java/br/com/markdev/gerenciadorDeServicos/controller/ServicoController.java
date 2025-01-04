package br.com.markdev.gerenciadorDeServicos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.markdev.gerenciadorDeServicos.dto.ServicoDTO;
import br.com.markdev.gerenciadorDeServicos.service.ServicoService;

@RestController
@RequestMapping(value = "/servico")
@CrossOrigin
public class ServicoController {

	@Autowired
	private ServicoService servicoService;
	
	@GetMapping
	public List<ServicoDTO> listarTodos(){
		return servicoService.listarTodos();
	}
	
	@PostMapping
	public void inserir(@RequestBody ServicoDTO servico) {
		servicoService.inserir(servico);
	}
	
}
