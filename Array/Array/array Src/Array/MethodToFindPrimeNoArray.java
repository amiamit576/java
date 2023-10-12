package Array;

public class MethodToFindPrimeNoArray {
	
	static int [] arr= {2,9,8,61,25,6};
	public static void main(String[] args) {
		
		prime(arr);
		System.out.println("End of program");
		
		

	}

	public static void prime(int arr[]) {
		
		for (int j:arr) 
		{
			int count =0;
			
			for (int i=2;i<=j/2;i++)
			{
				
				if (j%i==0)
				{
					count++;
				}
				
			}
			if (count==0) {
				System.out.println(j);
			}
		}
		
	}
}
				
		
			  
	


