import java.util.Scanner;

public class evenFlow {
	
	public static void main(String[] args) {
		
		int number, count, sum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number 2 or greater: ");
		number = input.nextInt();
		input.close();
		
		if (number < 2) {
			System.out.println("You failed to follow directions. Goodbye");
			System.exit(0);
		}
			else
				
			for (count = 2; count <= number; count ++)
			{
				if(count % 2 == 0)
				{
					sum = sum + count;
				}
			}
		System.out.println("\nThe sum of all even numbers up to " + number + " = " + sum + ".");
			
	}

}
