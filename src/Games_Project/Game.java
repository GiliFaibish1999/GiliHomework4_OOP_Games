package Games_Project;

// Gili Faibish game project - Game class
public abstract class Game {
	
	// Variables definitions: players, game name and actions set for the game
	private Player p1, p2;
	private String name; 
	protected Action[] actions; 
	
	// This function is used to define a game type object with the suited attributes
	public Game(Player p1, Player p2, String name){
		this.p1 = p1;
		this.p2 = p2;
		this.name = name;
		this.initActions();
	}
	
	// Abstract initial actions definition
	protected abstract void initActions();
	
	// This function is used to define a game play 
	public void play(int turnCount) {
		for (int i=0; i<turnCount; i=i+1) 
			this.playSingleTurn();
	}
	
	// This function is used to play a single turn
	private void playSingleTurn() {
		Action a1 = this.p1.selectAction(actions);
		Action a2 = this.p2.selectAction(actions);
		this.rewardPlayers(a1, a2);
	}
	
	// Abstract reward definition
	protected abstract void rewardPlayers(Action a1, Action a2);
	
	// This function returns the winner
	public Player getWinner () {
		if (this.p1.isWinner(this.p2))
			return this.p1;
		else
			return this.p2;
	}
	
	// This function returns the first player
	protected Player getFirstPlayer() {
		return this.p1;
	}
	
	// This function returns the second player
	protected Player getSecondPlayer() {
		return this.p2;
	}
}
