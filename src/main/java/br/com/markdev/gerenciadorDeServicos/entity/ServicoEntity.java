package br.com.markdev.gerenciadorDeServicos.entity;

import org.springframework.beans.BeanUtils;

import br.com.markdev.gerenciadorDeServicos.dto.ServicoDTO;
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
@Table(name = "MK_SERVICO")
@EqualsAndHashCode(of = "id")
public class ServicoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String descricao;
	
public ServicoEntity(ServicoDTO servico) {
		
		BeanUtils.copyProperties(servico, this);
		
	}
	
}
