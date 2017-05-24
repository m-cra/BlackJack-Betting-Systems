import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {
	
	//Stack holds all cards currently in the deck
	Stack<Card> myDeck;
	Stack<Card> burnDeck;
	//Amount of decks we would like to play with
    int numberOfDecks;
	
    //Constructor to Initialize decks
    public Deck(int numberOfDecks) {
		this.numberOfDecks = numberOfDecks;
    	myDeck = new Stack<Card>();
		burnDeck = new Stack<Card>();
    	InitalizeDeck(myDeck, numberOfDecks);

	}
    //Fill decks with cards
	public void InitalizeDeck(Stack<Card> myDeck, int numberOfDecks) {

		for (int deckLoop = 1; deckLoop <= numberOfDecks; deckLoop++) {
			for (int valueLoop = 1; valueLoop < 14; valueLoop++) {
				for (int suitLoop = 1; suitLoop < 5; suitLoop++) {
					Card newCard = new Card(suitLoop, valueLoop, deckLoop);
					myDeck.push(newCard);
				}
			}
		}
	}
    //Remove one card from deck and place it into burn pile returns its value
	public int DrawCard() {
		int value = myDeck.peek().value;
		burnDeck.push(myDeck.pop());
		return value;
	} 
	//Take one card from deck and move it to burn deck
	public void BurnCard(){
		burnDeck.push(myDeck.pop());
	}
	//Print last card drawn
	public String PrintCard(){
		return burnDeck.peek().toString();
	}
	
	//Print all cards in the deck
	public void PrintDeck() {
		int cardsLeft = myDeck.size();
		for(int i =0; i<cardsLeft; i++)
		System.out.println(i + " "+this.myDeck.get(i).toString());
				
	}
    //Shuffle all cards in the deck
	public void ShuffleDeck() {
		int cardsLeft = this.myDeck.size();
		Card[] s1 = new Card[cardsLeft];
		for(int i=0; i<cardsLeft; i++){
			s1[i] = this.myDeck.pop();
		    
		}
		Random rnd = ThreadLocalRandom.current();
		 for (int i = cardsLeft-1; i >= 0; i--){
		      int index = rnd.nextInt(i + 1);
		      // Simple swap
		      Card a = s1[index];
		      s1[index] = s1[i];
		      this.myDeck.push(a);
		    }
		
	}
    
	//Check if burn card was reached
	public Boolean ShuffleCardReached() {

		return true;
	}

}
