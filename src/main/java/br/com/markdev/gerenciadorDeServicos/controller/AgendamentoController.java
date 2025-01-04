package br.com.markdev.gerenciadorDeServicos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.markdev.gerenciadorDeServicos.dto.AgendamentoDTO;
import br.com.markdev.gerenciadorDeServicos.service.AgendamentoService;

@RestController
@RequestMapping(value = "/agendamento")
@CrossOrigin
public class AgendamentoController {

	@Autowired
	private AgendamentoService agendamentoService;
	
	@GetMapping
	public List<AgendamentoDTO> listarTodos(){
		return agendamentoService.listarTodos();
	}
	
	@PostMapping
	public void inserir(@RequestBody AgendamentoDTO agendamento) {
		agendamentoService.inserir(agendamento);
	}
	
}
