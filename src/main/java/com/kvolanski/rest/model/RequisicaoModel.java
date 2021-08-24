package com.kvolanski.rest.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RequisicaoModel implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "DATA_INICIO")
	private LocalDateTime dataInicio;
	
	@Column(name = "DATA_FINAL")
	private LocalDateTime dataFinal;
	
	@Column(name = "DATA_ATUALIZACAO")
	private LocalDateTime dataAtualizacao;
	
	@Column(name = "TEMPO_ALERTA")
	private String tempoAlerta;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDateTime dataFinal) {
		this.dataFinal = dataFinal;
	}

	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public String getTempoAlerta() {
		return tempoAlerta;
	}

	public void setTempoAlerta(String tempoAlerta) {
		this.tempoAlerta = tempoAlerta;
	}
	
	

	
	

}
