package br.com.unisys.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import br.com.unysis.entity.InvestimentoEntity;
import br.com.unysis.entity.ClienteEntity;
import br.com.unysis.service.ClienteService;
import br.com.unysis.service.InvestimentoService;

public class InvestimentoGetAllTeste {

	private InvestimentoEntity oInvestimentoEntity = new InvestimentoEntity();
	private ClienteEntity oClienteEntity = new ClienteEntity();
	private InvestimentoService oInvestimentoService = new InvestimentoService();
	private ClienteService oClienteService = new ClienteService();
	
	@Test
	void GetAllCliente() {

		oClienteEntity.setIdCliente(2);
		oClienteEntity.setNomeCliente("IPSUM LORUM");
		oClienteEntity.setTipoCliente("PJ");
		
		oClienteService.createOrUpdateCliente(oClienteEntity);
		
		oInvestimentoEntity.setIdCliente(2);
		oInvestimentoEntity.setIdinvestimento(2);
		oInvestimentoEntity.setPeriodoInvestimento(12);
		oInvestimentoEntity.setTaxaInvestimento(9.50);
		oInvestimentoEntity.setTipoInvestimento("FF");
		oInvestimentoEntity.setValorInvestimento(1500650.00);
		
		int numInvestimentoBefore = oInvestimentoService.getAllInvestimentos().size();
		oInvestimentoService.createOrUpdateInvestimento(oInvestimentoEntity);
		int numInvestimentoAfter = oInvestimentoService.getAllInvestimentos().size();
		
		assertTrue(numInvestimentoAfter > numInvestimentoBefore);
	}
}
