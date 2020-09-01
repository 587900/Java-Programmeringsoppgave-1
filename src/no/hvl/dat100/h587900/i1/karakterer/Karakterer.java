package no.hvl.dat100.h587900.i1.karakterer;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

//Besvarte a, b og c i denne fila
public class Karakterer {

	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) doKarakter();	
	}
	
	public static void doKarakter() {
		int score;
		do {
			score = Integer.parseInt(showInputDialog("Kva er din poengsum?"));
			if (score >= 0 && score <= 100) break;
			showMessageDialog(null, "Score må vere mellom 0 og 100");
		} while(true);
		
		String karakter;
		if (score < 40) karakter = "F"; else
		if (score < 50) karakter = "E"; else
		if (score < 60) karakter = "D"; else
		if (score < 80) karakter = "C"; else
		if (score < 90) karakter = "B"; else
			karakter = "A";
		
		showMessageDialog(null, String.format("Du fekk karakteren: %s", karakter));
	}
}
