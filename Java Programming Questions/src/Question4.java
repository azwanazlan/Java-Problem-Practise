import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		System.out.println("Please enter 10 integers");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i = 2;
		int small = 0;
		int large = 0;
		System.out.print("Num 1: ");
		int a = sc.nextInt();
		small = a;
		large = a;
		boolean isNOTRepetition = true;
		while(i <= 10) {
			System.out.print("Num " + i + ": ");
			int b = sc.nextInt();
			if (b < small) {
				 small = b;
			}

			else if (b > large) {
				 large = b;
			}
			else if (b == small || b == large) {
				System.out.println("Repetition is not allowed");
				isNOTRepetition = true;
				break;
			}
			i++;    
		}
		if (isNOTRepetition) {
			System.out.println("Smallest NUM is: " + small);
			System.out.println("Smallest NUM is: " + large);
		}
		else {
			System.out.println("Please repeat the process....");
		}

	}

}
