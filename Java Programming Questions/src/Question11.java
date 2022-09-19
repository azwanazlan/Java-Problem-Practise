import java.util.Scanner;

public class Question11 {

	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your NUM: ");
		int num = sc.nextInt();
		int large = 0;
		for(int i=2; i<=num ; i++) {
			
			if( i%2 != 0 ) {
				System.out.print(i + " ");
				
				if (i > large) {
					large = i;
				}
			} 
			
			}
		System.out.println();
		System.out.println("The largest prime number is: " + large);
		}
	}


