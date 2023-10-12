package Array2;

import java.util.Scanner;

public class MethodSortArray {

	public static void main(String[] args) {
		int[]c=createArray();
		System.out.println("old array");
		for(int i:c) {
			System.out.print(i+" ");
		}
		
		int[] d=sortArray(c);
		System.out.println("sorted Array");
		for(int i:d) {
			System.out.print(i+" ");
		}
		

	}
	public static int[] createArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array:");
		int c =sc.nextInt();
		int []arr=new int[c];
		System.out.println("enter the element of array");
		for(int i=0;i<c;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
		}
	public  static int[] sortArray(int [] arr) {
		
		int great=0;
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