import java.util.Scanner;

	public class RicercaNumeri
	{
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);

			System.out.print("Numero di Stringhe da inserire");
			int n = input.nextInt();
			String s;
			for (int i=0; i<n; i++)
			s = input.nextLine();
		}
	}
