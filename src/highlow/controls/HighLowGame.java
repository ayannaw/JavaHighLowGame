package highlow.controls;

public class HighLowGame {
	private Player player;
	private Deck deck;
	private Card currentCard;
	private Card nextCard;
	
	public HighLowGame(String playerName) {
		player = new Player(playerName);
		deck = new Deck();
	}

	public String getPlayerName() {
		// TODO Auto-generated method stub
		return player.getName();
	}

	public int getPlayerCoins() {
		// TODO Auto-generated method stub
		return player.getCoins();
	}
	
	public int getCardCount() {
		return deck.getCardCount();
	}
	
	/*
	 * returns true if the amount of the bet is less than or equal too the player's coins
	 * returns false if the amount of the bet is greater than
	 */
	public boolean checkBetAmount(int bet) {
		return player.makeBet(bet);
	}
	
	public void getCurrentCard() {
		currentCard = deck.dealCard();
		//return currentCard.toString();
	}
	
	public void getNextCard() {
		nextCard = deck.dealCard();
	}
	public String showCurrentCard() {
		return currentCard.toString();
	}
	
	public String showNextCard() {
		return nextCard.toString();
	}

	public String printDeck() {
		return deck.toString();
	}
	
	public boolean takeGuess(String guess) {	
		// TODO Auto-generated method stub
		getNextCard();
		boolean result = false;
		int cardComparison = currentCard.compareCardValue(nextCard);	//1: current is greater than next -1: next is greater than current 0: equal
		if (cardComparison == 1) {
			if(guess.equalsIgnoreCase("h")) {
				return false;
			}
			else if (guess.equalsIgnoreCase("l")) {
				return true;
			}
			else if (guess.equalsIgnoreCase("e")) {
				return false;
			}
		}
		else if (cardComparison == -1) {
			if(guess.equalsIgnoreCase("h")) {
				return true;
			}
			else if (guess.equalsIgnoreCase("l")) {
				return false;
			}
			else if (guess.equalsIgnoreCase("e")) {
				return false;
			}
		}
		else if (cardComparison == 0) {
			if(guess.equalsIgnoreCase("h")) {
				return false;
			}
			else if (guess.equalsIgnoreCase("l")) {
				return false;
			}
			else if (guess.equalsIgnoreCase("e")) {
				return true;
			}
		}
		return result;
	}

	public void makeWinner(int bet) {
		// TODO Auto-generated method stub
		player.addCoins(bet);
		nextCard = currentCard;
		getCurrentCard();
	}
	
	public void makeLoser(int bet) {
		player.subtractCoins(bet);
		nextCard = currentCard;
		getCurrentCard();
	}
	

}
