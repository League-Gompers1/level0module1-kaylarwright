import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
public static void main(String[] args) {
	String answer =  JOptionPane.showInputDialog("How many cats do you have");
	int newnumber = Integer.parseInt(answer);

		if (newnumber > 3){
			answer = JOptionPane.showInputDialog("You are a crazy cat lady");
		}else if (newnumber == 0){
		playVideo("https://www.youtube.com/watch?v=Fa_I68L_APY");	
		}
else if(newnumber < 3){
		playVideo("https://www.youtube.com/watch?v=geqVuYmo8Y0");
		}
}
static void playVideo(String videoURL) {
	try {
		URI uri = new URI(videoURL);
		java.awt.Desktop.getDesktop().browse(uri);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

	}
	


