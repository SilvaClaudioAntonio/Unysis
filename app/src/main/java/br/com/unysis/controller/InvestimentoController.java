package br.com.unysis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.unysis.entity.InvestimentoEntity;
import br.com.unysis.service.InvestimentoService;

@Controller
@RequestMapping("/investimentos")
public class InvestimentoController {
	
	@Autowired
	InvestimentoService oInvestimentoServico;
	
	@GetMapping
	public ResponseEntity<List<InvestimentoEntity>> getAllInvestimentos(){
		List<InvestimentoEntity> objService = oInvestimentoServico.getAllInvestimentos();
		return new ResponseEntity<List<InvestimentoEntity>>(objService, new HttpHeaders(), HttpStatus.OK);
	}
	@GetMapping("{/id}")
	public ResponseEntity<InvestimentoEntity> getInvestimento(long id) throws Exception{
		InvestimentoEntity objService = oInvestimentoServico.getInvestimento(id);
		return new ResponseEntity<InvestimentoEntity>(objService, new HttpHeaders(), HttpStatus.OK);		
	}
	@PostMapping
	public ResponseEntity<InvestimentoEntity> createOrUpdateInvestimento(@RequestBody InvestimentoEntity entity){
		InvestimentoEntity objService = oInvestimentoServico.createOrUpdateInvestimento(entity);
		return new ResponseEntity<InvestimentoEntity>(objService, new HttpHeaders(), HttpStatus.OK);
	}
	@DeleteMapping("{/id}")
	public HttpStatus deleteClienteById(@PathVariable Long id) throws Exception{
		oInvestimentoServico.deleteInvestimentById(id);
		return HttpStatus.OK;		 		
	}
}
