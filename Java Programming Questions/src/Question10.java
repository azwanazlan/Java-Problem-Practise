import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter NUM 1: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter NUM 2: ");
		int num2 = sc.nextInt();
		
		int sum = 0, mul = 1;
		if(num2 > num1) {
			for(int i=num1+1; i < num2 ; i++) { 
				sum = sum + i;
				mul = mul * i;
			}
		}else {
			System.out.println("NUM 2 cannot bigger that NUM 1. Please try again.");
			System.exit(0);
		}
		System.out.println("Result of SUM: " + sum);		
		System.out.println("Result of MULTIPLY: " + mul);		
	}
}
