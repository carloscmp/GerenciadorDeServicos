package br.com.markdev.gerenciadorDeServicos.entity;

import org.springframework.beans.BeanUtils;

import br.com.markdev.gerenciadorDeServicos.dto.ClienteDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "MK_CLIENTE")
@EqualsAndHashCode(of = "id")
public class ClienteEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String telefone;
	@Column(nullable = false)
	private String endereco;
	
public ClienteEntity(ClienteDTO perfil) {
		
		BeanUtils.copyProperties(perfil, this);
		
	}
	
}
