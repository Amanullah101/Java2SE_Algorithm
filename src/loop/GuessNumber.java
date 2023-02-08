package loop;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int randomeNumber = (int)	(Math.random()*101);
	Scanner input = new Scanner(System.in);
	System.out.println("Guess a magic number 0 and 100");
	int guess = -1;
	char exit ;
	int status = -1;
	
	while(guess !=randomeNumber) {
		System.out.println("Enter your guess");
		guess = input.nextInt();
		if(guess==randomeNumber)
			System.out.println("Yes, the number is +"+randomeNumber);
		else if(guess>randomeNumber)
			System.out.println("Your guess is too high");
		else
			System.out.println("Your guess is too low");
		System.out.println("Press 1 to continue and 0 to exit"
				+ "");
		status = input.nextInt();
		if(status ==1)
			continue;
		if(status == 0)
			break;
		
	}
	}

}
