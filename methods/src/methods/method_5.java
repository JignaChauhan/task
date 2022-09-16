package methods;

public class method_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to Java Language:::";
		int count=1;
		for(int i=0;i<str.length()-1;i++) {
			if((str.charAt(i)=='')&&(str.charAt(i+1)!=''))
			{
				count++;}
		}
		System.out.println("Number of Words in a String:"+count);
			}

}
