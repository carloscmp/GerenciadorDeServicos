package br.com.markdev.gerenciadorDeServicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.markdev.gerenciadorDeServicos.dto.AgendamentoDTO;
import br.com.markdev.gerenciadorDeServicos.entity.AgendamentoEntity;
import br.com.markdev.gerenciadorDeServicos.repository.AgendamentoRepository;

@Service
public class AgendamentoService {

	@Autowired
	private AgendamentoRepository agendamentoRepository;

	public List< AgendamentoDTO> listarTodos() {
		List< AgendamentoEntity> agendamentos = agendamentoRepository.findAll();
		return agendamentos.stream().map(AgendamentoDTO::new).toList();
	}

	public void inserir( AgendamentoDTO agendamento) {
		AgendamentoEntity agendamentoEntity = new  AgendamentoEntity(agendamento);
		agendamentoRepository.save(agendamentoEntity);
	}
	
}
