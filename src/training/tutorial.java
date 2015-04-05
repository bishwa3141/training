

package training;

import java.awt.FlowLayout;


public class tutorial {
	
	public static void main(String Args[]){
	
		String fn = JOptionPane.showInputDialog("Enter First Number: ");
		String ln = JOptionPane.showInputDialog("Enter Second Number: ");
	
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(ln);
		
		
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The Answer is: " + sum, "SUM" , JOptionPane.PLAIN_MESSAGE);
		}
}
