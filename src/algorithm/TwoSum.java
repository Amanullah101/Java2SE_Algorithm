package algorithm;



public class TwoSum {

	
	boolean twoSum() {
		boolean status = false;
		int[] nums= {1, 2, 4, 6, 8, 9, 14, 15};
		int target = 10;
		int i=0;
		int j = 1;
		while(i<nums.length-1) {
			while(j<nums.length) {
				if(target==(nums[i]+nums[j])) {
					status = true;
					break;
				}
			j++;}
		i++;j=i+1;}
		return status;
	}
	public static void main(String[] arg) {
		TwoSum obj = new TwoSum();
		System.out.println(obj.twoSum());
	}
}
