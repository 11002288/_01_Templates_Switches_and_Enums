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
	enum Zodiac{
		 ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO,LIBRA, SCORPIO, SAGITTARIUS, CAPRICORN, AQUARIUS, PISCES
		
	}
	

	// 3. Make a main method to test your method
	public static void main(String[] args) {
		String some = JOptionPane.showInputDialog("What is your horoscope(ex: ARIES, TAURUS etc.)");
		Zodiac horo = Zodiac.valueOf(some);
		System.out.println(horo);
		if  (horo == Zodiac.ARIES) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Ambitious, independent, impatient.");
		} else if (horo == Zodiac.TAURUS) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Dependable, musical, practical");
		} else if (horo == Zodiac.GEMINI) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Curious, affectionate, kind");
		} else if (horo == Zodiac.CANCER) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Intuitive, emotional, intelligent, passionate");
		} else if (horo == Zodiac.LEO) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Proud, bold, ambitious");
		} else if (horo == Zodiac.VIRGO) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Graceful, organized, kind");
		} else if (horo == Zodiac.LIBRA) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Diplomatic, artistic, intelligent");
		} else if (horo == Zodiac.SCORPIO) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Seductive, passionate, independent");
		} else if (horo == Zodiac.SAGITTARIUS) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Adventurous, creative, strong willed");
		} else if (horo == Zodiac.CAPRICORN) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Detail-oriented, intelligent, hardworking");
		} else if (horo == Zodiac.AQUARIUS) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Progressive, original, humanitarian, independent");
		} else if (horo == Zodiac.PISCES) {
			JOptionPane.showConfirmDialog(null, "Key Traits: Intuitive, compassionate, artistic, gentle, wise, musical.");
		} else {
			JOptionPane.showConfirmDialog(null, "That is not a Zodiac");

		}
	}

}
