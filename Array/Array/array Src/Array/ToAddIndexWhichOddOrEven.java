package Array;

public class ToAddIndexWhichOddOrEven {	public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7,8,9,10,12,15};
	int sum = 0;
	int sum1=0;
	int l=arr.length;
	for(int i=0;i < l ;i++)
	{
		if (i%2==0)
		{
			sum=sum+arr[i];
		}
		else {
			sum1=sum1+arr[i];
		}
	}
	System.out.println("the sum of even:"+sum);
	System.out.println("The sum of odd:"+sum1);

}
}
