import javax.swing.JOptionPane;

public class AirlineRegistration {
public static void main(String[] args) {
	String firstname = JOptionPane.showInputDialog("What is Your First Name");
	String lastname = JOptionPane.showInputDialog("What is Your Last Name");
	String destination = JOptionPane.showInputDialog("Were is your destination");
	String birthday = JOptionPane.showInputDialog("When is your birthday (for security purposes)");
	String gender = JOptionPane.showInputDialog("Are you a male or female (for security purposes)");
	JOptionPane.showMessageDialog(null, lastname + "/" +  firstname + "(" + birthday + "," + gender + ")  \n traveling to:" + destination );
}
}
