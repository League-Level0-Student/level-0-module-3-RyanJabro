package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[]args) {
String answer;
answer = JOptionPane.showInputDialog("What is your Zodiac Sign?");
if(answer.equalsIgnoreCase("Aries")){
JOptionPane.showMessageDialog(null, "You're Horoscope reading is... Someone you meet at a networking event today will be important, so keep communicating.\n" + 
		"Be open to meeting new people today and be especially forthcoming at any networking events or social meetings connected to your work life. \n" +
		"Someone you meet at one of these events will be important for your career and will be firmly on your side. \n" +
		"Youll feel confident in any decision making you are faced with today, make sure you keep communicating.");
}
}
}