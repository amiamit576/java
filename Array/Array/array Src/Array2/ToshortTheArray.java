package Array2;

public class ToshortTheArray {

	public static void main(String[] args) {
		int arr[]= {2,3,7,8,9,0};
		int great=0;
		System.out.println("array is before shorted");
		for(int k:arr) {
			System.out.print(k+" ");
		}
		
		for(int j=0;j<arr.length-1;j++)//here j to run iteration
		{
			for(int i=0;i<arr.length-1-j;i++)//(the j here reduce the alliteration,by not checking element which shorted) 
				{
				if(arr[i]>arr[i+1]) {
					great=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=great;
				}
					
					
					
				}
				
			}
		System.out.println();
		System.out.println("afterarray shorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		
	}

}
