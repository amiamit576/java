package Array;
import java.util.Scanner;
public class CreateArrayWithUserInput {
	public static void main(String[] args) {
		
		int[] c=createArray(new int[5]);
		System.out.println("elements of array");
		for(int i:c)
		{
			System.out.print(i+" ");
		}
		
		
		
		
	
		

	}
	public static int[] createArray(int[]a) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		return a;
	}
	}
