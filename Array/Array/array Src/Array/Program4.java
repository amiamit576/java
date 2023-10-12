package Array;

public class Program4 {
	public static void main(String[] args) {
		//creating array container
		int [] id= new int[4];
		// inserting data 
		id[0]=101;
		id[1]=102;
		id[3]=103;
		id[2]=105;
		//id[5]=106,runtime error
		//access data
		for(int i=0;i<id.length;i++)
		{
			System.out.println(id[i]);
		}
		System.out.println("=================");
		for (int element:id) {
			System.out.println(element);
		}
		
		
		String [] names= {"java","Python","php","r","Ml"};
		
			System.out.println(names[2]);
			System.out.println(names[4]);
			System.out.println("=========");
		for (int i =0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		System.out.println("*************");
		for (String s:names)
		{
			System.out.println(s);
		}
		
		
	}

}
