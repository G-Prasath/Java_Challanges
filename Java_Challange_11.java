package Java_Challanges;

public class Java_Challange_11 {

	public static char firstApper(String s) {
		
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1) ) {
				return s.charAt(i);
//				break;
			}
		}
		return 'N';
	}
	
	public static void main(String[] args) {
		
		String data[] = {"abccbaacz","abcdd","abcdb"};
		for (int i = 0; i < data.length; i++) {
			char result = firstApper(data[i]);
			if(result != 'N'){
				System.out.println("First Apper Letters : "+result);
			}
			else {
				System.out.println("No First Apper Letters");
			}
		}
		
	}

}
