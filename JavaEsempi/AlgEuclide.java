/**	Author: Swapnil Paul
*	Date of creation: 28/10/2014
*	Version: 1.0
*/
import java.util.Scanner;

public class AlgEuclide
{
	public static void main (String[] args)
	{	int a, b;
			Scanner input = new Scanner(System.in);
			System.out.print("Digitare il primo numero: ");
			a = input.nextInt();
			System.out.print("Digitare il secondo numero: ");
			b = input.nextInt();
			while (a!=b)
			{	System.out.printf("%4d%4d\n", a, b);
				if (a>b)
					a -= b;
				else
					b -= a;
			}
		System.out.println("il cmd é " + a);
	}
}