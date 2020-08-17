package Games_Project;

// Gili Faibish game project - RandomPlayer class
public class RandomPlayer extends Player{
	
	// This function defines a random type player
	public RandomPlayer(String name) {
		super(name);
	}
	
	// This function selects the action of the random type player
	public Action selectAction(Action[] actions){
		int randomIDX = (int)(Math.random()*actions.length);
		return actions[randomIDX];
	}
}
