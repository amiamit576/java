package Array;

public class CopyElementsReverseorder {
	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50};
		int []b=new int[arr1.length];
		int j=0;
		System.out.print("element new array");
		for(int i =arr1.length-1;i>=0;i--)
		{
		
			b[j]=arr1[i];
			
			System.out.print(b[j]+" ");
			j++;
	}
		
		System.out.println("=============");
		System.out.print("the element old array");
		for(int i :arr1) {
			
			System.out.print(i+"  ");
		}
		
}}
