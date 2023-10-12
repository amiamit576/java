package string;

import java.util.Scanner;

public class StringAreAnaGramOrNot {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String S1:");
			String s1=sc.nextLine();
			System.out.println("Enter the String S2:");
			String s2=sc.nextLine();
			if(s1.length()!=s2.length()) {
				System.out.println("this is not Anagram");
				
			}
			else {
				 char [] c1=sortArray(s1.toCharArray());
				 char [] c2=sortArray(s2.toCharArray());
				 int temp=0;
				 for(int i =0;i<c1.length;i++) {
					 	if(c1[i]!=c2[i]) {
					 		temp++;
					 	}
				 }
				if(temp==0) {
					System.out.println("The String Is Anagram");
					
				}
				else {
					System.out.println("This is not  Anagram");
				}
				 
					
			}
		

	}
	
	private static Object temp(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void createIntolowercase(String s) {
		String newString = "";
		
		for(int i=0;i<s.length();i++) {
			char j=s.charAt(i);
			
			if ((j>='a' && j<='z')||(j>='A' && j<='Z')) {
				if(j>='A' && j<='Z') {
					 j=(char) (j+32);
					
				}
				
			}
			newString += j;
	}
		
		
		
		
	}
	public  static char[] sortArray(char [] arr) {
		
		char great=' ';
		boolean issort=true;
		for(int j=0;j<arr.length-1;j++) 
		{
		for(int i=0;i<arr.length-1-j;i++)//(the j here reduce the alliteration,by not checking element which shorted) 
			{
			if(arr[i]>arr[i+1]) {
				great=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=great;
				issort=true;
			}
			if(issort==false) {
				break;
			}
			
			

}
		}
		return arr;
	}
}
