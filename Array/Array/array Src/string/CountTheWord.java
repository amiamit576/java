package string;

import java.util.Scanner;

public class CountTheWord {

	public static void main(String[] args) {
		 String s = createString();
		 countWord(s);
	
	}
	public static String createString() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s1 =sc.nextLine();
		return s1;
	}
		public static int countWord(String s1) {
			int count=0;
			if (s1.length()<1) {
				System.out.println("String is empty");
			}
			else {
				count=1;
			for(int i=0;i<s1.length();i++) {
				
				
				if (s1.charAt(i)==32 && s1.charAt(i)!=32) {
					count++;
					System.out.println(count);
				}
				
			}

		}
			return count;
}}
	
	


