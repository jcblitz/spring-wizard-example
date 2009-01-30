package net.blitzstein.playground.form_wizard.domain;

import net.blitzstein.playground.domain.GiftCardImpl;

public class DigitalGiftCardQuantityTO {
	private GiftCardImpl card;
	private int quantity;

	public GiftCardImpl getCard() {
		return card;
	}

	public void setCard(GiftCardImpl card) {
		this.card = card;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
