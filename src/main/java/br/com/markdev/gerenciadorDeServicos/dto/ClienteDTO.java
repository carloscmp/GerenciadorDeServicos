package br.com.markdev.gerenciadorDeServicos.dto;

import org.springframework.beans.BeanUtils;

import br.com.markdev.gerenciadorDeServicos.entity.ClienteEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClienteDTO {

	private Long id;
	private String nome;
	private String telefone;
	private String endereco;
	
public ClienteDTO(ClienteEntity perfil) {
		
		BeanUtils.copyProperties(perfil, this);
		
	}
	
}
