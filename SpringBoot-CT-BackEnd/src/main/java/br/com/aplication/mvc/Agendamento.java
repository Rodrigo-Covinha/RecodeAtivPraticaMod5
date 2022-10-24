package br.com.aplication.mvc;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="agendamento")
public class Agendamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="Origem")
	private String origem;
	@Column(name="Destino")
	private String destino;
	@Column(name="dataIda")
	private String dataIda;
	@Column(name="dataVolta")
	private String dataVolta;
	@Column(name="qtdAdulto")
	private String qtdAdulto;
	@Column(name="qtdCrianca")
	private String qtdCrianca;
	@Column(name="classe")
	private String classe;
	
	
	public Agendamento() {
	}
	public Agendamento(String origem, String destino, String dataIda, String dataVolta, String qtdAdulto, String qtdCrianca, String classe ) {
	super();
	
	this.origem = origem;
	this.destino = destino;
	this.dataIda = dataIda;
	this.dataVolta = dataVolta;
	this.qtdAdulto = qtdAdulto;
	this.qtdCrianca = qtdCrianca;
	this.classe = classe;
	}
	public Long getId() {
	return id;
	}
	public void setId(Long id) {
	this.id = id;
	}
	public String getOrigem() {
	return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
	return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getDataIda() {
	return dataIda;
	}
	public void setDataIda(String dataIda) {
		this.dataIda = dataIda;
	}
	public String getDataVolta() {
		return dataVolta;
	}
	public void setDataVolta(String dataVolta) {
		this.dataVolta = dataVolta;
	}
	public String getQtdAdulto() {
		return qtdAdulto;
	}
	public void setQtdAdulto(String qtdAdulto) {
		this.qtdAdulto = qtdAdulto;
	}
	public String getQtdCrianca() {
		return qtdCrianca;
	}
	public void setQtdCrianca(String qtdCrianca) {
		this.qtdCrianca = qtdCrianca;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
}

