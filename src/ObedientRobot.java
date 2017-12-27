import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot robo = new Robot();

	public static void main(String[] args) {
		String answerS;
		String answerC;
		robo.penDown();
		robo.setSpeed(10);
		drawSquare();
		robo.clear();
		drawTriangle();
		robo.clear();
		drawCircle();
		robo.clear();
		answerC = JOptionPane.showInputDialog("What color would you like?");
		if (answerC.equalsIgnoreCase("red")) {
			robo.setPenColor(Color.red);
		} else if (answerC.equalsIgnoreCase("blue")) {
			robo.setPenColor(Color.blue);
		} else if (answerC.equalsIgnoreCase("green")) {
			robo.setPenColor(Color.green);
		} else if (answerC.equalsIgnoreCase("orange")) {
			robo.setPenColor(Color.orange);
		} else if (answerC.equalsIgnoreCase("yellow")) {
			robo.setPenColor(Color.yellow);
		} else {
			JOptionPane.showMessageDialog(null, "I don't know that color.");
		}
		answerS = JOptionPane.showInputDialog("What shape would you like?");
		if (answerS.equalsIgnoreCase("square")) {
			drawSquare();
		} else if (answerS.equalsIgnoreCase("triangle")) {
			drawTriangle();
		} else if (answerS.equalsIgnoreCase("circle")) {
			drawCircle();
		} else {
			JOptionPane.showMessageDialog(null, "I don't know that shape.");
		}

	}

	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			robo.move(90);
			robo.turn(90);
		}
	}

	static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			robo.move(90);
			robo.turn(120);
		}
	}

	static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			robo.move(1);
			robo.turn(1);
		}
	}
}