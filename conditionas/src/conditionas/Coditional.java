package conditionas;
import java.util.Scanner;
public class Coditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    byte n1,n2,n3;
    System.out.println("Enter Your marks in Java:");
    n1=sc.nextByte();
    System.out.println("Enter Your marks in python:");
    n2=sc.nextByte();
    System.out.println("Enter Your marks in Php:");
    n3=sc.nextByte();
    float avg=(n1+n2+n3)/3.0f;
    System.out.println("Your Overall Percentage is:"+avg);
    if(avg>=40 && n1>=33 && n2>=33 && n3>=33) {
    	System.out.println("Congratulation ,You have a Pass:");
    }
    else {
    	System.out.println("Sorry ,You have a Fail:");
    }
	}

}
