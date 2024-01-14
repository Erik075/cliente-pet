package br.com.petz.clientepet.cliente.application.service;

import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteResquest;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteResquest clienteResquest);
}
