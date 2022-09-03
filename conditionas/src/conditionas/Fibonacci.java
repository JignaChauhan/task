package conditionas;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20,t1=0,t2=1;
		System.out.println("upto"+n+":");
		if(t2<=n) {
			int sum=t1+t2;
			t1=t2;
			t2=sum;
		System.out.println(sum +"");
				
		}

	}

}
