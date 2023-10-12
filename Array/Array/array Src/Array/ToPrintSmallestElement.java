package Array;

public class ToPrintSmallestElement {
	
	public static void main(String[] args) {
		int[] arr= {7,9,3,4,5,6,7,8,9,10,12,15};
		
		int l=arr.length;
		
		int small=arr[0];
		for(int i=1;i<l;i++)
		{
			  
				if(arr[i]<small)
				{
					small=arr[i];
				}
				 
				 
			 
		}
		 System.out.println("The smallest number in array is :"+ small);
		
		
	}

}
