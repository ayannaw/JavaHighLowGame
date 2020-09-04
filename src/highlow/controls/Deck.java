package highlow.controls;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private ArrayList<Card> deck;
	private int cardCount;
	private String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
			"Jack", "Queen", "King"};
	private String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
	Random randomCard;
	public Deck() {
		deck = new ArrayList<Card>(52);
		for(int r = 0; r < ranks.length; r++) {
			for(int s = 0; s < suits.length; s++) {
				deck.add(new Card(ranks[r],suits[s]));
				cardCount++;
			}
		}
	}
	

	public int getCardCount() {
		return cardCount;
	}
	
	public Card dealCard() {
		cardCount--;
		return deck.remove(getRandomCard());
	}
	

	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(Card c: deck) {
			sb.append(c + "\n");
		}
		
		return sb.toString();
	}

	private int getRandomCard() {
		randomCard = new Random();
		int upperBound = deck.size();
		return randomCard.nextInt(upperBound);
	}
}
