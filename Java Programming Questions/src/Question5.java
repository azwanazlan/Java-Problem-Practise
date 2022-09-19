import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter base: ");
		int base = sc.nextInt();
		System.out.print("Please enter exponent: ");
		int e = sc.nextInt();
		int i = 1, result =1;

		do {
			result = result * base; 
			i++;
		}
		
		while (i <= e);
		System.out.println("The answer is: " + result );
	}

}
   