package Java_Challanges;

public class Java_Challange_12 {
	
	public static boolean repetingOccurance(int[] data) {
		
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < data.length-1; i++) {
			if(data[i] == data[i+1]) {
				count = count+1;
				return flag = true;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		
		int data[][] = {{1,2,2,1,1,3},{1,2},{-3,0,1,-3,1,1,1,-3,10,0}};
		for (int i = 0; i < data.length; i++) {
			System.out.println(repetingOccurance(data[i]));
		}

	}

}
