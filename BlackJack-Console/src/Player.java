
public class Player {
	String name;
	int bankRoll;

	public Player(String name, int bankRoll) {
		this.name = name;
		this.bankRoll = bankRoll;

	}

	public void placeBet(int betSize) {
		bankRoll -= betSize;
		if (bankRoll < 1) {
			System.out.println("\n You broke get out of here");
		}
	}

}