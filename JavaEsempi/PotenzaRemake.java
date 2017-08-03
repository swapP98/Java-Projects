import java.util.Scanner;
public class PotenzaRemake
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire la base della potenza: ");
		int n = input.nextInt();												// n = base della potenza
		System.out.print("Inserire l'esponente della potenza: ");
		int e = input.nextInt();												// e = esponente della potenza
		int c = 1;
		double c1 = 1;

		if(n>=0 && e>=0)
		{
			for (int i=0; i<e; i++)
			c *=n;																// calcolo per ottenere la potenza
			System.out.print("la porenza " + n + "^" + e + " è: " + c);
		}

		if (n<0 && e>0)
		{
			for (int i=0; i<e; i++)
			c *=n;
			System.out.print("la porenza " + n + "^" + e + " è: " + c);
		}

		if (n>0 && e<0)
		{
			e = (-e);
			for (int i=0; i<e; i++)
			c1 *=n;
			System.out.print("la porenza " + n + "^" + e + " è: " + (1/c1));
		}

	}
}