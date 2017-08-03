import java.util.Scanner;
public class AlgEuclideRemake
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire il primo numero: ");
		int a = input.nextInt();
		System.out.print("Inserire il secondo numero: ");
		int b = input.nextInt();
		int r=1;

		System.out.print("\nRiga\t|\tb\t|\ta\n");
		System.out.println("--------|-------|-----");
		while(a!=b)
		{
			System.out.printf("%4d%10d%7d\n",r++,a,b);
			if (a<b)
				b -= a;
			else
				a -= b;
		}
		System.out.println("\n" + "Il mcd è: " + a);


	}
}