import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your NUM: ");
		int a = sc.nextInt();
		int digits = 1;
		int results = 0;
		results = a;
		do {
			results = results / 10 ;
			if(results != 0 ) {
				digits++;
			} else {
				break;
			}
		}
		
		while(results<=a);
		System.out.println(digits);
	}

}
