package Array2;
import java.util.Scanner;
public class MethodArrayToRemoveElement {

	public static void main(String[] args) {
		int[]c=createArray();
		System.out.println("Array created");
		for(int j=0;j<c.length;j++) {
			System.out.print(c[j]+" ");
		}
		
		System.out.println("===================");
		
		int[]e=removeElement(c);
		System.out.println("new array");
		for(int j=0;j<e.length;j++) {
			System.out.print( e[j]+" ");
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
		return arr;}


public static int[] removeElement(int [] arr) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the index");
	int n=sc.nextInt();
	int []a=new int[arr.length-1];
	for(int i=0;i<a.length; i++) {
		 
			
		if (i<n) {
			a[i]=arr[i];
			
		}
		else if(i>=n) {
			a[i]=arr[i+1];
			
		}
		}
	return a;
	}
	}
