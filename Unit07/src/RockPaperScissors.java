//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int rand = (int) (Math.random() * 3 + 1);
		if(rand == 1) {
			compChoice = "R";
		} else if (rand == 2) {
			compChoice = "P";
		} else if (rand == 3) {
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		String winner = "";
		//winner = playChoice;
		System.out.println(playChoice);
		System.out.println(compChoice);
		if(playChoice.equals("R") && compChoice.equals("P")) {
			winner = "Computer wins";
			//System.out.println(winner);
		} else if(playChoice.equals("S") && compChoice.equals("P")) {
			winner = "Player wins";
			//System.out.println(winner);
		} else if(playChoice.equals("P") && compChoice.equals("R")) {
			winner = "Player wins";
			//System.out.println(winner);
		} else if(playChoice.equals("S") && compChoice.equals("R")) {
			winner = "Computer wins";
			//System.out.println(winner);
		} else if(playChoice.equals("R") && compChoice.equals("S")) {
			winner = "Player wins";
			//System.out.println(winner);
		} else if(playChoice.equals("P") && compChoice.equals("S")) {
			winner = "Computer wins";
			//System.out.println(winner);
		} else if(playChoice.equals(compChoice)) {
			winner = "Draw";
			//System.out.println(winner);
		}
		return winner;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}