package net.blitzstein.playground.form_wizard.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.blitzstein.playground.form_wizard.domain.DigitalGiftCardQuantityCommand;
import net.blitzstein.playground.form_wizard.domain.FootballJersey;
import net.blitzstein.playground.form_wizard.domain.FootballJerseyOrderTO;
import net.blitzstein.playground.form_wizard.domain.SportsJerseyWizardCommand;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

public class JerseySelectionWizardController extends
		AbstractWizardFormController {
	private final Log logger = LogFactory.getLog(getClass());
	private List<FootballJersey> jerseys;

	public List<FootballJersey> getJerseys() {
		return jerseys;
	}

	public void setJerseys(List<FootballJersey> jerseys) {
		this.jerseys = jerseys;
	}

	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {

		SportsJerseyWizardCommand command = new SportsJerseyWizardCommand();

		command.setFootballJerseyOrderTo(setupFormBackingObject(jerseys));

		return command;
	}

	private List<FootballJerseyOrderTO> setupFormBackingObject(
			List<FootballJersey> jerseys) {

		List tos = new ArrayList();
		for (FootballJersey jersey : jerseys) {
			FootballJerseyOrderTO to = new FootballJerseyOrderTO(jersey);
			tos.add(to);
		}

		return tos;

	}

	protected void postProcessPage(HttpServletRequest request, Object command,
			Errors errors, int page) throws Exception {

		SportsJerseyWizardCommand jerseyCommand = (SportsJerseyWizardCommand) command;

		// Based upon how many cards are requested, add an entry for each of
		// them
		if (page == 2) {
			
		}
		super.postProcessPage(request, command, errors, page);
	}

	/*
	 * 
	 * protected void postProcessPage(HttpServletRequest request, Object
	 * command, Errors errors, int page) throws Exception {
	 * 
	 * SportsJerseyWizardCommand jerseyCommand = (SportsJerseyWizardCommand)
	 * command;
	 * 
	 * // Based upon how many cards are requested, add an entry for each of //
	 * them if (page == 1) {
	 * jerseyCommand.setFootballJerseyOrder(footballJerseyOrder);
	 * 
	 * } super.postProcessPage(request, command, errors, page); }
	 */

	/*
	 * 
	 * private List<FootballJersey> iterateQuantity( List<FootballJerseyOrderTO>
	 * jerseys) {
	 * 
	 * int count = 0;
	 * 
	 * List<FootballJersey> recipientInfo = new LinkedList<FootballJersey>();
	 * 
	 * for (FootballJerseyOrderTO jersey : jerseys) { if (jersey.getQuantity() >
	 * 0) { logger.info("Creating " + jersey.getQuantity() + " of " +
	 * jersey.getFootballJersey().getImage());
	 * 
	 * for (int i = 0; i < jersey.getQuantity(); i++) {
	 * 
	 * // Calls a copy constructor to create a unique instance of // the card
	 * FootballJersey cardInstance = new FootballJersey( this.jerseys
	 * .get(jersey.getFootballJersey().getId() - 1));
	 * cardInstance.setInstanceId(new Integer(++count));
	 * 
	 * FootballJerseyOrderTO to = new FootballJerseyOrderTO();
	 * 
	 * recipientInfo.add(cardInstance); } }
	 * 
	 * }
	 * 
	 * logger.info("Added " + recipientInfo.size() + " gift cards"); return
	 * recipientInfo;
	 * 
	 * }
	 */
	@Override
	protected ModelAndView processFinish(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, BindException arg3)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
