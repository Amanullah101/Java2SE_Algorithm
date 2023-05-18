package loop;

import java.util.Scanner;

public class Quiz_5_Point_3 {

	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		int sumOfEven = 0;
		int sumOfOdd=0;
		while(true) {
			System.out.println("Enter a number");
			int num = input.nextInt();
			int evenNumb=0;
			int oddNumb = 0;
			
			
			if(num>0) {
				if(num%2==0) {
					sumOfEven = sumOfEven+num;
				}else {
					sumOfOdd = sumOfOdd+num;
				}
			}
				
			else
				break;
				
		}
		
		System.out.println("End Up! Good Bye");
		System.out.println("Sum of Even number="+sumOfEven);
		System.out.println("Sum of Odd number="+sumOfOdd);
	}
}
