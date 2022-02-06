package br.com.unisys.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import br.com.unysis.entity.ClienteEntity;
import br.com.unysis.service.ClienteService;

public class ClienteGetAllTeste {

	private ClienteEntity oClienteEntity = new ClienteEntity();
	private ClienteService oClienteService = new ClienteService();
	
	@Test
	void GetAllCliente() {
		
		oClienteEntity.setIdCliente(1);
		oClienteEntity.setNomeCliente("IPSUM LORUM");
		oClienteEntity.setTipoCliente("PJ");
		oClienteService.createOrUpdateCliente(oClienteEntity);
		
		assertTrue(oClienteService.getAllClientes().size() > 0);
	}
}
