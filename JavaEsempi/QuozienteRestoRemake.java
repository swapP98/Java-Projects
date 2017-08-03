import java.util.Scanner;
public class QuozienteRestoRemake
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	System.out.print("Inserire il valore ad a(dividendo): ");
	int a = input.nextInt();
	System.out.print("Inserire il valore ad b(dividendo): ");
	int b = input.nextInt();
	int q=0;
		if ( a>0 && b>0 )
		{
			while (a>=b)
			{
				a -= b;
				q++;
			}
			System.out.println("il quoziente è: " + q + "\n" + "il resto è:" + a );
		}

		if ( a<0 && b<0 )
		{
			a = (-a);
			b = (-b);

			while (a>=b)
			{
				a -= b;
				q++;
			}
			System.out.println("il quoziente è: " + q + "\n" + "il resto è:" + a );
		}

		if ( a>0 && b<0 )
		{
			b = (-b);

			while (a>=b)
			{
				a -= b;
				q++;
			}
			System.out.println("il quoziente è: " + (-q) + "\n" + "il resto è:" + a );
		}

		if ( a<0 && b>0 )
		{
			a = (-a);

			while (a>=b)
			{
				a -= b;
				q++;
			}
			System.out.println("il quoziente è: " + (-q) + "\n" + "il resto è:" + a );
		}


	}
}