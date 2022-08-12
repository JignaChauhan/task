import java.util.Scanner;
public class Area {
public void area() {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Value Circel:");
    System.out.println("Enter the Value Square:");
    System.out.println("Enter the Value Rectangle:");
    System.out.println("Enter your Choice:");
   char choice=sc.next().charAt(0);
   switch(choice) {
   case 'a':
	   System.out.println("Enter the redius of Circle:");
	   double r=sc.nextDouble();
	   double ca=(22/7.0)*r*r;
	   System.out.println("Area of Circle:"+ca);
	   break;
   case 'b':
	   System.out.println("Enter the redius of Square:");
	   double n=sc.nextDouble();
	   double s=n*n;
	   System.out.println("Area of Square:"+s);
	   break;
   case 'c':
	   System.out.println("Enter lenght of Rectangle:");
	   double j=sc.nextDouble();
	   System.out.println("Enter the breath of Rectangle:");
	   double b=sc.nextDouble();
	   double ra=j*b;
	   System.out.println("Area of Rectangle:"+ra);
	   break;
	   default:
		   System.out.println("Enter the Wronge Choice!!");
   }   
   }
}
	