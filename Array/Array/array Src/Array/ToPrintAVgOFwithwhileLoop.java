package Array;

public class ToPrintAVgOFwithwhileLoop {

	public static void main(String[] args) {
		int []arr= {2,4,5,6,7,8,9};
		double result=avg1(arr);
		System.out.println(result);
	}
public static double avg1(int[]arr) {
	int sum = 0;
	int i=0;
	int l=arr.length;
	while (i<l) {
		sum=sum+arr[i];
		i++;
		
	}
	double avg=sum/l;
	return avg;
	
}
}
