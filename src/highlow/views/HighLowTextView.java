package highlow.views;

import java.util.Scanner;

import highlow.controls.HighLowGame;

public class HighLowTextView {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Player, Enter your name: ");
		String playerName = input.next();

		HighLowGame game = new HighLowGame(playerName);

		while (game.getPlayerCoins() > 0 && game.getCardCount() > 0) {
			playGame(game);
		}
	}

	public static void playGame(HighLowGame game) {
		String guess;
		System.out.println(
				game.getPlayerName() + "\t Coins: " + game.getPlayerCoins() + "\t Card Count: " + game.getCardCount());

		System.out.println("Enter your bet amount: ");
		int bet = input.nextInt();

		if (game.checkBetAmount(bet) == false) {
			System.out.println("Enter your a different bet amount: ");
			bet = input.nextInt();
		} else {
			game.getCurrentCard();
			System.out.println("Current Card: " + game.showCurrentCard());
			System.out.println("Will the next card be (H)Higher or (L)Lower or (E)Equal to the current card.");
			guess = input.next();
			while (!(guess.equalsIgnoreCase("H") || guess.equalsIgnoreCase("L") || guess.equalsIgnoreCase("E"))) {
				System.out.println("Will the next card be (H)Higher or (L)Lower or (E)Equal to the current card.");
				guess = input.next();
			}

			if (game.takeGuess(guess)) {
				System.out.println("Next Card: " + game.showNextCard());
				System.out.println("Your guess is correct. You win " + bet + " coins");
				game.makeWinner(bet);
			} else {
				System.out.println("Next Card: " + game.showNextCard());
				System.out.println("Your guess is incorrect. You lose " + bet + "coins");
				game.makeLoser(bet);
			}
		}
	}
}
