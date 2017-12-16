
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	String answer;
		// 1. correct the birthdays for your family below
		String momsBirthday = "December 9th";
		String dadsBirthday = "September 9th";
		String myBirthday = "Febuary 28th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	answer = JOptionPane.showInputDialog("What birthday would you like");
		// 3. Print out what the user typed
		System.out.println(answer);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(answer.equalsIgnoreCase("mom")) {
		System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(answer.equalsIgnoreCase("dad")) {
		System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		else if(answer.equalsIgnoreCase("ryan")) {
		System.out.println(myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
		System.out.println("I don't remember that person's birthday!");
		}
	} 
}
