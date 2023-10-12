package Array;

public class MethodToReturnSumOfevenElement {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6};
		int c=returnEvenelementsSum(a);
		System.out.println(c);
		
		

	}
	public static int returnEvenelementsSum(int[]a) {
		int sum =0;
		for(int j:a) {
			if(j%2==0) {
				sum=sum+j;
			}
		}
		return sum;
	}

}
