import javax.swing.JOptionPane;

public class printingnumbers {
	public static void main(String[] args) {
		String numbers = JOptionPane.showInputDialog(null, "Enter a number");
		String number = JOptionPane.showInputDialog(null, "Enter another number");
		String nnumber = JOptionPane.showInputDialog(null, "Enter one last number");
		int nums = Integer.parseInt(numbers);
		int num = Integer.parseInt(number);
		int ber = Integer.parseInt(nnumber);
		if (nums < num) {
			int temp = nums;
			nums = num;
			num = temp;
			
		if (num < ber){
			int temp = num;
			num = ber;
			ber = temp;
			
		if (num )
		}
		
			

		}
	}
}