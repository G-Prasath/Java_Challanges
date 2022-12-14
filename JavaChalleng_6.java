package Java_Challanges;

public class JavaChalleng_6 {

	public static void main(String[] args) {
		
		int[][] data = {{3,1,3},{2,2,1,1,1,2,2}};
		
		for(int x=0; x<data.length; x++) {
			int[] num = data[x];			
			
			int[] freq = new int[num.length];
			for (int i = 0; i < freq.length; i++) {
				int count = 1;
				for (int j = i+1; j < freq.length; j++) {
					if(num[i] == num[j]) {
						count++;
						freq[j] = -1;
					}
				}
				if(freq[i] != -1) {
					freq[i] = count;
				}
			}
			for (int i = 0; i < freq.length;) {
				if(freq[i] != -1) {
					System.out.println(num[0]+" Presented in Largest Time : "+freq[i]);
				}
				break;				
			}	
			
		}					
	}

}
