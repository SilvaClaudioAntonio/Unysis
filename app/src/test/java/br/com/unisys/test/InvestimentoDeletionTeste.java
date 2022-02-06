package br.com.unisys.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import br.com.unysis.service.InvestimentoService;;

public class InvestimentoDeletionTeste {

	private InvestimentoService oInvestimentoService = new InvestimentoService();
	
	@Test
	void DeleteionInvestimento() throws Exception {
		
		int numInvestimentoBefore = oInvestimentoService.getAllInvestimentos().size();
		oInvestimentoService.deleteInvestimentById(1);
		int numInvestimentoAfter = oInvestimentoService.getAllInvestimentos().size();
		assertTrue(numInvestimentoAfter < numInvestimentoBefore);
		
	}
}
