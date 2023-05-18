package loop;

import java.util.Scanner;

public class Randome_Number {

	 public static void main(String[] arg) {
		 int number1 = (int) (Math.random()*10);
		 int number2 = (int) (Math.random()*10);
		 Scanner scan = new Scanner(System.in);
		 System.out.println("What is "+number1+" + "+number2+" ?");
		 int answer = scan.nextInt();
		 while(number1+number2 !=answer) {
			 System.out.println("Wrong answer . Try again."+ "what is "+number1+" + "+number2+" ?");
			 answer=scan.nextInt();
		 }
		 System.out.println("You got it");
	 }
}
