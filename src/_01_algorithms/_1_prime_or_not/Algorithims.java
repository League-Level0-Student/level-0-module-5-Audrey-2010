package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Algorithims {
public static void main(String[] args) {
	String number=JOptionPane.showInputDialog(null, " Type in a number");
	int numberInt=Integer.parseInt(number);
	for (int i = 2; i<numberInt; i++) {
		if(numberInt % i ==0 ) {
		JOptionPane.showMessageDialog(null, "Nope! This isn't a prime number");
		System.exit(0);
		}
		
	}
	JOptionPane.showMessageDialog(null, "Yep! This is a prime number");
}
}
