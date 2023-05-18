package array;

public class TwoDimensionalArray_01 {

	public static void main(String[] arg) {
		// Two Dimensional Array
		char std[][]= {
				
				{'A','B'},{'C','D'}
		};
		int s[]= {
			5,6,7	
		};
		String comma=",";
		
		// I want to fetch or dispaly the element from array
		// We will use nested for loops
		//System.out.println(std.length);
		for(int i=0;i<std.length;i++) {
			for(int j=0;j<std.length;j++) {
			
				
				System.out.print(std[i][j]+",");
				
				
				
				
			}
			
		}
	}
}
