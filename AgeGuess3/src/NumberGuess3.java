import java.util.Scanner;
import java.util.Random;

public class NumberGuess3 {
	
		public static void main(String[] args) {
			
			Random gen = new Random();
			int age = gen.nextInt(100);
			Scanner input = new Scanner (System.in);
			boolean game = true;
			
			while (game == true) {
				
			
				System.out.print("Can you guess my age?: ");
				int ageGuess = input.nextInt(); 
		
				if (ageGuess == age) {
					game = false;
				}
				else if (ageGuess < age) {
				System.out.println("You need to guess higher.");
				}
				else if (ageGuess > age) {
					System.out.println("You need to guess lower.");
				}
			}
			System.out.println("\nCorrect!");
			System.out.println("Winner, winner, chicken dinner.");
		}

	}