package algorithm;

import javax.swing.text.PlainDocument;

public class Palindrome {

	boolean checkPalindrome(String txt) {
		int i = 0;
		boolean status =false;
		int j = txt.length()-1;
		while(i<j) {
			if(txt.charAt(i)==txt.charAt(j)) {
			
				status = true;
				
			}else {
				status = false;
			}
			i++;
			j--;
		}
		
		return status;
	}
	
	public static void main(String[] arg) {
		Palindrome obj = new Palindrome();
		
		System.out.println(obj.checkPalindrome("racecar"));
	}
}
