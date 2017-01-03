public class Lab11_EX01
{
	public static void main(String[]args)
	{
		//filling the array
		int[][]num = new int [4][4];
		
		
		for(int i = 0; i < num.length; i++)
		{
			for (int j = 0; j < num[i].length; j++)
			{
				rand = (int)((Math.random()* 101));
				num[i][j] = rand;
				
			}
			
		}
		
		//print out the array
		for(int i = 0; i < num.length; i++)
		{
			for(int j = 0; j < num[i].length; j++)
			{
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
	
	}
}