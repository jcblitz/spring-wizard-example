package net.blitzstein.playground.form_wizard.domain;

public class FootballJersey {
	private Integer id;
	private Integer instanceId;

	public Integer getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(Integer instanceId) {
		this.instanceId = instanceId;
	}

	private String image;

	public FootballJersey() {
		super();
	}

	public FootballJersey(FootballJersey footballJersey) {
		this.id = footballJersey.id;
		this.image = footballJersey.image;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
