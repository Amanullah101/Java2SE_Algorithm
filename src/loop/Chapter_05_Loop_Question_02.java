package loop;

public class Chapter_05_Loop_Question_02 {
	
	
	void fn(int i) {
	    if( i > 3)
	        return;

	   System.out.println(i);
	    fn(i + 1);
	   System.out.println("End of call where i = {i}"+i);
	    return;

	
	}
	public static void main(String[] args) {
		/*
		 * 
		 * int k;
		k=1;
		while(k<=88) {
			System.out.print("*");
			k++;
		}
		 */
		Chapter_05_Loop_Question_02 obj = new Chapter_05_Loop_Question_02();
		obj.fn(1);
		
	}
	
	
}
