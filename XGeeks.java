package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String KaylaPower = "Telekinesis";
		String CarmanPower = "Eathing Things";
		String SusannaPower = "Flying";
		String EstelaPower = "Drawing";
		String BrisaPower = "Turning Into Anime Characters";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String ans = JOptionPane.showInputDialog("Enter the name of the person with the superpower you want \n"
				+ "Kayla \n" + "Carman  \n" + "Susanna  \n" + "Estela  \n" + "Brisa ");
		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (ans.equals("Kayla")) {
			JOptionPane.showMessageDialog(null, "Your superpower is " + KaylaPower);
		}
		if (ans.equals("Carman")) {
			JOptionPane.showMessageDialog(null, "Your superpower is " + CarmanPower);
		}
		if (ans.equals("Susanna")) {
			JOptionPane.showMessageDialog(null, "Your superpower is " + SusannaPower);
		}
		if (ans.equals("Estela")) {
			JOptionPane.showMessageDialog(null, "Your superpower is " + EstelaPower);
		}
		if (ans.equals("Brisa")) {
			JOptionPane.showMessageDialog(null, "Your superpower is " + BrisaPower);
		}
	}
}