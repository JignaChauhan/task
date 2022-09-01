public class Array_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,21,3,4,5,34,67,78};
		int l=arr.length;
		int n=Math.floorDiv(l, 2);
		int temp;
		for(int i=0;i<n;i++) {
			temp=arr[i];
			arr[i]=arr[l-i-1];
			arr[l-i-1]=temp;
		}
		for(int element:arr) {
			System.out.println(element+"");
		}

	}

}
