import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double first;
		double second;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number:");
		first=sc.nextDouble();
		second=sc.nextDouble();
		System.out.println("Enter the Operator(+,-,*,/,%):");
		char operator=sc.next().charAt(0);
		double result;
		switch(operator) {
		case '+':
			result=first+second;
			break;
		case '-':
			result=first-second;
			break;
		case '*':
			result=first*second;
			break;
		case '/':
			result=first/second;
			break;
		case '%':
			result=first%second;
			break;
		default :
			System.out.println("Error! operator is not allowed" );
			return;
		}
		System.out.printf("%.1f %c %.1f =%.1f",first,operator,second,result);
		}

	}


