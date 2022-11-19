package Java_Challanges;

public class Pallindrome {

	public static void main(String[] args) {
		
		String[] s = {"A man, a plan, a canal: Panama", "race a car", ""};
		String result = "";

        for(int i=0; i<s.length; i++){
        	String name = s[i];
        	name = name.replaceAll("[^a-zA-Z0-9]","");
        	name = name.toLowerCase();
        	result = name;
        	char[] ch = name.toCharArray();
        	String rev=""; 
        	
            for(int j=ch.length-1;j>=0;j--){  
                rev+=ch[j];  
            }  
        	
            if(result.equals(rev)) {
            	System.out.println(s[i]+" : is Palindrome");
            }
            else {
            	System.out.println(s[i]+" : is Not Palindrome");
            }
        }
        

	}

}
