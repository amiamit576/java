package string;

public class ShortingCharTypeArrayAndStringArray {

	public static void main(String[] args) {
		char[]arr= {'c','b','a','d','g','f'};
		System.out.println("old array is");
		for(char j:arr) {
			System.out.print(j+" ");
		}
		//sort the array
		System.out.println("\n"+"new array is ");
		sortArray(arr);
		for(char j:arr) {
			System.out.print(j+" ");
		}
		System.out.println("\n"+"======================");
		String [] arr1= {"ram","shayam","red"};
		System.out.println("the old array is ");
		for(String j:arr1) {
			System.out.print(j+" ");
			
		}
		System.out.println("==================");
		//sorted String Array
		System.out.println('\n'+"Sorted String Array");
		sortArray(arr1);
		for(String j:arr1) {
			System.out.print(j+" ");
			
		}
		
		

	}
	public  static char[] sortArray(char [] arr) {
		
		char great=' ';
		boolean issort=true;
		for(int j=0;j<arr.length-1;j++) 
		{
		for(int i=0;i<arr.length-1-j;i++)//(the j here reduce the alliteration,by not checking element which shorted) 
			{
			if(arr[i]>arr[i+1]) {
				great=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=great;
				issort=true;
			}
			if(issort==false) {
				break;
			}
			
			

}
		}
		return arr;
	}
public  static String[] sortArray(String [] arr1) {
		
		String great=" ";
		boolean issort=true;
		for(int j=0;j<arr1.length-1;j++) 
		{
		for(int i=0;i<arr1.length-1-j;i++)//(the j here reduce the alliteration,by not checking element which shorted) 
			{
		//	if(arr1[i]>arr1[i+1]) {
			if(arr1[1].compareToIgnoreCase(arr1[i+1])>0) {
				great=arr1[i];
				arr1[i]=arr1[i+1];
				arr1[i+1]=great;
				issort=true;
			}
			if(issort==false) {
				break;
			}
			
			

}
		}
		return arr1;
}
	
}

