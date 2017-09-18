//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
			int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String input = JOptionPane.showInputDialog(null, "What can travel around the world while staying in a corner?");
String answer = "stamp"; 
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(input.equals(answer)){
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
}else{
	JOptionPane.showMessageDialog(null, "Wrong, The right answer is a " + answer);
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
input = JOptionPane.showInputDialog(null, "What has a head and a tail, but no body?");
answer = "coin";
if(input.equals(answer)){
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
}else{
	JOptionPane.showMessageDialog(null, "Wrong, The right answer is a " + answer);
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}

