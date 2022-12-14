package Java_Challanges;

import java.util.Arrays;

public class Javachallengs_7 {
	
	public static void main(String[] args) {
		
		int[][] data = {{1,2,3,1},{1,2,3,4},{1,1,1,3,3,4,3,2,4,2}};
		for(int j=0; j<data.length; j++) {
			
			int n[] = data[j];
			Arrays.sort(n);
			boolean flag = false;
			
			for (int i = 0; i < n.length-1; i++) {
				if(n[i] == n[i+1]) {
					flag = true;
				}
			}
			System.out.println("Reslut : "+flag);
			
		}
	}

}
