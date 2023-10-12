package Array;

public class ToFindSumElementOfArray {

	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6,7,8,9,10,12,15};
		int sum = 0;
		int sum1=0;
		int l=arr.length;
		for(int i=0;i < l ;i++)
		{
			sum=sum+arr[i];
		
		}
		System.out.println("the sum element of array is:"+sum);
		System.out.println("=======================");
		//for each loop
		for(int s:arr)
			
		{
			sum1 =sum1+s;
			
			
		}
		System.out.println(sum1);
		
		
		

	}

}
