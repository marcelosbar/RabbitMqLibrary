package br.com.marcelosbar.RabbitMqLibrary.model;

public enum RabbitMqQueues {
	AIRPLANES(1),
	SHIPS(2);

	private int typeNumber;
	
	RabbitMqQueues(int itypeNumber) {
		this.typeNumber = itypeNumber;
	}

	public int getType() {
		return typeNumber;
	}
	
}
