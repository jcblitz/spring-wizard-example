package net.blitzstein.playground.form_wizard.domain;

public class FootballJerseyOrderTO {
	private FootballJerseyOrder footballJerseyOrder;
	private Integer quantity;
	private FootballJersey footballJersey;

	public FootballJerseyOrderTO(FootballJersey jersey) {
		this.footballJersey = jersey;
	}

	public FootballJerseyOrderTO() {
	}

	public FootballJerseyOrder getFootballJerseyOrder() {
		return footballJerseyOrder;
	}

	public void setFootballJerseyOrder(FootballJerseyOrder footballJerseyOrder) {
		this.footballJerseyOrder = footballJerseyOrder;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public FootballJersey getFootballJersey() {
		return footballJersey;
	}

	public void setFootballJersey(FootballJersey footballJersey) {
		this.footballJersey = footballJersey;
	}

}
