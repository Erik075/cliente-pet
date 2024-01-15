package br.com.petz.clientepet.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteResquest;
import lombok.extern.log4j.Log4j2;

@Service 
@Log4j2
public class ClienteAplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(ClienteResquest clienteResquest) {
		log.info("[inicia] ClienteApplicantionService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteResquest)) ;
		log.info("[finaliza] ClienteApplicantionService - criaCliente");

        return null;
	}

}
