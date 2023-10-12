package Array;

public class TofindminandmaxAtevenPoint {

	public static void main(String[] args) {
	int[] arr= {7,2,3,4,5,6,7,8,9,10,12,15};
		
		int l=arr.length;
		
		int small=arr[0];
		int max=arr[0];
		for(int i=1;i<l;i++)
		{
			  if(i%2==0) {
				if(arr[i]<small)
				{
					small=arr[i];
				}
			  }
			  
				  if(i%2==0) {
					  if(arr[i]>max)
					{
						max=arr[i];
					}
				  }
			  
				 
				 
			 
		}
		 System.out.println("The smallest number in array is :"+ small);
		 System.out.println("The max number in array is :"+ max);
		

	}

}
