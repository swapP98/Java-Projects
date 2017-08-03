//Ventura-Giorgio
//4-03-2015
//Gioco Quindici
import java.util.Scanner;
public class GiocoQuindici
{
	static int i = 0;
	static int j = 0;

	static int ricercan(int n)
	{


	}

	public static void main(String[]args)														//Parte programma per impostazione tabella)

	{

		Scanner input  =new Scanner(System.in);
		int [][]a=new int[][]{{15,8,3,14},{0,2,7,1},{5,12,6,4},{9,13,11,10}};
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.printf("%4d",a[i][j]);
				}
					System.out.println();
			}
	//test=false;
	for(int i=0;i<a.length;i++)
		for (int j=0;j<a[i].length;j++)
		{
			System.out.println("Quale numero vuoi spostare: ?");
			int n=input.nextInt();

			boolean trovato=false;

			for(int i=0;i<a.length;i++)
				for (int j=0;j<a[i].length;j++)
					if (a[i][j]==n)
						{
							trovato=true;
							break;
						}

			if (trovato==true)
			   if ((i>0)&&(a[i-1][j]==0))
			   {
			   	a[i-1][j]=a[i][j];
			   	a[i][j]=0;
			   }
			   else





			System.out.println("In quale riga si trova il numero: ?");
			int r=input.nextInt();
			System.out.println("In quale colonna si trova il numero: ?");
			int c=input.nextInt();
			int [][]b=new int[r][c];

		}










	}

}


