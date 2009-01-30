package net.blitzstein.playground.form_wizard.domain;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.FactoryUtils;
import org.apache.commons.collections.list.LazyList;

public class SportsJerseyWizardCommand {

	List<FootballJersey> jerseys = LazyList.decorate(
			new ArrayList<FootballJersey>(), FactoryUtils
					.instantiateFactory(FootballJersey.class));

	public List<FootballJersey> getJerseys() {
		return jerseys;
	}

	public void setJerseys(List<FootballJersey> jerseys) {
		this.jerseys = jerseys;
	}

	public List<FootballJerseyOrderTO> getFootballJerseyOrderTo() {
		return footballJerseyOrderTo;
	}

	public void setFootballJerseyOrderTo(
			List<FootballJerseyOrderTO> footballJerseyOrderTo) {
		this.footballJerseyOrderTo = footballJerseyOrderTo;
	}

	List<FootballJerseyOrderTO> footballJerseyOrderTo = LazyList.decorate(
			new ArrayList<FootballJerseyOrder>(), FactoryUtils
					.instantiateFactory(FootballJerseyOrderTO.class));

}
