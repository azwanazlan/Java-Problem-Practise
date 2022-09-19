import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter NUM: ");
		int a = sc.nextInt();
		boolean isPrime = true;
		for(int i = 2; i < a/2; i++) {
			if(a % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}
}
