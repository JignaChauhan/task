public class Array_7 {

	private static final boolean flase = false;
	private static boolean isInArray;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]marks={5,8,9,5,7};
		int num=10;
		
		//boolean flase = false;
		boolean isInArray = flase;
		for(int element:marks) {
			if(num==element) {
				 isInArray = true;
				break;
			}
		}
if(isInArray) {
	System.out.println("The Value is present in array:");
}
	else {
		System.out.println("The Value is Not present in array:");
	}
}
	}


