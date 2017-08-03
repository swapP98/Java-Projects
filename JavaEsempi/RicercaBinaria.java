/*
 *	Author: Matei & Paul
 *	Date: 7/01/15
 *
*/

import java.util.Scanner;
public class RicercaBinaria
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int v = input.nextInt();
		int min =0;
		int max =9;
		int[] a = new int[]{12,23,45,56,67,87,98,103,203,303};
		int cont=0;
		boolean vero = true;
		while(vero)
		{
			cont++;
			int k=(min+max)/2;
			if (v==a[k])
			{
				System.out.println("numero di posizione di v nel vettore: " + k + "\n"+ "numero di pasaggi: " + cont);
				break;
			}
			else if (v<a[k])
					max=k-1;
					else  min=k+1;
			{
				if	(min <= max)
					vero = true;
				else
				{
					vero=false;
					System.out.println("non presente");
				}
			}

		}

	}
}