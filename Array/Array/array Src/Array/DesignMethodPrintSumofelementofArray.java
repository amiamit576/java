package Array;

public class DesignMethodPrintSumofelementofArray {
	public static void main(String[] args) {
		int [ ] arr= {20,30,40,50};
		sum(arr);
		System.out.println("End of Program");
		
		
	}
	
	
	public static void sum(int[] arr) {
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("the sum element:"+sum);
	}
	

}
