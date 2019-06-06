package ab;

/*
 		*
 	 *  *  *
  *  *  *  *  *
     *  *  *
 	    *   
 */

public class star1 {

	public static void main(String[] args) {
		
		int mid=3;
		
		for(int i=1;i<=3;i++)
		{
			if(i<=mid)
			{
			for(int k=1;k<=3-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			}
			else
			{
				System.out.println("Checkinggggggggggg.........................");
			}
			System.out.println();
		}
	}

}
