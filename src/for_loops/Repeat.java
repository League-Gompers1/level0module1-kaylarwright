import javax.swing.JOptionPane;

public class Repeat {
public static void main(String[] args) {
	String word = JOptionPane.showInputDialog(null, "Enter a word");
	String number = JOptionPane.showInputDialog(null, "Enter a number");
	int numbers = Integer.parseInt(number);
	for (int i = 0; i <= numbers; i++) {
		System.out.println(word);
		
	}
}
}
