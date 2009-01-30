package net.blitzstein.playground.form_wizard.domain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import net.blitzstein.playground.domain.GiftCardImpl;

import org.apache.commons.collections.FactoryUtils;
import org.apache.commons.collections.list.LazyList;

public class DigitalGiftCardQuantityCommand {

	private List cards = LazyList.decorate(new ArrayList(), FactoryUtils
			.instantiateFactory(DigitalGiftCardQuantityTO.class));
	
	private List cardInstances = LazyList.decorate(new LinkedList(), FactoryUtils
			.instantiateFactory(GiftCardImpl.class));

	public List getCardInstances() {
		return cardInstances;
	}

	public void setCardInstances(List cardInstances) {
		this.cardInstances = cardInstances;
	}

	public List<DigitalGiftCardQuantityTO> getCards() {
		return cards;
	}

	public void setCards(List<DigitalGiftCardQuantityTO> cards) {
		this.cards = cards;
	}


}
