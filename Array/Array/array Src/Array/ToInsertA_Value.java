package Array;


public class ToInsertA_Value {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7};
		int[]b= new int[a.length+1];
		int c=45;
		int x=3;
		int i=0;
		int j=0;
		for (;i<x-1;i++) {
			a[i]=b[i];}
		
		b[x]=c;
		for ( i=x+1;i<b.length;i++){for(j=x;j<a.length;j++) {
			b[i]=a[j];
		
			
		}
		}
		System.out.println(a[i]);
		System.out.println("=====================================");
		System.out.println(b[j]);
		
		}
	}


