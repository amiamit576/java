package Array2;

public class Assending_and_DESC_of_Char_Array {

	public static void main(String[] args) {
		char[]arr= {'c','b','a','d','g','f'};
		for(char j:arr) {
			System.out.print(j+" ");}
		System.out.println("\n"+"Descending array");
		Descending(arr);
		for(char j:arr) {
			System.out.print(j+" ");}
		System.out.println("\n"+"asscending order");
		Asscending(arr);
		for(char j:arr) {
			System.out.print(j+" ");}
		
		

		
		

	}
public  static char[] Descending(char[]arr) {
		
		char great=0;
		boolean issort=true;
		for(int j=0;j<arr.length-1;j++) 
	{
		for(int i=0;i<arr.length-1-j;i++)//(the j here reduce the alliteration,by not checking element which shorted) 
			{
			if(arr[i]<arr[i+1]) {
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
public  static char[] Asscending(char[]arr) {
	
	char great=0;
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

}
