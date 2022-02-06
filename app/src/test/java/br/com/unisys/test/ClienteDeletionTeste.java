package br.com.unisys.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import br.com.unysis.service.ClienteService;

public class ClienteDeletionTeste {

	private ClienteService oClienteService = new ClienteService();
	
	@Test
	void DeleteionCliente() throws Exception {
		
		int numClienteBefore = oClienteService.getAllClientes().size();
		oClienteService.deleteClienteByID(1);
		int numClienteAfter = oClienteService.getAllClientes().size();
		
		assertTrue(numClienteAfter < numClienteBefore);
		
	}
}

