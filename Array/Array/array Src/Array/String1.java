package Array;

import java.util.Scanner;

public class String1 {
	public static void main(String[] args) 
	{
	
	

		
		Scanner sc= new Scanner(System.in);
		
		
		String[] a =new String[10];
		
		
		
		
		for(int i=0 ; i<a.length; i++)
		{
			System.out.println("enter the value");
			 
			a[i] = sc.nextLine();
			
			
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		
	}

}
}
