package net.blitzstein.playground.form_wizard.domain;

public class FootballJerseyOrder {
	private FootballJersey footballJersey;
	private String name;
	private String message;
	private Integer id;

	public FootballJerseyOrder(FootballJersey footballJersey) {
		this.footballJersey = footballJersey;
	}

	public FootballJerseyOrder() {
		// 
	}

	public FootballJersey getFootballJersey() {
		return footballJersey;
	}

	public void setFootballJersey(FootballJersey footballJersey) {
		this.footballJersey = footballJersey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
