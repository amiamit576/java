package Array;

public class DesignMethodReturnAvgprimeno {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,9,11};
		double c=	returnAvgOfPrimeNo(a);
		System.out.println(c);
		
	}
	public static double returnAvgOfPrimeNo(int[]a) {
		int sum=0;
		int d=0;
		
		double avg = 0;
		for(int j:a) {
			int count=0;
			for (int i=2;i<=j/2;i++)
			{
				if (j%i==0)
				{
					count++;
				}
			}
			if (count==0) {
				System.out.println(j);
				
				d++;
				sum=sum+j;
					}
		
					}
		
		avg=sum/d;	
		return avg;
		}
	}
	
		
		
	