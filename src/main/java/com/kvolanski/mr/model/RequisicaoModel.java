package com.kvolanski.mr.model;

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
	
	@Column(name = "HORA_INICIO")
	private LocalDateTime horaInicio;
	
	@Column(name = "HORA_FIM")
	private LocalDateTime horaFim;
	
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

	public LocalDateTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalDateTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalDateTime getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(LocalDateTime horaFim) {
		this.horaFim = horaFim;
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
