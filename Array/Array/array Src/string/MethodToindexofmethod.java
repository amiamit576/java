package string;

import java.util.Scanner;

public class MethodToindexofmethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	String s=userString();
	System.out.println("enter the character of whose first index you want");
	char c=sc.next().charAt(0);
	int index=indexOf(s,c);
	System.out.println(index);
	}


public static String userString() {
	Scanner sc=new Scanner(System.in);
	String s=new String();
	System.out.println("enter string ");

		s=sc.nextLine();
	return s;
}
public static int indexOf(String s, char c) {
	int index=-1;
	for (int i=0; i<s.length();i++) {
		if(c==s.charAt(i)){
			index=i;
			break;
		}
	}
	return index;
}




	

	

}
