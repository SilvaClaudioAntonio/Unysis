package br.com.unysis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Investimento")
public class InvestimentoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long idinvestimento;
	
	@Column(name = "TpInvestimento", nullable = false, length = 02,	updatable = false)
	public String tipoInvestimento;
	
	@Column(name = "PeriodoInvestimento", nullable = false)
	public int periodoInvestimento;
	
	@Column(name = "ValorInvestimento", nullable = false )
	public double valorInvestimento;
	
	@Column(name = "TaxaInvestimento", nullable = false )
	public double taxaInvestimento;
	
	@Column(name = "IdCliente", nullable = false )
	public long idCliente;
	
	public long getIdinvestimento() {
		return idinvestimento;
	}
	public void setIdinvestimento(long idinvestimento) {
		this.idinvestimento = idinvestimento;
	}
	public String getTipoInvestimento() {
		return tipoInvestimento;
	}
	public void setTipoInvestimento(String tipoInvestimento) {
		this.tipoInvestimento = tipoInvestimento;
	}
	public int getPeriodoInvestimento() {
		return periodoInvestimento;
	}
	public void setPeriodoInvestimento(int periodoInvestimento) {
		this.periodoInvestimento = periodoInvestimento;
	}
	public double getValorInvestimento() {
		return valorInvestimento;
	}
	public void setValorInvestimento(double valorInvestimento) {
		this.valorInvestimento = valorInvestimento;
	}
	public double getTaxaInvestimento() {
		return taxaInvestimento;
	}
	public void setTaxaInvestimento(double taxaInvestimento) {
		this.taxaInvestimento = taxaInvestimento;
	}
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
}
