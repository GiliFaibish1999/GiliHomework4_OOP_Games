package Games_Project;

import java.util.ArrayList;

// Gili Faibish game project - GameDriver class
public class GameDriver {
	public static void main(String[] args) {
		
		// Array lists of game plays definitions
		ArrayList<Game> rpsGames = new ArrayList<Game>();
		ArrayList<Game> pdGames = new ArrayList<Game>();
		
		// Adding the players (one is random and the other is consecutive
		RandomPlayer Pla1 = new RandomPlayer("Gilush");
		ConsecutivePlayer Pla2 = new ConsecutivePlayer("Gili");
		
		// Adding the games with my the players defined above
		rpsGames.add(new RockPaperScissors(Pla1, Pla2));
		pdGames.add(new PrisonerDilemmas(Pla1, Pla2));
		
		// Playing the prisoner dilemma game
		System.out.println("Playing Prisoner Dilemmas!");
		pdGames.get(0).initActions();
		Action Pla1PDact = Pla1.selectAction(pdGames.get(0).actions);
		Action Pla2PDact = Pla2.selectAction(pdGames.get(0).actions);
		pdGames.get(0).rewardPlayers(Pla1PDact, Pla2PDact);
		System.out.println( Pla1.getName() + " chose: " + Pla1PDact.getName());
		System.out.println( Pla2.getName() + " chose: " + Pla2PDact.getName());
		System.out.println(Pla1.getName() + " score: " + pdGames.get(0).getFirstPlayer().getScore());
		System.out.println(Pla2.getName() + " score: " + pdGames.get(0).getSecondPlayer().getScore());
		
		// Printing the game result
		if (pdGames.get(0).getFirstPlayer().getScore() == pdGames.get(0).getSecondPlayer().getScore()) {
			System.out.println("It's a tie! "+ "\r\n" +"Both chose '" + Pla1PDact.getName() 
			+ "' And got " + -pdGames.get(0).getFirstPlayer().getScore() + " Years");
		}
		else {
			System.out.println( "The winner is " + pdGames.get(0).getWinner().getName());
		}
		
		// Updating the players scores from the former game results to zero
		Pla1.updateScore(0);
		Pla2.updateScore(0);
		
		// Playing the rock paper scissors game
		System.out.println("\r\n" + "Playing Rock Paper Scissors!");
		rpsGames.get(0).initActions();
		Action Pla1RPSact = Pla1.selectAction(rpsGames.get(0).actions);
		Action Pla2RPSact = Pla2.selectAction(rpsGames.get(0).actions);
		rpsGames.get(0).rewardPlayers(Pla1RPSact,  Pla2RPSact);
		System.out.println( Pla1.getName() + " chose: " + Pla1RPSact.getName());
		System.out.println( Pla2.getName() + " chose: " +  Pla2RPSact.getName());
		
		// Printing the game result
		if (rpsGames.get(0).getFirstPlayer().getScore() == rpsGames.get(0).getSecondPlayer().getScore()) {
			System.out.println("It's a tie! "+ "\r\n" +"Both chose '" + Pla1RPSact.getName() + "'");
		}
		else {
			System.out.println( "The winner is " + rpsGames.get(0).getWinner().getName());
		}
	}
}