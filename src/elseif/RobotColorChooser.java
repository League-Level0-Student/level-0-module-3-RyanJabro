
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
	
		Robot robo = new Robot();
		String color;
		
		Random numberMaker = new Random();
		for(int i = 0; i < 9999; i++) {
		int randomRed = numberMaker.nextInt(256);
		int randomGreen = numberMaker.nextInt(256);
		int randomBlue = numberMaker.nextInt(256);
		//3. ask the user what color they would like the robot to draw
		
		color = JOptionPane.showInputDialog("What color do you want the robot to draw?");
		//4. use an if/else statement to set the pen color that the user requested

if(color.equalsIgnoreCase("red")) {
robo.setPenColor(Color.red);
}       
else if(color.equalsIgnoreCase("blue")) {
robo.setPenColor(Color.blue);
} 
else if(color.equalsIgnoreCase("green")) {
robo.setPenColor(Color.green);
}   
else if(color.equalsIgnoreCase("yellow")) {
robo.setPenColor(Color.yellow);
}  
else if(color.equalsIgnoreCase("pink")) {
robo.setPenColor(Color.pink);
}  
else if(color.equalsIgnoreCase("orange")) {
robo.setPenColor(Color.orange);
}  
else {
	robo.setPenColor(randomRed, randomGreen, randomBlue);
}
//5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
robo.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
robo.penDown();
robo.setSpeed(10);
robo.move(75);
robo.turn(-90);
robo.move(75);
robo.turn(-90);
robo.move(75);
robo.turn(-90);
robo.move(75);

	}
}
}