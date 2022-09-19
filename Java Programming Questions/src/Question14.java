//important
public class Question14 {

	public static void main(String[] args) {
		int [] arr = {5,50,34,1,6,56,82,43,101};
		int small = arr[0] , large = arr[0];
		int s_small = 0 , s_large = 0;
		
		for(int i=1; i < arr.length; i++) {
			if(arr[i] < small ) {// if (101 < 82)     if (56 < 82)
				s_small = small; //  not run          s_small = 82
				small = arr[i];	//                    small = 56
			}
			if(arr[i] > large) {
				s_large = large;
				large = arr [i];
			}
		}
		
		System.out.println(s_small + "  " + s_large);
	}

}
