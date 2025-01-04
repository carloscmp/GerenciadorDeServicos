package br.com.markdev.gerenciadorDeServicos.dto;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;

import br.com.markdev.gerenciadorDeServicos.entity.AgendamentoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AgendamentoDTO {

	private Long id;
	private ClienteDTO cliente;
	private ServicoDTO servico;
	private LocalDateTime dataHora;
	private Boolean confirmado = false;

	public AgendamentoDTO(AgendamentoEntity agendamento) {
		BeanUtils.copyProperties(agendamento, this);
		if (agendamento != null && agendamento.getCliente() != null) {
			this.cliente = new ClienteDTO(agendamento.getCliente());
		}
		if (agendamento != null && agendamento.getServico() != null) {
			this.servico = new ServicoDTO(agendamento.getServico());
		}
	}

}
