package br.com.unisys.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import br.com.unysis.entity.ClienteEntity;
import br.com.unysis.service.ClienteService;

public class ClientePersistenceTeste {

	private ClienteEntity oClienteEntity = new ClienteEntity();
	private ClienteService oClienteService = new ClienteService();
	
	@Test
	void PersisteCliente() {
		
		oClienteEntity.setIdCliente(1);
		oClienteEntity.setNomeCliente("IPSUM LORUM");
		oClienteEntity.setTipoCliente("PJ");
		
		int numClienteBefore = oClienteService.getAllClientes().size();
		oClienteService.createOrUpdateCliente(oClienteEntity);
		int numClienteAfter = oClienteService.getAllClientes().size();
		
		assertTrue(numClienteAfter > numClienteBefore);
		
	}
}
