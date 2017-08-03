import java.util.Scanner;
public class PositivoNegativo2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num =input.nextInt();
		boolean trovato = false;
		do
		{
			int prec = num;
			num = input.nextInt();

			if (prec>0 && num<0)
				trovato = true;
		}
		while(num!=0);

			if (trovato==true)
				System.out.print("OK");
			else
				System.out.print("NO");
	}
}