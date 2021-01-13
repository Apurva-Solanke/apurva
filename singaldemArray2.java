package array;

public class singaldemArray2 {

	public static void main(String[] args) {
		
		//declaration and instantiation
		
		double arr2[] = new double[6];
		
		//initialization
		arr2[0] =2.3;
		arr2[0] =4.5;
		arr2[0] =6.5;
		arr2[0] =5.4;
		arr2[0] =5.6;
		arr2[0] =8.9;
		
		//usage
		System.out.println("total index="+arr2.length);
		System.out.println(arr2[3]);
		
		System.out.println("--------------------------------");
		
		System.out.println("while loop:");
		
		int index=0;
		
		while(index <=5)
		{
			System.out.println(arr2[index]);
	        
			
			index++;
			
			
			
		}
		System.out.println("----------------------------");
		
		index =0;
		
		while(index <= arr2.length)
		{
			System.out.println(arr2[index]);
			index++;
			
		}
		
		System.out.println("-------------------------------");
		
		index =0;
		
		do {
			
			System.out.println(arr2[index]);
			
			index++;
			
		}
		while(index <= 5);
		
			System.out.println("-----------------------");
		
			index =0;
			
			do
			{
				System.out.println(arr2[index]);
				index++;
			}
			while(index <= arr2.length);
			
			System.out.println("----------------------------");
		
			System.out.println("for loop:");
			
			for(index=0; index<=5;index++)
			{
				System.out.println(arr2[index]);
			}
			System.out.println("-------------------------");
			
			for(index=0; index<=arr2.length;index++)
			{
				System.out.println(arr2[index]);
			}
			
			System.out.println("-----------------------------");
			
			for(index=0; index<=arr2.length-1; index++)
			{
				System.out.println(arr2[index]);
				
			}
	}
}
