
public class Hand {

	int[] cardValues;
	int cardNumber;
	int total;
	int aceTotal;
	int aceCount;
	boolean splitTracker;

	// Initialize hand
	public Hand() {
		cardNumber = 0;
		total = 0;
		aceCount = 0;
		splitTracker = false;
		cardValues = new int[20];
	}

	// Add card value to hand value
	public void AddCard(int value) {
		if (value == 1) {
			aceCount++;
			this.aceTotal = (this.total + 11);
			cardValues[cardNumber] = value;
			this.total += value;
			this.cardNumber++;
		}
		else{
			cardValues[cardNumber] = value;
			this.cardNumber++;
			this.total += value;
		}	
	}

	// Print out hand total score
	public void PrintHand(boolean hidden) {
		if (!hidden) {
			if (aceCount == 0) {
				System.out.println("Score = " + total);
			} else if (aceCount >= 1) {
				if ((total + 10) > 21)
					System.out.println("Score = " + total);
				else
					System.out.println("Score = " + total + " or " + (total + 10));
			} else {
				System.out.println("\nAce Overflow");
			}
		} else {
			if (cardValues[1]==1){
			System.out.println("Score = " + (cardValues[1]+10));
			}
			else
				System.out.println("Score = " + cardValues[1]);
		}
	}
}
