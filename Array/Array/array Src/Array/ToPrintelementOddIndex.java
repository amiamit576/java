package Array;

public class ToPrintelementOddIndex {

	public static void main(String[] args) {int[] arr= {1,2,3,4,5,6,7,8,9,10,12,15};
	int sum = 0;
	int sum1=0;
	int l=arr.length;
	for(int i=0;i < l ;i++)
	{
		if (i%2==0)
		{
			System.out.println("the even index element:"+arr[i]+"");
		}
		else {
			System.out.println("the odd index element:"+arr[i]+"");
		}
		
	}
	

		

	}

}
