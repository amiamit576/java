package Array;

public class ReturnOccuranceFirstElement {

	public static void main(String[] args) {
		int []a= {10,20,10,30,10};
		int c=returnIndex(a,10);
		System.out.println(c);
		

	}
	public static int returnIndex(int[]a,int n) {
		int index=-1;
		for(int i=0;i<a.length;i++) {
			if(n==a[i]) {	 
			index=i;
			break;
			}
	
		}
		return index;
		
		
	}
}
