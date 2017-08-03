
// author 			Paul Swapnil
//date of creation 	01/10/2014
//version			2.0

import java.util.Scanner;

public class radici2
{	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Coefficente a= ");					//coefficente a
		double a = input.nextDouble();							// digitare coefficente a
		System.out.print("Coefficente b= ");					//coefficente b
		double b = input.nextDouble();							// digitare coefficente b
		System.out.print("Coefficente c= ");					//coefficente c
		double c = input.nextDouble();							// digitare coefficente c
		double delta = Math.sqrt( b * b - 4 * a * c );			// espressione del delta
		double x1 = (-b +delta) / (2 * a);						// soluzione x1 della formula
		double x2 = (-b -delta) / (2 * a);						// soluzione x2 della formula
		if (a==0)
		{
			if (b!=0)
			{
				double x = -c / b;
				System.out.println( "x=-c/b = " + x );
			}
     		else
			if (b==0)
				if (c!=0)
					System.out.println("c diverso da zero, quindi impossibile, infatti");
				else if (c==0)
				    	System.out.println("c uguale a zero, quindi indeterminata");
		}
		if (a!=0)
		{
		   if (delta > 0)
			{
				double xa = (-b +delta) / (2 * a);
				double xb = (-b -delta) / (2 * a);
				System.out.println( "Risultato di x1 qunado delta è maggiore di 0= " + xa );
				System.out.println( "Risultato di x2 quando delta è maggiore di 0= " + xb );
			}
			else ;
				if (delta==0)
				{
					double x4 = (-b) / (2 * a);
					double x3 = (-b) / (2 * a);
					System.out.println( "Risultato di x1 quando delata è uguale a 0= " + x3 );
					System.out.println( "Risultato di x2 quando delata è uguale a 0= " + x4 );
				}
				else ;
					if (delta < 0)
						System.out.println ("Non Possiede radici reali quindi IMPOSSIBILE");
					else ;
		}
		System.out.println( "Risultato di x1= " + x1 );
		System.out.println( "Risultato di x2= " + x2 );
	}
}