package Games_Project;

// Gili Faibish game project - PrisonerDilemmas class
public class PrisonerDilemmas extends Game{
	
	// Definition of a game object from the type of 'Prisoner's Dilemma' with the suitable name and players attributes definition
	public PrisonerDilemmas(Player p1, Player p2){
		super(p1, p2, "Prisoner's Dilemma");
	}
	
	// Definition of the initial action options in a 'Prisoner's Dilemma' game
	protected void initActions(){
		this.actions = new Action[2];
		this.actions[0] = new Action("Silent");
		this.actions[1] = new Action("Blame");
	}
	
	// Runs the 'Prisoner's Dilemma' game, and updates the scores of the players according to the result of the game
	protected void rewardPlayers(Action a1,
	Action a2) {
		if (a1.getName().equals("Blame") &&
				a2.getName().equals("Blame")) {
			this.getFirstPlayer().updateScore(-5);
			this.getSecondPlayer().updateScore(-5);
		}
		
		if (a1.getName().equals("Silent") && 
				a2.getName().equals("Blame")) {
			this.getFirstPlayer().updateScore(-15);
			this.getSecondPlayer().updateScore(0);
		}
		
		if (a1.getName().equals("Blame") && 
				a2.getName().equals("Silent")) {
			this.getFirstPlayer().updateScore(0);
			this.getSecondPlayer().updateScore(-15);
		}
		
		if (a1.getName().equals("Silent") &&
				a2.getName().equals("Silent")) {
			this.getFirstPlayer().updateScore(-1);
			this.getSecondPlayer().updateScore(-1);
		}
				
	}
}
