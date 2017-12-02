package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String areYouHappy;
		String wantHappy;
		areYouHappy = JOptionPane.showInputDialog("Are you happy?");
		if (areYouHappy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		} else {
			wantHappy = JOptionPane.showInputDialog("Do you want to be happy?");
			if (wantHappy.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
			else if (wantHappy.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}

		}

		
	}
}
