package br.com.markdev.gerenciadorDeServicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.markdev.gerenciadorDeServicos.dto.ServicoDTO;
import br.com.markdev.gerenciadorDeServicos.entity.ServicoEntity;
import br.com.markdev.gerenciadorDeServicos.repository.ServicoRepository;

@Service
public class ServicoService {

	@Autowired
	private ServicoRepository servicoRepository;
	
	public List<ServicoDTO> listarTodos(){
		List<ServicoEntity> servicos = servicoRepository.findAll();
		return servicos.stream().map(ServicoDTO::new).toList();
	}
	
	public void inserir(ServicoDTO servico) {
		ServicoEntity servicoEntity = new ServicoEntity(servico);
		servicoRepository.save(servicoEntity);
	}
	
}
