import java.util.Scanner;
public class Voweling {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter a nice thought: ");
		String thought = input.nextLine();
		input.close();
		
		int avowel = 0, evowel = 0, ivowel = 0, ovowel = 0, uvowel = 0, novowel = 0;
	{	
		for (int i = 0; i < thought.length(); ++i)
		{
			char ch = thought.charAt(i);
			if(ch == 'a')
				++avowel;
			if(ch == 'e')
				++evowel;
			if(ch == 'i')
				++ivowel;
			if(ch == 'o')
				++ovowel;
			if(ch == 'u')
				++uvowel;
			else
				++novowel;
		}	
			
		novowel = novowel - avowel - evowel - ivowel - ovowel - uvowel;
	
		System.out.println("a Vowels: " + avowel);
		System.out.println("e Vowels: " + evowel);
		System.out.println("i Vowels: " + ivowel);
		System.out.println("o Vowels: " + ovowel);
		System.out.println("u Vowels: " + uvowel);
		System.out.println("Everything else: " + novowel);
		
	}

	}

}
