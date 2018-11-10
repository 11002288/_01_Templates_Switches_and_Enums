package _05_Enum_Stuff;

import javax.swing.JOptionPane;
import javax.xml.ws.handler.MessageContext.Scope;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.
	// ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO,
	// LIBRA, SCORPIO, SAGITTARIUS, CAPRICORN, AQUARIUS, PISCES
	public _00_Horoscope(Enum scope) {
		if  (scope == Zodiac.ARIES) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Ambitious, independent, impatient.");
		} else if (scope == Zodiac.TAURUS) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Dependable, musical, practical");
		} else if (scope == Zodiac.GEMINI) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Curious, affectionate, kind");
		} else if (scope == Zodiac.CANCER) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Intuitive, emotional, intelligent, passionate");
		} else if (scope == Zodiac.LEO) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Proud, bold, ambitious");
		} else if (scope == Zodiac.VIRGO) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Graceful, organized, kind");
		} else if (scope == Zodiac.LIBRA) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Diplomatic, artistic, intelligent");
		} else if (scope == Zodiac.SCORPIO) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Seductive, passionate, independent");
		} else if (scope == Zodiac.SAGITTARIUS) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Adventurous, creative, strong willed");
		} else if (scope == Zodiac.CAPRICORN) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Detail-oriented, intelligent, hardworking");
		} else if (scope == Zodiac.AQUARIUS) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Progressive, original, humanitarian, independent");
		} else if (scope == Zodiac.PISCES) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Intuitive, compassionate, artistic, gentle, wise, musical.");
		} else {
			JOptionPane.showConfirmDialog(null, "That is not a Zodiac");

		}
		
		
	}
	

	// 3. Make a main method to test your method
	public static void main(String[] args) {
		String some = JOptionPane.showInputDialog("What is your horoscope(ex: ARIES, TAURUS etc.)");
		Zodiac horo = Zodiac.valueOf(some);
		System.out.println(horo);
		
	}

}
