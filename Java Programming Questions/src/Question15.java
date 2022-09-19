import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		int [] myArray = {2,3,4,4,5,6,7,8,9};
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input a num: ");
		int a = sc.nextInt();
		for(int i = 0; i<myArray.length; i++) {
			if(a == myArray[i]) {
				System.out.print(i + " ");
			}
		}
	}

}
