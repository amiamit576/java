package string;

import java.util.Scanner;

public class StringContainingAlphbetonly {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		for(int i=0;i<s1.length();i++) {
			char j=s1.charAt(i);
			if ((j>='a' && j<='z')||(j>='A' && j<='Z')) {System.out.println("this is alphabet");}
			else {System.out.println("this is not ");
				
			}
			}	 	 
	}
}
	
