package string;

import java.util.Scanner;

public class MethodforCountVowelConsonant {

	public static void main(String[] args) {
		CountVowelConsonant();
		
	

	}
	public static void CountVowelConsonant() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		int vowel=0;
		int constt=0;
		int num=0;
		int space=0;
		int spchar=0;
		
		for(int i=0;i<s1.length();i++) {
			char j=s1.charAt(i);
			if ((j>='a' && j<='z')||(j>='A' && j<='Z')) {
				if (j=='a'||j=='A'||j=='e'||j=='E'||j=='i'||j=='I'||j=='o'||j=='O'||j=='u'||j=='U') {
					vowel++;
				}
				else {
					constt++;
					
				}
				
			}
			
			else if(j>='0' && j<='9') {
				num++;
			}
			else if (j==' ') {
				space++;
			}
			else {
				spchar++;
			}
				
		}
		System.out.println(vowel);
		System.out.println(constt);
		System.out.println(num);
		System.out.println(space);
		System.out.println(spchar);
		

	}



	}


