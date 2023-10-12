package string;

public class Stringispalledromornot {

	public static void main(String[] args) {
		String s1="iti";
		String	rev="";
		for(int i=0;i<s1.length();i++) {
			rev=s1.charAt(i)+rev;
			
		}
	if (s1.equals(rev)){
		System.out.println("then is pallerdromot");
			
		}
	else
		System.out.println("thenis not");
	
			
		

	}

}
