package com.kvolanski.mr.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

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
	
	@Column(name = "DATA_HORA_ABERTURA_ALERTA")
	private LocalDateTime dataHoraAberturaAlerta;

	
	
	public RequisicaoModel() {
		super();
	}

	public RequisicaoModel(long id, String nome, LocalDateTime horaInicio, LocalDateTime horaFim,
			LocalDateTime dataAtualizacao, String tempoAlerta, LocalDateTime dataHoraAberturaAlerta) {
		super();
		this.id = id;
		this.nome = nome;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.dataAtualizacao = dataAtualizacao;
		this.tempoAlerta = tempoAlerta;
		this.dataHoraAberturaAlerta = dataHoraAberturaAlerta;
	}

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

	public LocalDateTime getDataHoraAberturaAlerta() {
		return dataHoraAberturaAlerta;
	}

	public void setDataHoraAberturaAlerta(LocalDateTime dataHoraAberturaAlerta) {
		this.dataHoraAberturaAlerta = dataHoraAberturaAlerta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataAtualizacao, dataHoraAberturaAlerta, horaFim, horaInicio, id, nome, tempoAlerta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequisicaoModel other = (RequisicaoModel) obj;
		return Objects.equals(dataAtualizacao, other.dataAtualizacao)
				&& Objects.equals(dataHoraAberturaAlerta, other.dataHoraAberturaAlerta)
				&& Objects.equals(horaFim, other.horaFim) && Objects.equals(horaInicio, other.horaInicio)
				&& id == other.id && Objects.equals(nome, other.nome) && Objects.equals(tempoAlerta, other.tempoAlerta);
	}

	@Override
	public String toString() {
		return "RequisicaoModel [id=" + id + ", nome=" + nome + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim
				+ ", dataAtualizacao=" + dataAtualizacao + ", tempoAlerta=" + tempoAlerta + ", dataHoraAberturaAlerta="
				+ dataHoraAberturaAlerta + "]";
	}
	

	
	
	
	

}
