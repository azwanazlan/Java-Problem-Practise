
public class Question6 {

	public static void main(String[] args) {
		int odd = 1, multiply = 1;
		for(int i = 1; i <= odd; i++) {
			odd = odd + 2;
			if(odd < 20) {
				multiply = multiply * odd;
				System.out.print(odd);
				System.out.print(" " + multiply);
				System.out.println();
			}
			
			else if(odd >= 20 ) {
				break;
			}
			i++;
		}
			System.out.println("Result is: " + multiply);
	}

}
