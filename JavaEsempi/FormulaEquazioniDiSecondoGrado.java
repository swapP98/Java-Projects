/**
 * @(#)FormulaEquazioniDiSecondoGrado.java
 *
 *
 * @author Swapnil Paul
 * @version 1.00 2015/6/19
 */

import java.util.Scanner;
public class FormulaEquazioniDiSecondoGrado
{
		static double delta;
		static double x1;
		static double x2;
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String seg, seg2;
		System.out.print("Inserire il coefficente a: ");
		int a = input.nextInt();
		System.out.print("Inserire il coefficente b: ");
		int b = input.nextInt();
		seg = segno(b);
		System.out.print("Inserire il coefficente c: ");
		int c = input.nextInt();
		seg2 = segno(c);

		System.out.println("Equazione di secondi grado è: " + a + "x^2 " + seg + b + "x " + seg2 + c + " = 0");

		delta = (Math.sqrt((b*b)-(4*a*c)));
		x1 = (-b)+delta;
	 	x2 = (-b)-delta;

		if (a==0)
		{
			if(b!=0)
			{
				double x = -c/b;
				System.out.print("Il risultato è: " + x);
			}

			if(b==0)
			{
				if(c==0)
				System.out.print("INDEFINITA");
				if(c!=0)
				System.out.print("IMPOSSIBILE");
			}
		}

		if(a>0)
				System.out.print("fai schifo");
		if(a!=0)
		{
			if(delta>0)
				System.out.print("x1 = " + x1 + "\nx2 = " + x2);
			if(delta==0)
			{
				int r = (-b)/(2*a);
				System.out.print("x1 = x2 = " + r);
			}
			if(delta<0)
				System.out.print("Non è possibile radici reali (IMPOSSIBILE)");
		}
	}

	static String segno(int n)
	{
		if(n>0)
			return "+";
		return "";
	}
}