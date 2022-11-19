package Java_Challanges;

public class Exponent {

	public static void main(String[] args) {
		
		int num[] = {4,8};
        for(int i=0; i<num.length; i++){
            double sqrt = Math.pow(num[i], 0.5);
            int result = (int) sqrt;
            System.out.println(num[i]+" Sqrt of "+result+" without decimal points");
        }

	}

}
