package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[]args) {
String answer;
answer = JOptionPane.showInputDialog("What is your Zodiac Sign?");
if(answer.equalsIgnoreCase("Aries")){
	JOptionPane.showMessageDialog(null, "You're Courageous, energetic, willful, commanding, leading. You often lead when following would be best course of action.");
}
else if(answer.equalsIgnoreCase("Taurus")) {
	JOptionPane.showMessageDialog(null, "You are pleasure seeking, love control, dependable, grounded, provokes slowly, and highly sensual in nature.");
}
else if(answer.equalsIgnoreCase("Gemini")) {
	JOptionPane.showMessageDialog(null, "You'll have the chance to connect with more people and engage in more new situations as never before.");			
}
else if(answer.equalsIgnoreCase("Cancer")) {
	JOptionPane.showMessageDialog(null, "You have access to all that the stars have to offer. ");
}
else if(answer.equalsIgnoreCase("Leo")) {
	JOptionPane.showMessageDialog(null, "You blaze with energy, challenges, and opportunities of the most practical and far-reaching kind.");
}
else if(answer.equalsIgnoreCase("Virgo")) {
	JOptionPane.showMessageDialog(null, "You can make the most of the ups.");
}
else if(answer.equalsIgnoreCase("Libra")) {
	JOptionPane.showMessageDialog(null, "Be prepared for people to look to you for advice and leadership.");
}
else if(answer.equalsIgnoreCase("Scorpio")) {
	JOptionPane.showMessageDialog(null, "You're a powerful person and a force of nature!");
}
else if(answer.equalsIgnoreCase("Sagittarius")) {
	JOptionPane.showMessageDialog(null, "Your planet Jupiter is powerful and ambitious and will keep you going full blast in the direction that moves you forward. ");
}
else if(answer.equalsIgnoreCase("Capricorn")) {
	JOptionPane.showMessageDialog(null, "A clearer perspective will make it much easier to achieve your goals and dreams.");
}
else if(answer.equalsIgnoreCase("Aquarius")) {
	JOptionPane.showMessageDialog(null, "You may not always take yourself seriously, but please take what you do seriously, and see great progress and success this year.");
}
else if(answer.equalsIgnoreCase("Pisces")) {
	JOptionPane.showMessageDialog(null, "Pisces, the stars are working hard for you.");
}
else {
	JOptionPane.showMessageDialog(null, "Huh?");
}
}
}