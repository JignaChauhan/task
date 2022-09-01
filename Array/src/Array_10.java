public class Array_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {12,14,16,78,52,45,78,1200,-2100};
int max=Integer.MIN_VALUE;
for(int e:arr) {
	if(e>max) {
		max=e;
	}
}
System.out.println("The value of the maximum element in this arrys is:"+max);
System.out.println(Integer.MIN_VALUE);
System.out.println(Integer.MAX_VALUE);
	}

}
