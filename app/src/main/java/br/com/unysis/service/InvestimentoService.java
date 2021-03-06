package br.com.unysis.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.unysis.entity.InvestimentoEntity;
import br.com.unysis.repository.InvestimentoRepository;

public class InvestimentoService {

	@Autowired
	InvestimentoRepository oInvestimentoRepository;
	
	public List<InvestimentoEntity> getAllInvestimentos(){
		
		List<InvestimentoEntity> oInvestimentoList = oInvestimentoRepository.findAll();
		
		if (oInvestimentoList.size() > 0) {
			return oInvestimentoList;
		}else {
			return new ArrayList<InvestimentoEntity>();
		}
	}
	public InvestimentoEntity getInvestimento(long id) throws Exception {
		
		Optional<InvestimentoEntity> oInvestimento = oInvestimentoRepository.findById(id);
		
		if (oInvestimento.isPresent()) {
			return oInvestimento.get();
		}else {
			throw new Exception("Investimento não localizado");
		}
	}
	public InvestimentoEntity createOrUpdateInvestimento(InvestimentoEntity entity) {
		
		Optional<InvestimentoEntity> oInvestimento = oInvestimentoRepository.findById(entity.idinvestimento);
		
		if (oInvestimento.isPresent()){
			InvestimentoEntity oInvestimentoEntity = oInvestimento.get();
			oInvestimentoEntity.setIdCliente(entity.idCliente);
			oInvestimentoEntity.setPeriodoInvestimento(entity.periodoInvestimento);
			oInvestimentoEntity.setTaxaInvestimento(entity.taxaInvestimento);
			oInvestimentoEntity.setTipoInvestimento(entity.tipoInvestimento);
			oInvestimentoEntity.setValorInvestimento(entity.valorInvestimento);
			return oInvestimentoEntity;
		}else {
			entity =  oInvestimentoRepository.save(entity);
			return entity;
		}
	}
	public void deleteInvestimentById(long id) throws Exception {
		
		Optional<InvestimentoEntity> oInvestimento = oInvestimentoRepository.findById(id);
		
		if (oInvestimento.isPresent()) {
			oInvestimentoRepository.deleteById(id);
		}else {
			throw new Exception("ID informado não localizado!");
		}
	}
}
