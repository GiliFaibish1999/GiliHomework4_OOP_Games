package Games_Project;

// Gili Faibish game project - Action class
public class Action {
	
	// Name string definition
	private String name;
	
	// Action definition
	public Action(String n) {
		this.name = n;
	}
	
	// This function returns the name of the requested object
	public String getName(){
		return this.name;
	}
	
	// This function returns the boolean answer value result of the suitable variables 
	public boolean equals(Object other) {
		boolean answer = false;
		if (other instanceof Action)
			answer = this.name.equals(((Action)other).name);
		return answer;
	}
}