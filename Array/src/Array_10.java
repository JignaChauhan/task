public class Array_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {12,14,16,78,52,45,78};
int max=0;
for(int e:arr) {
	if(e>max) {
		max=e;
	}
}
System.out.println("The value of the maximum element in this arrys is:"+max);
	}

}
