package Java_Challanges;

public class Java_Challenge_9 {
	
		public static void main(String[] args) {
			
			String name[] = {"leetcode","loveleetcode"};
			
			for(int k=0; k<name.length; k++) {
				
				String s = name[k];
				for (int i = 0; i < s.length(); i++) {
					int count = 1;
//					boolean flag = false;
					for (int j = i+1; j < s.length(); j++) {
						if(s.charAt(i) == s.charAt(j)) {
							count++;
//							flag = true;
							break;
						}
					}
					if(count == 1) {
						System.out.println(s.charAt(i)+" : Non Repeting value "+i+" Index");
						break;
					}
				}
				
			}	
		}
}
