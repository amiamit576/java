package string;

import java.util.Scanner;

public class createA_Method_ToCheck_Charis_Alphabet {

	public static void main(String[] args) {
		String s= createString() ;
		checkAlpha(s);
	

	}
	public static void checkAlpha(String s1) {
		for(int i=0;i<s1.length();i++) {
			char j=s1.charAt(i);
			if ((j>='a' && j<='z')||(j>='A' && j<='Z'))
			{System.out.println("this is alphabet");}
			else {System.out.println("this is not ");}
		}
	}
			public static String createString() {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the string: ");
				String s1 =sc.nextLine();
				return s1;
			}
}
