//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		String answer;
		int guesses = 1;
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100) + 1;
		// 2. Print out the random variable above
		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
for(guesses = 1; guesses < 11; guesses++) {
		answer = JOptionPane.showInputDialog("Guess a whole number between 1 - 100");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
		int answerNumber = Integer.parseInt(answer);	
			// 5. if the guess is correct
		if(answerNumber == random) {
			JOptionPane.showMessageDialog(null, "You win! You guessed " + guesses + " time(s)");
		System.exit(0);
		}
		// 6. win
			// 7. if the guess is high
			else if(answerNumber > random) {
			JOptionPane.showMessageDialog(null, "The guess is too high!");
				}// 8. tell them it's too high
			// 9. if the guess is low
				else {
				JOptionPane.showMessageDialog(null, "The guess is too low!");
				}
					// 10. tell them it's too low

// 12. tell them they lose
		}
	JOptionPane.showMessageDialog(null, "You lose :( !");
	
}
}


