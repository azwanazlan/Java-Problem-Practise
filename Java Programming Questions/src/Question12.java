import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		System.out.print("How many prime numbers you want to print: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int prime = 0 , sum = 0;
		if(num > 0 ) {
			for(int i = 2; prime!=num ;i++) {
				if (i % 2 != 0) {
					System.out.print(" " + i);
					prime++;
					sum = sum + i; 
				}
			}
			System.out.println();
			System.out.println("Total number of prime number is: " + sum);
		}
	}
}
		
		
		
	
		