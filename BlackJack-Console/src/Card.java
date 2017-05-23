
public class Card {
    
	int suit, value, deck;
	String name;
	//Card Constructor
	public Card(int suit, int value, int deck){
		this.suit = suit;
		this.value = setValue(value);
		this.deck = deck;	
	}
	//Value + name assignment.  Ace is 1, hand class decides if its 1 or 11
	public int setValue(int value){
		switch (value){
			case 1:	value = 1;
					this.name = "Ace";
					break;
			case 2: value = 2;
					this.name = "Two";
					break;
			case 3: value = 3;
					this.name = "Three";
					break;
			case 4: value = 4;
					this.name = "Four";
					break;
			case 5: value = 5;
					this.name = "Five";
					break;
			case 6: value = 6;
					this.name = "Six";
					break;
			case 7: value = 7;
					this.name = "Seven";
					break;
			case 8: value = 8;
					this.name = "Eight";
					break;
			case 9: value = 9;
					this.name = "Nine";
					break;
			case 10:value = 10;
					this.name = "Ten";
					break;
			case 11:value = 10;
					this.name = "Jack";
					break;
			case 12:value = 10;
					this.name = "Queen";
					break;
			case 13:value = 10;
					this.name = "King";
					break;
			default:value = 0;
		}
		return value;
	}
	
	public String toString(){
		return "card =" + this.name + " suit = " + this.suit+ " deck num = " + this.deck;
	}
}
