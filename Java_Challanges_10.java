package Java_Challanges;

public class Java_Challanges_10 {

	public static int jwelsStone(String Jewels, String Stone) {
		
		int count = 0;
		for(int i=0; i<Jewels.length(); i++) {
			for(int j=0; j<Stone.length(); j++) {
				if(Jewels.charAt(i) == Stone.charAt(j)) {
					count = count+1;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		String[] Jewels = {"aA", "z"};
		String[] Stone = {"aAAbbbb", "ZZ"};
		
		for (int i = 0; i < Stone.length; i++) {
			int result = jwelsStone(Jewels[i], Stone[i]);
			System.out.println("No Of Stone Presented : "+ result);
		}
		
		

	}

}
