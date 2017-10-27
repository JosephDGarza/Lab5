import java.util.Scanner;

public class Lab5 {

	public static void diceRoll(int sides) {
		int dice1 = (int) (Math.random() * sides + 1);
		int dice2 = (int) (Math.random() * sides + 1);
		System.out.println(dice1 + "\n" + dice2);

		if (dice1 == 6 && dice2 == 6) {
			System.out.println("Box cars!");
		}

		if (dice1 + dice2 == 7) {
			System.out.println("Craps!");
		}
		if (dice1 == 1 && dice2 == 1) {
			System.out.println("Snake eyes!");
		}
		return;
	}

	// snake eyes = 1 on each
	// craps = 7 both added together
	// box cars = 6 on each dye
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput = "y";

		System.out.println("How many sides to your dye?");
		int dice = scnr.nextInt();

		while (userInput.equalsIgnoreCase("y")) {
			diceRoll(dice);
			System.out.println("roll again? y/n");
			userInput = scnr.next();
			
			

		}

		System.out.println("goodbye");
		scnr.close();
	}

}
