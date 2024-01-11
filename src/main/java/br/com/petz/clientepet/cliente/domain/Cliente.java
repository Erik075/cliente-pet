package br.com.petz.clientepet.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Cliente {
    @NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String celular;
	private String telefone;
	private Sexo sexo;
	@NotNull
	private LocalDate dataNascimento;
	@CPF
	private String cpf;
	@NotNull
	private Boolean aceitaTermos;
	
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	private Cliente(@NotBlank String nomeCompleto, @NotBlank @Email String email, @NotBlank String celular,
			String telefone, Sexo sexo, @NotNull LocalDate dataNascimento, @CPF String cpf,
			@NotNull Boolean aceitaTermos) {
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.celular = celular;
		this.telefone = telefone;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.aceitaTermos = aceitaTermos;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
	
	
	
	
	
	
	
}
