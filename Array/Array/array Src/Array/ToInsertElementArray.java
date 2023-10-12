package Array;

public class ToInsertElementArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int a[]=new int [arr.length+1];
		int b=67;
		int n=4;
		
		for(int i=0;i<a.length;i++) {
		for (int j=0;j<arr.length;j++) {
			
			if (i<n) {	
				a[i]=arr[i];
				
			}
			else if (i==n) {
				a[i]=b;
			}
			else if(i>n) {
				a[i]=arr[i-1];
				
			}
		
		}

		
		
		System.out.print(a[i]+" ");
		
		
		
		
	
		
	}

}}
