package Array;

public class PrintOddElementByMethod {

	public static void main(String[] args) {
		int []arr= {2,4,5,6,7,8,9};
		odd(arr);
		System.out.println("the program end now");
		
	}
	public static void odd(int[]arr) {
		for (int j:arr) {
			if (j%2!=0) {
				System.out.println(j);
				
			}
		}
	}

}
