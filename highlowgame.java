import java.util.Random;

import javax.swing.JOptionPane;

public class highlowgame {
public static void main(String[] args) {
	Random number = new Random();
	int x = number.nextInt(101);
	String answer = JOptionPane.showInputDialog(null,"Guess a number between 1 and 100\n"
			+ "BE CAREFUL YOU ONLY GET 10 TRIES");
	int numbers = Integer.parseInt(answer);
	for(int i = 0;i < 10; i = 1){
		
		if(numbers > x){
			answer = JOptionPane.showInputDialog(null,"Your number is to high next time guess LOWER");
			numbers = Integer.parseInt(answer);
		}
			if(numbers < x){
				answer = JOptionPane.showInputDialog(null,"Your number is to low next time guess HIGHER");
				numbers = Integer.parseInt(answer);
			}
			if(numbers == x){
			JOptionPane.showMessageDialog(null, "YOU ARE CORRECT");
				x=11;
			}
		}
	}
}



