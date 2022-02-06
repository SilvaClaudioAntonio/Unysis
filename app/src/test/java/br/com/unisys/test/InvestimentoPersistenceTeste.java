package br.com.unisys.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import br.com.unysis.entity.InvestimentoEntity;
import br.com.unysis.service.InvestimentoService;

public class InvestimentoPersistenceTeste {

	private InvestimentoEntity oInvestimentoEntity = new InvestimentoEntity();
	private InvestimentoService oInvestimentoService = new InvestimentoService();

	@Test
	void PersistenceInvestimento() {
		
	oInvestimentoEntity.setIdCliente(1);
	oInvestimentoEntity.setIdinvestimento(1);
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