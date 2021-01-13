package array;

public class twodimArray {
	public static void main(String[] args) {
		
		int arr3[][]= {
				
				{0,4,0},
				{5,0,6},
				{1,0,2},
				{0,3,0},
				};
				
		for(int row=0; row <=arr3.length;row++)
		{
			for(int column=0;column<=arr3[row].length; column++)
			{
				System.out.print(arr3[row][column]+"  ");
			}
			
			System.out.println();
		}
		
	}

}
