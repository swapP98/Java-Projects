import java.util.Scanner;
public class ContinuaFino
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean cond;
		int num;
		int somma=0;
		do
		{	System.out.print("Inserisci Numero: ");
			num=input.nextInt();
			cond=(num<0 && num%2==0 || num>0 && num%3==0);
			if (cond)
			somma+=num;
		}
		while (cond);

			System.out.print(somma);

	}
}