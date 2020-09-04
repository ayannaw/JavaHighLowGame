package highlow.controls;

public class Card {
	
	private String rank;
	private String suit;
	private int value;
	
	public Card(String rank, String suit) {
		this.rank = rank;
		this.suit = suit;
		if (rank.equalsIgnoreCase("ace")) {
			value = 1;
		}
		else if (rank.equalsIgnoreCase("two")) {
			value = 2;
		}
		else if (rank.equalsIgnoreCase("three")) {
			value = 3;
		}
		else if (rank.equalsIgnoreCase("four")) {
			value = 4;
		}
		else if (rank.equalsIgnoreCase("five")) {
			value = 5;
		}
		else if (rank.equalsIgnoreCase("six")) {
			value = 6;
		}
		else if (rank.equalsIgnoreCase("seven")) {
			value = 7;
		}
		else if (rank.equalsIgnoreCase("eight")) {
			value = 8;
		}
		else if (rank.equalsIgnoreCase("nine")) {
			value = 9;
		}
		else if (rank.equalsIgnoreCase("ten")) {
			value = 10;
		}
		else if (rank.equalsIgnoreCase("jack")) {
			value = 11;
		}
		else if (rank.equalsIgnoreCase("queen")) {
			value = 12;
		}
		else if (rank.equalsIgnoreCase("king")) {
			value = 13;
		}

	}
	
	public String getRank() {
		return rank;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public int getCardValue() {
				
		return value;
	}
	
	/**
	 * Returns 1 if this card value is greater than other card value
	 * Returns 0 if this card value is equal too other card value
	 * Returns -1 if this card value is less than other card value
	 * @param other
	 * @return
	 */
	public int compareCardValue(Card other) {
		if(this.getCardValue() > other.getCardValue()) {
			return 1;
		}
		else if (this.getCardValue() < other.getCardValue()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public String toString() {
		return rank + " of " + suit;
	}

}
