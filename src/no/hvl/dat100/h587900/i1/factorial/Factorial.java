package no.hvl.dat100.h587900.i1.factorial;

import static javax.swing.JOptionPane.*;

public class Factorial {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(showInputDialog("n:"));
		if (n < 0) {
			showMessageDialog(null, "n må vere større eller lik 0!");	//oppgåva seier > 0, men eg tok med 0 også
			return;
		}

		showMessageDialog(null, String.format("N: %d! = %d\nR: %d! = %d", n, factorial(n), n, factorialRec(n)));
	}
	
	//Recursive
	public static long factorialRec(long n) {
		if (n <= 0) return 1;
		return n*factorialRec(n-1);
	}
	
	public static long factorial(long n) {
		long result = 1;
		while (n > 0) result *= n--;
		return result;
	}
	
	
}
