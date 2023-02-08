package loop;

public class Chapter_05_Question_01 {

	public static void main(String[] args) {
		
		int k=1;
		int total=0;
		while(k<=50) {
			
			total = k*k+total;
			/*
			 * 
			 n(n+1)(2n+1)/6
			 */
			k++;
		}
		System.out.println("Total="+total);
		System.out.println((50*(50+1)*(2*50+1))/6);
	}
}
