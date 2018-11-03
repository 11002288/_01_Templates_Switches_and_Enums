package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 1, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("Ice Cream?");
			break;
		case "Saturday":
			System.out.println("Yaa boooyyzzzzz");
			break;
		case "Monday":
				System.out.println("oof");	
			break;
		case "Tuesday":
			System.out.println("aaaahhhhhhh");
			break;
		case "Wednesday":
			System.out.println("Squidward on a chair");
			break;
		case "Thursday":
			System.out.println("wow");
			break;
		case "Friday":
			System.out.println("pow");
			break;
		
		
		
		}
	}
}
