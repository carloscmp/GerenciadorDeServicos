package br.com.markdev.gerenciadorDeServicos.entity;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;

import br.com.markdev.gerenciadorDeServicos.dto.AgendamentoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "MK_AGENDAMENTO")
public class AgendamentoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENTE")
	private ClienteEntity cliente;
	
	@ManyToOne
	@JoinColumn(name="ID_SERVICO")
	private ServicoEntity servico;
	@Column(nullable = false)
	private LocalDateTime dataHora;
	@Column(nullable = false)
    private Boolean confirmado = false;
	
	public AgendamentoEntity(AgendamentoDTO agendamento) {
		
		BeanUtils.copyProperties( agendamento, this);
		if(agendamento != null && agendamento.getCliente() != null) {
			this.cliente = new ClienteEntity(agendamento.getCliente());
		}
		if(agendamento != null && agendamento.getServico() != null) {
			this.servico = new ServicoEntity(agendamento.getServico());
		}
	}
	
}
