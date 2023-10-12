package Array;

public class ToCopyArrayValuefromOneArr {

	public static void main(String[] args) {
		int [ ]arr= {10,20,30,40,50};
		System.out.println("Elemments of array");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		int [] b=new int[arr.length];
		System.out.println("============");
		System.out.println("elements of new array");
		for (int i=0;i<arr.length;i++) {
			b[i]=arr[i];
			System.out.print(b[i]+" ");
			
			
		}
		

	}

}
