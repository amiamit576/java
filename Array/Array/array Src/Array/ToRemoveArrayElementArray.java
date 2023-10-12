package Array;

public class ToRemoveArrayElementArray {
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6};
		int[]a=new int[arr.length-1];
		int index=4;
		
		for(int i=0;i<a.length;i++) {
			if (i<index) {
				a[i]=arr[i];
				
			}
			else if(i>=index) {
				a[i]=arr[i+1];
				
			}
		}
		System.out.println("this new array");
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}
