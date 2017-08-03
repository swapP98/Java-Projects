import java.util.Scanner;
public class gioco_quindici
{
	public static void main(String[]args)
	{
    	Scanner input=new Scanner(System.in);
    	System.out.println("GIOCO DEL QUINDICI");
    	System.out.println();
 	  	int[][]a=new int[][]{{15, 6,  4,  9},
    							  {  1, 0, 13, 11},
   							  {  3, 5, 14,  7},
    							  {  2, 8, 10, 12}};

  /*	 	int[][]a=new int[][]{{1, 2, 3, 4},
    							  {5, 6, 7, 8},
   							  {9, 10, 11, 12},
    							  {13, 14, 15, 0}};*/

		int r=4;
		int c=4;
		boolean ordinato=false;
		for (int i=0; i<r; i++)
		{
			for (int j=0; j<c; j++)
				System.out.print(a[i][j]+" ");

			System.out.println();
    	}
		System.out.println();
    	System.out.println("Che numero vuoi cercare? ");
    	int n=input.nextInt();
		System.out.println();
		int i;
		int j;
		while (ordinato==false)
		{
			for (i=0; i<r; i++)
			{
				for (j=0; j<c; j++)
				{
					if (n==a[i][j])
					{
						if (i<3)
						if (a[i+1][j]==0)
						{	a[i+1][j]=n;
							a[i][j]=0;}
						else
						{
							if (a[3][j]==0)
							{	a[3][j]=n;
								a[i][j]=0;}
						}

						if (i>0)
						if (a[i-1][j]==0)
						{	a[i-1][j]=n;
							a[i][j]=0;}
						else
						{
							if (a[0][j]==0)
							{	a[0][j]=n;
								a[i][j]=0;}
						}

						if (j<3)
						if (a[i][j+1]==0)
						{	a[i][j+1]=n;
							a[i][j]=0;}
						else
						if (a[i][3]==0)
						{	a[i][3]=n;
							a[i][j]=0;}

						if (j>0)
						if (a[i][j-1]==0)
						{a[i][j-1]=n;
						 a[i][j]=0;}
						 else
						 {
						 	if (a[i][0]==0)
							{a[i][0]=n;
						 	a[i][j]=0;}
						 }

						for (int b=0; b<r; b++)
						{
							for (int d=0; d<c; d++)
							System.out.print(a[b][d]+" ");

						System.out.println();
	    				}
	    				i=0;
						j=0;
	    				for (int b=0; b<r; b++)
						{
							for (int d=0; d<c; d++)
							if (a[i][j]<a[b][d])
									ordinato=true;
	    				}
	    				if (ordinato==true)
	    					System.out.println("Hai vinto ");
	    				else
	    				{
						System.out.println();
	    				System.out.println("Che numero vuoi cercare? ");
	    				n=input.nextInt();
	    				System.out.println();
	    				}

				//	System.out.print(a[i][j]+" ");

					}

				}
			}
		}
	}
}

