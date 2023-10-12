package Array;

public class TofindArrayLengthWithoutLengthCommand {

	public static void main(String[] args) {
		
		int []a= {10,20,10,30,10};
		int c=toFindLength(a);
		System.out.println(c);
		

	}
	


 	public static  int toFindLength(int[]a) {
 		int count=0;
 		for(int j:a) {
 			count++;
 			
 			
 		}
 		return count;
 	}
 	}
 	