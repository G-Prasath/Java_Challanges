package Java_Challanges;

public class JavaChallengs_8 {
	
	public static boolean check(int[] nums, int k) {
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length && j<=i+k; j++) {
				if(nums[j] == nums[i]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] nums = {{1,2,3,1},{1,0,1,1},{1,2,3,1,2,3}};
		int k[] = {3,1,2};
		for (int i = 0; i < k.length; i++) {
			System.out.println(check(nums[i], k[i]));
		}

	}

}
