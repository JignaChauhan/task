package methods;
import java.util.Scanner;
public class method_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number:");
		double x=sc.nextDouble();
		System.out.println("Enter the Second number:");
		double y=sc.nextDouble();
		System.out.println("Enter the Third number:");
		double z=sc.nextDouble();
		System.out.println("The Average value is"+Average(x,y,z)+"\n");

	}

	private static double Average(double x, double y, double z) {
		// TODO Auto-generated method stub
		return (x+y+z)/3;
	}

}
