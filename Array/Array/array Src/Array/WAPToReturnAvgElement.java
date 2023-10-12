package Array;

public class WAPToReturnAvgElement {

	public static void main(String[] args) {
		int []arr= {2,4,5,6,7,8,9};
		avg(arr);
		
		

	}
	public static void avg(int[]arr) {
		int sum = 0;
	
		int l=arr.length;
		
		for(int i=0;i < l ;i++)
		{
			sum=sum+arr[i];
		
		}
		double avg1=sum/l;
		System.out.println(avg1);
		
		
	}
	

}
