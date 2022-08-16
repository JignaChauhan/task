package conditionas;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
	     int num=sc.nextInt();
		int factorial=fact(num);
		System.out.println("Enter the Number:"+factorial);
}

	private static int fact(int num) {
		// TODO Auto-generated method stub
		int output;
		if(num==1) {
			return 1;
		}
		output=fact(num-1)*num;
		return output;
	}

}
