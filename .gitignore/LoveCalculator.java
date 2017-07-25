package bd.ac.du.iit;
import java.util.Random;
import javax.swing.JOptionPane;

public class LoveCalculator {
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("Your name?");
		String name1 = JOptionPane.showInputDialog("Your partner's name?");
		
		Random rn = new Random();
		int love = rn.nextInt(100)+1;
		
		
		String message = String.format("Your love is %d",love);
		
		JOptionPane.showMessageDialog(null, message);
		
	}

}
