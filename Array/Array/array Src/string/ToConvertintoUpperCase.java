package string;

import java.util.Scanner;

public class ToConvertintoUpperCase {

	public static void main(String[] args) {
		String s = createString();
		createIntoUppercase(s);
	

	}
	public static String createString() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s1 =sc.nextLine();
		return s1;
	}
	public static void createIntoUppercase(String s1) {
		String newString = "";
		
		for(int i=0;i<s1.length();i++) {
			char j=s1.charAt(i);
			
			if ((j>='a' && j<='z')||(j>='A' && j<='Z')) {
				if(j>='a' && j<='z') {
					 j=(char) (j-32);
					
				}
				
			}
			newString += j;
	}
		System.out.println(newString);
		
}}


