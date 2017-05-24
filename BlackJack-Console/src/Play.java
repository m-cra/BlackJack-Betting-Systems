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
		Boolean handComplete;
		
		while(!roundComplete){
			//Initialize Hands
			handComplete = false;
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
			System.out.println("\nPlayer total - ");
			playerHand.PrintHand(false);
			System.out.println("\nDealer total - ");
			dealerHand.PrintHand(true);
			
			//System.out.println("\n\n"+dealerHand.aceTotal + " " + playerHand.aceTotal+ "\n\n");
			
		
			//Handle Initial cases, dealer/player blackjack, blackjack draw, dealer ace up card
			if (dealerHand.cardValues[1]== 10 && dealerHand.aceTotal == 21 && playerHand.aceTotal != 21){
				System.out.println("Player loses");
				roundComplete =true;
				handComplete = true;
			}
			else if(dealerHand.aceTotal != 21 && playerHand.aceTotal == 21){
				
				System.out.println("Player wins");
				roundComplete =true;
				handComplete = true;
			}
			else if(dealerHand.cardValues[1]== 10 && dealerHand.aceTotal == 21 && playerHand.aceTotal == 21){
				System.out.println("Push");
				roundComplete =true;
				handComplete = true;
			}

			else { 
				if (dealerHand.cardValues[1]== 1 && playerHand.aceTotal != 21){
				System.out.println("Would you like to purchase insurance");
				//not implementing insurance yet.
					//
					//Handle user input for insurance here
					if (dealerHand.aceTotal == 21){
						System.out.println("Player loses");
						roundComplete =true;
						handComplete = true;
					}
				
				}
				//Begin Player hand decisions
				
				Scanner sc = new Scanner(System.in);
				String choice;
				
				while(!handComplete){	
				System.out.println("Type 'H' to hit, 'S' to stay , 'SP' to split, or 'D' to double");
				choice = sc.nextLine();
				switch (choice){
				case "H":	
						value = deck.DrawCard();
						playerHand.AddCard(value);
						System.out.println("\nplayer "+ deck.PrintCard());
						System.out.println("\nPlayer total - ");
						playerHand.PrintHand(false);
						
						if(playerHand.GetHandValue() > 21){
							System.out.println("Player loses");
							handComplete = true;
						}
						break;
				case "S":	
					
						
						break;
				case "SP":	
					
						
						break;
				case "D":	
					
						break;
				
				default:System.out.println("\nInvalid input - try agian");
				
				
				}
				
				
				
				
				}
				
				
				
			}//else state
				
			
		
		roundComplete = true;
		}//while rount complete
					
		
	
	
	
	
	}//play game func
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
			playGame();
	
	}
}

