package Array;
import java.util.Scanner;
public class MethodToinsertElementinArray {

	public static void main(String[] args) {
		{int[]c=createArray();
		System.out.println("Array created");
		for(int j=0;j<c.length;j++) {
			System.out.print(c[j]+" ");
		}
		
		System.out.println("===================");
		
		int[]e=insertElement(c);
		System.out.println("new array");
		for(int j=0;j<e.length;j++) {
			System.out.print( e[j]+" ");
		}
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
	
	public static int[] insertElement(int [] arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:");
		int b=sc.nextInt();
		System.out.println("enter the index");
		int n=sc.nextInt();
		int []a=new int[arr.length+1];
		for(int i=0, j=0;i<a.length; i++,j++) {
			 
				
				if (i<n) {	
					a[j]=arr[j];
					
				}
				else if (i==n) {
					a[j]=b;
				}
				else if(i>n) {
					a[j]=arr[j-1];
					
				}
			}
		return a;
		}
		}

