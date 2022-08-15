package string;
import java.util.Scanner;
public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Name here:");
		String name=sc.nextLine();
	     //int value=name.length();
		//String lstring=name.toLowerCase();
		//String lstring=name.toLowerCase();
		//String lstring=name.substring(3);
		//String lstring=name.substring(2, 5);
		//String lstring=name.replace('g', 'n');
		//boolean lstring=name.startsWith("Jigna");
		  //boolean lstring=name.endsWith("na");
	     //char lstring1=name.charAt(2);

		//int lstring=name.indexOf("ig");
		//int lstring=name.indexOf("ig",'1');
		//int lstring1=name.lastIndexOf("g");
		//int lstring1=name.lastIndexOf("g", 2);
		//boolean lstring=name.equals("Jigna");
		boolean lstring=name.equalsIgnoreCase("jigna");
		
		//String nonTrimmedString="   Jigna      ";
		//System.out.println(nonTrimmedString);
		//String trimmedString=nonTrimmedString.trim();
		//System.out.println(trimmedString);
		
		
		//System.out.println(value);
		System.out.println(lstring);

	}

}
