package Games_Project;

// Gili Faibish game project - Player class
public abstract class Player {
	
	// Name and Score variables definition
	private String name;
	private int score;
	
	// This function defines the players attributes, players are later created accordingly  
	public Player(String name){
	this.name= name;
	this.score =0;
	}
	
	// Abstract Action definition (later referred to , in order to activate any of the following actions)
	public abstract Action selectAction(Action[]
	actions);
	
	//  This function checks if a player is the winner
	public boolean isWinner(Player p){
		return (this.score > p.getScore());
	}
	
	// This function is called to set the score to any chosen value
	public void updateScore(int score){
		this.score =  score;
	}
	
	// This function returns the score of the chosen player
	public int getScore(){
	return this.score;
	}
	
	// This function returns the name of the player
	public String getName(){
	return this.name;
	}
}
