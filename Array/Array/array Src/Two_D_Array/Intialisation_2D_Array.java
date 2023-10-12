package Two_D_Array;

import java.util.Scanner;

public class Intialisation_2D_Array {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int [][]arr;
		int col=4;
		int row=3;
		arr=new int[row][col];//intialisation of 2D String
		//enter the element in 2d array
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enter the element at "+i+"pos"+j+"pos");
				 arr[i][j]=sc.nextInt();
				
			}
		}
		
		//display element
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(arr);//adress of outer array;[[I@6193b845
		System.out.println(arr[0]);//adress of inner array at position =0 [I@2e817b38
		System.out.println(arr[1]);
		System.out.println(arr[0].length);//length of inner array
		
		System.out.println(arr.length);//length of outer array
		
		
	}

}
