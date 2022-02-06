package br.com.unysis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.unysis.entity.InvestimentoEntity;
	
@Repository
public interface InvestimentoRepository extends JpaRepository<InvestimentoEntity, Long>{}

