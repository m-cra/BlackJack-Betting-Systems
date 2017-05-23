import java.util.*;

public class Play {


	
	public static void playGame(){
		Dealer dealer = new Dealer("andy", 10000);
		Player player1 = new Player("mike", 250);
		Deck deck = new Deck(1);
		deck.ShuffleDeck();
		Boolean roundComplete = false;
		deck.BurnCard();
		String hiddenCard ="";
		int hiddenValue;
		
		while(!roundComplete){
			//Initialize Hands
			
			//Draw 1 player
			player1.placeBet(50);
			int value = deck.DrawCard();
			Hand playerHand = new Hand();
			playerHand.AddCard(value);
			System.out.println("player "+ deck.PrintCard());
			
			
			//Draw 1 dealer face down
			value = deck.DrawCard();
			hiddenValue = value;
			Hand dealerHand = new Hand();
			dealerHand.AddCard(value);
			hiddenCard = deck.PrintCard();
			System.out.println("dealer card =Hidden card " + hiddenCard);
			
			
			//Draw 2 player
			value = deck.DrawCard();
			playerHand.AddCard(value);
			System.out.println("player "+ deck.PrintCard());
			
			
			
			//Draw 2 dealer Face up
			value = deck.DrawCard();
			dealerHand.AddCard(value);
			System.out.println("dealer "+ deck.PrintCard());
			
			
			//Print Scores
			System.out.println("\nPlayer total = ");
			playerHand.PrintHand(false);
			System.out.println("\nDealer total = ");
			dealerHand.PrintHand(true);
			
			System.out.println(hiddenCard);
			
			roundComplete =true;
				
		
			//Handle Initial cases, dealer/player blackjack, blackjack draw, dealer ace up card
			if (dealerHand.cardValues[1]== 10 && dealerHand.aceTotal == 21 && playerHand.aceTotal != 21){
				System.out.println("Player loses");
			}
			else if(dealerHand.aceTotal != 21 && playerHand.aceTotal == 21){
				System.out.println("Player wins");
			}
			else if(dealerHand.cardValues[1]== 10 && dealerHand.aceTotal == 21 && playerHand.aceTotal == 21){
				System.out.println("Push");
			}
			else {
				
				if(dealerHand.cardValues[1]== 11 && playerHand.aceTotal != 21){
					System.out.println("Would you like to purchase insurance");
				}
				else{
					System.out.println("hit, stay, split, or double");
				}
				
			
			
			}
				
				
				
				
				
				
				
				
				
				
				
			
		
		
		
		
		
		
		}
			
	
	
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			playGame();
	
	}
}

