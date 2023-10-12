package string;

import java.util.Scanner;

public class ConvertIntoLowerCaseByArrayMethod {

	public static void main(String[] args) {
		String z = createString();
		System.out.println(lowerCase(z));
		
		

	}
	public static String createString() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s1 =sc.nextLine();
		return s1;
	}
	public static String lowerCase(String s1) {
		char[]arr=s1.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>='A' && arr[i]<='Z') {
				arr[i]=(char) (arr[i]+32);
			}
		}
		String s=new String(arr);
		return s;
	}

}
