package Java_Challanges;

import java.util.Arrays;

public class JavaChallane_4 {

	public static void main(String[] args) {
		
		int[][] arr = {{2,2,1},{4,1,2,1,2},{1}};
		
		for(int j=0; j<arr.length; j++) {
			int num[] = arr[j];
			for (int i = 0; i < num.length-1; i++) {
				if(num[i] == num[i+1]) {
					num[i]='\0';
					num[i+1]='\0';
					}
			}
			Arrays.sort(num);
			System.out.println("Result of the 3 Dimensional Array : "+num[num.length-1]);
		}
		
	}

}
