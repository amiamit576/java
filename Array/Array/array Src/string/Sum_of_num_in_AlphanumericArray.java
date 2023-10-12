package string;

import java.util.Scanner;

public class Sum_of_num_in_AlphanumericArray {

	public static void main(String[] args) {
		 String s = createString();
		 sumOfNum( s);
		 
		

	}
	public static String createString() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s1 =sc.nextLine();
		return s1;
	}
	public static int sumOfNum(String s1) {
		int sum=0;
		for(int i=0;i<s1.length();i++) {
			char j=s1.charAt(i);
			if (j>='0' &&j<='9') {
				sum=sum+(j-48);
			}
		}
		System.out.println(sum);
		return sum;
	}

}
