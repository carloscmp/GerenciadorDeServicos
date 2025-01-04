package br.com.markdev.gerenciadorDeServicos.dto;

import org.springframework.beans.BeanUtils;

import br.com.markdev.gerenciadorDeServicos.entity.ServicoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ServicoDTO {

	private Long id;
	private String nome;
	private String descricao;
	
public ServicoDTO(ServicoEntity servico) {
		
		BeanUtils.copyProperties(servico, this);
		
	}
}
