import java.util.Scanner;
public class SequenzaCrescente
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean c = true;
		int a = input.nextInt();
		int b;

		if (a==0)
			{
				if (c)
					System.out.print ("Crescente");
				else
					System.out.print ("Non Crescente");
			}
		else
		{
			System.out.print("Quanti numeri desideri inserire");
				int n = input.nextInt();
			for (int i=0;i<n;i++)
			{
				b = input.nextInt();

				if (b==0)
					{
						if (c)
							System.out.print ("Crescente");
						else
							System.out.print ("Non Crescente");
					}
				else
					if (a<b)
						a=b;
					else
					{
						c = false;
							System.out.print ("Non Crescente");
					}
			}

		}

	}
}