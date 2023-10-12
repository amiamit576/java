package string;

import java.util.Scanner;

public class MethodToCheckLastOccurance1 {

	public static void main(String[] args) {
		String s=createString();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character of whose last index you want");
		char c=sc.next().charAt(0);
		int index=lastindexOf(s, c);
		System.out.println(index);
		
			
	
		
	}
	
	public static String createString() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s =sc.nextLine();
		
		return s;
		
	}
	public static int lastindexOf(String s,char c) {
		int index=-1;
		for(int i=s.length()-1; i>=0;i--) {
			if(c==s.charAt(i)) {
				index=i;
				break;
	
			}
	}
		return index;

}}
