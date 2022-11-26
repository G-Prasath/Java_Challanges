package Java_Challanges;

public class JavaChallange_5 {
	
	public static int call(int number) {
		int rem = 0;
		int cal = 0;
		
		while(number > 0) {
			rem = number % 10;
			cal = cal + (rem * rem);
			number = number / 10;
		}
		
		return cal;
	}
	

	public static void main(String[] args) {
		
		int n[] = {13, 2};
		for (int i = 0; i < n.length; i++) {
			int result = n[i];
			
			while(result != 1 && result != 4) {
				result = call(result);
			}
			if(result == 1) {
				System.out.println(n[i] + " is Happy Number");
			}
			else if(result == 4){
				System.out.println(n[i] +" is Not Happy Number");
			}
		}
		
		
	}

}
