package highlow.controls;

public class Player {
	private String name;
	private int coins;
	private int bet;
	
	public Player(String name) {
		this.name = name;
		coins = 1000;
		bet = 0;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	
	public int getCoins() {
		return coins;
	}
	
	//returns true if the bet is less than or equal too coins the player has
	public boolean makeBet(int bet) {
		if(bet <= coins) {
			this.bet = bet;
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public void addCoins(int newCoins) {
		coins += newCoins;
	}
	
	public void subtractCoins(int newCoins) {
		coins -= newCoins;
	}

}
