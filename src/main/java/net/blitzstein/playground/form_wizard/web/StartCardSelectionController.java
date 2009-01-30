package net.blitzstein.playground.form_wizard.web;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.blitzstein.playground.domain.GiftCardImpl;
import net.blitzstein.playground.form_wizard.domain.DigitalGiftCardQuantityCommand;
import net.blitzstein.playground.form_wizard.domain.DigitalGiftCardQuantityTO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;
import org.springframework.web.servlet.view.RedirectView;

public class StartCardSelectionController extends AbstractWizardFormController {
	private final Log logger = LogFactory.getLog(getClass());
	private List availableCards;

	public void setAvailableCards(List<GiftCardImpl> availableCards) {
		this.availableCards = availableCards;
	}

	public static final int CARD_FACE_STEP = 0;
	public static final int CARD_RECIPIENT_STEP = 1;

	@Override
	protected ModelAndView processFinish(HttpServletRequest arg0,
			HttpServletResponse arg1, Object command, BindException arg3)
			throws Exception {

		// Do your final processing of the collected information
		return new ModelAndView(new RedirectView("start.htm"));
	}

	protected ModelAndView processCancel(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors) {

		try {
			super.processCancel(request, response, command, errors);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
		return new ModelAndView(new RedirectView("start.htm"));
	}

	@Override
	/**
	 * Create an instance for each of the gift cards to display
	 */
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		DigitalGiftCardQuantityCommand cards = new DigitalGiftCardQuantityCommand();

		// Add all available cards
		for (GiftCardImpl card : getAvailableCards()) {
			cards.getCards().add(setupCardToDisplay(card));
		}

		return cards;
	}

	public List<GiftCardImpl> getAvailableCards() {
		return availableCards;
	}

	/**
	 * Adds a gift card instance to a TO to contain the quantity of how many they selected
	 * @param card
	 * @return
	 */
	private DigitalGiftCardQuantityTO setupCardToDisplay(GiftCardImpl card) {
		DigitalGiftCardQuantityTO dgcTO = new DigitalGiftCardQuantityTO();
		dgcTO.setCard(card);

		return dgcTO;

	}

	@Override
	/**
	 * Processes the various steps
	 * Step CARD_FACE_STEP requires a new instance of each of the requested gift cards to be created
	 */
	protected void postProcessPage(HttpServletRequest request, Object command,
			Errors errors, int page) throws Exception {

		DigitalGiftCardQuantityCommand dgcQuantityCommand = (DigitalGiftCardQuantityCommand) command;

		// Based upon how many cards are requested, add an entry for each of
		// them
		if (page == CARD_FACE_STEP) {
			dgcQuantityCommand
					.setCardInstances(iterateQuantity((dgcQuantityCommand
							.getCards())));
		}
		super.postProcessPage(request, command, errors, page);
	}

	/**
	 * For every requested card, create an instance of that card and add it to a list
	 * @param cards
	 * @return
	 */
	private List<GiftCardImpl> iterateQuantity(
			List<DigitalGiftCardQuantityTO> cards) {
		int count = 0;
		List<GiftCardImpl> recipientInfo = new LinkedList<GiftCardImpl>();
		for (DigitalGiftCardQuantityTO card : cards) {
			if (card.getQuantity() > 0) {
				logger.info("Creating " + card.getQuantity() + " of "
						+ card.getCard().getCardFace());

				for (int i = 0; i < card.getQuantity(); i++) {

					// Calls a copy constructor to create a unique instance of
					// the card
					GiftCardImpl cardInstance = new GiftCardImpl(
							getAvailableCards().get(card.getCard().getId() - 1));
					cardInstance.setInstanceId(new Integer(++count));

					recipientInfo.add(setupCardToDisplay(cardInstance)
							.getCard());
				}
			}

		}

		logger.info("Added " + recipientInfo.size() + " gift cards");
		return recipientInfo;

	}

	protected void validatePage(Object command, Errors errors, int page) {
		DigitalGiftCardQuantityCommand card = (DigitalGiftCardQuantityCommand) command;
	
		//TODO Add some validation

	}

}
