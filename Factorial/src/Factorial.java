
public class Factorial {
	//Factorial using Recursion
			static int factorial(int n) {
				if(n==0) {
					return 1;
				}
				else
					return(n*factorial(n-1));
			}
	public static void main(String[] args) {
// TODO Auto-generated method stub
		//Simple Factorial
/*int i,fact=1;
int number=5;
for(i=1;i<=number;i++) {
fact=fact*i;
}
	System.out.println("Factorial of" +number+ "is:"+fact);
	}*/
		int i,fact=1;
		int number=6;
		fact=factorial(number);
		System.out.println("Factorial of"+number+"is"+fact);
		
		
		
}
}