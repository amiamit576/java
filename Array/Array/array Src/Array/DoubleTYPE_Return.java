package Array;

import java.util.Scanner;

public class DoubleTYPE_Return {

	public static void main(String[] args) {
		double[] a=createArray(new double[5]);
		System.out.println("elements of array");
		for(double i:a)
		{
			System.out.print(i+" ");
		}
		

	}
	public static double[] createArray(double[]a) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextDouble();
			
		}
		return a;
	}

}
