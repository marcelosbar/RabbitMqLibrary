package br.com.marcelosbar.RabbitMqLibrary.controller.dto;

import java.io.Serializable;

import org.opensky.model.StateVector;

import lombok.Getter;

@Getter
public class VeiculoDto implements Serializable {

	private static final long serialVersionUID = -5648004881435415557L;

	private String id;
	private String nome;
	private Double latitude;
	private Double longitude;
	private Double velocidade;
	private Double rumo;

	public VeiculoDto(StateVector state) {
		this.id = state.getIcao24();
		this.nome = state.getCallsign().trim();
		this.latitude = state.getLatitude();
		this.longitude = state.getLongitude();
		this.velocidade = state.getVelocity();
		this.rumo = state.getHeading();
	}

}
