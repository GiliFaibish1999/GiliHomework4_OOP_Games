package Games_Project;

// Gili Faibish game project - ConsecutivePlayer class
public class ConsecutivePlayer extends Player {
	
	// Variable definition (the permanent chosen index, here set to the last action option)
	private int lastIdx;
	
	// This function defines a consecutive type player
	public ConsecutivePlayer(String name) {
		super(name);
		this.lastIdx = 0;
	}
	
	// This function selects the action of the consecutive type player
	public Action selectAction(Action[] actions) {
		this.lastIdx = (this.lastIdx + 1)% actions.length;
		return actions[this.lastIdx];
	}
}
