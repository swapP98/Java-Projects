/**	Author: Swapnil Paul
*	Program Name: CompletoAperB
*	Date of creation: 01/11/2014
*	Version: 2.0 Pro
*/

import java.util.Scanner;

public class CompletoAperB
{
	public static void main (String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Inserire il valore a: ");
		int a= input.nextInt();
		System.out.print("Inserire il valore b: ");
		int b= input.nextInt();
		int c;
		int d=0;
		if (a<0 && b<0)
		{
			for (c=0;d>b;d--)
			{
				c=c+a;
			}
				System.out.print("il 1prodotto di a*b é: " + (-c) );
		}
		if (a>0 && b>0)
		{
			for (c=0;d<b;d++)
			{
				c=c+a;
			}
				System.out.print("il 2prodotto di a*b é: " + c );
		}
		if (a<0 && b>0)
		{
			for (c=0;d<b;d++)
			{
				c=c+a;
			}
				System.out.print("il 3prodotto di a*b é: " + c );
		}
		if (a>0 && b<0)
		{
			for (c=0;d>b;d--)
			{
				c=c+a;
			}
				System.out.print("il 4prodotto di a*b é: " + (-c) );
		}
	}
 }
