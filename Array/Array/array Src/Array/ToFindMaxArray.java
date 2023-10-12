package Array;

public class ToFindMaxArray {

	public static void main(String[] args) {
	int[] arr= {7,2,3,4,5,6,7,8,9,10,12,15};
		
		int l=arr.length;
		
		int max=arr[0];
		for(int i=1;i<l;i++)
		{
			  
				if(arr[i]>max)
				{
					max=arr[i];
				}
				 
				 
			 
		}
		 System.out.println("The max number in array is :"+ max);
		
	}

}
