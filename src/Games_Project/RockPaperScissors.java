package Games_Project;

// Gili Faibish game project - RockPaperScissors class
public class RockPaperScissors extends Game{
	
	// Definition of a game object from the type of 'Rock Paper Scissors' with the suitable name and players attributes definition
	public RockPaperScissors(Player p1, Player p2) {
		super(p1, p2, "Rock Paper Scissors");
	}
	
	// Definition of the initial action options in a 'Rock Paper Scissors' game
	protected void initActions(){
		this.actions = new Action[3];
		this.actions[0] = new Action ("Rock");
		this.actions[1] = new Action ("Paper");
		this.actions[2] = new Action ("Scissors");
	}
	
	// Runs the 'Rock Paper Scissors' game, and updates the scores of the players according to the result of the game
	protected void rewardPlayers(Action a1, Action a2){
		int p1Score = 0;
		if (!(a1.getName().equals(a2.getName()))) {
			if ((a1.getName().equals("Rock") && 
					a2.getName().equals("Scissors")) 
			|| (a1.getName().equals("Scissors") &&
					a2.getName().equals("Paper"))
			||	(a1.getName().equals("Paper") &&
					a2.getName().equals("Rock"))) {
				p1Score = 1;
			}
			else {
				p1Score = -1;
			}
		}		
		this.getFirstPlayer().updateScore(p1Score);
		this.getSecondPlayer().updateScore(-p1Score);
	}
}
