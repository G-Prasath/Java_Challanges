package Java_Challanges;

public class Last_string_Length {

	public static void main(String[] args) {
		
		String[] s = {"Hello World", "   fly me   to   the moon  ","luffy is still joyboy"};

        for(int i=0; i<s.length; i++){
            s[i] = s[i].trim();
            String split[] = s[i].split(" ");
            int len = split.length;
            int result = split[len-1].length();
            System.out.println("The Given Text : "+s[i]);
            System.out.println("The Last Word Length is : "+result);
            System.out.println("\n");
        }

	}

}
