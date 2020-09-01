package no.hvl.dat100.h587900.i1.trinnskatt;

import static javax.swing.JOptionPane.*;

public class Trinnskatt {

	public static void main(String[] args) {
		
		double brutto = Double.parseDouble(showInputDialog("Kva er din brutto?"));
		
		double prosent;
		if (brutto < 180800) prosent = 0; else
		if (brutto <= 254500) prosent = 0.019; else
		if (brutto <= 639750) prosent = 0.042; else
		if (brutto <= 999550) prosent = 0.132; else
			prosent = 0.162;
		
		double trinnskatt = brutto * prosent;
		
		System.out.println(String.format("Brutto: %s, Trinnskatten din er: %.2f", brutto, trinnskatt));
		
	}
	
}
