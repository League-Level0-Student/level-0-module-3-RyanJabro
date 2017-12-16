package elseif;

import javax.swing.JOptionPane;

public class YearsAlive {
public static void main(String[]args) {
	String answer;
	answer = JOptionPane.showInputDialog("What year were you born (ex: 1993)");
int answerYears = Integer.parseInt(answer);
for(int i = 2017; i >= answerYears; i--) {
	System.out.println(i);
}
}
}
