import java.util.Scanner;
public class AperBRemake
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire il valore ad a: ");
		int a = input.nextInt();
		System.out.print("Inserire il valore ad b: ");
		int b = input.nextInt();
		int c=0;

		if (a>0 && b>0)
		{
			for(int i=0; i<b; i++)
			{
				c += a;
			}
			System.out.print("\n" + "Il risultato " + a + "x" + b + " é: " + c);
		}

		if (a<0 && b>0)
		{
			for(int i=0; i<b; i++)
			{
				c += a;
			}
			System.out.print("\n" + "Il risultato " + a + "x" + b + " é: " + c);
		}

		if (a<0 && b<0)
		{
			a = (-a);
			b = (-b);
			for(int i=0; i<b; i++)
			{
				c += a;
			}
			System.out.print("\n" + "Il risultato " + a + "x" + b + " é: " + c);
		}

		if (a>0 && b<0)
		{
			b = (-b);
			for(int i=0; i<b; i++)
			{
				c += a;
			}
			System.out.print("\n" + "Il risultato " + a + "x" + (-b) + " é: " + (-c));
		}
	}
}