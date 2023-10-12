package Array2;

public class AscendANDDesendStringArrray {

	public static void main(String[] args) {
		String [] arr= {"ram","Shyam","aam"};
		Descending(arr);
		for(String j:arr) {
			System.out.println(j+" ");
		}

	}
public  static String[] Descending(String[]arr) {
		
		String great=" ";
		boolean issort=true;
		for(int j=0;j<arr.length-1;j++) 
	{
		for(int i=0;i<arr.length-1-j;i++)//(the j here reduce the alliteration,by not checking element which shorted) 
			{
			//if(arr[i]<arr[i+1])
			if(arr[1].compareToIgnoreCase(arr[i+1])<0){
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
public  static String[] Asscending(String[]arr) {
	
	String great=" ";
	boolean issort=true;
	for(int j=0;j<arr.length-1;j++) 
{
	for(int i=0;i<arr.length-1-j;i++)//(the j here reduce the alliteration,by not checking element which shorted) 
		{
		//if(arr[i]>arr[i+1])
		if(arr[1].compareToIgnoreCase(arr[i+1])>0){
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
