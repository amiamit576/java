package Array;
import java.util.Scanner;

public class ToCheckElementPresentinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The element is :");
		int b=sc.nextInt();
		
		
		
		int count=0;
		int[]a= {10,90,45,85,76};
		for (int i=0;i<a.length;i++) {
			if (b==a[i]) {
				count++;
			}
			
			
				
		}
		if (count>0) {
			System.out.println("element is present");
		}
		else
			System.out.println("element is not present");
		

	
	}

}
