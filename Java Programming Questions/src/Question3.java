import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

	    @SuppressWarnings("resource")
		Scanner square = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Height is: "); // Output user input
	    int height = square.nextInt();  // Read user input
	    System.out.print("Width is: ");
	    int width = square.nextInt();  // Read user input
	      // Output user input
	    if(height <=0 || width <=0) {
	    	System.out.println("Input cant be zero!!");
	    }
	    else {
	    	 for(int i = height; i>=1; i--) {     //iterate height
	    		 for(int j = width; j>1; j--) {   // iterate width inside height
	    			 System.out.print("B");
	    		 }
	    		 System.out.println("B");
	    	 }
	    }
 
	  }
	}
	


