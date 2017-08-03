import java.util.Scanner;
public class Spazi
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int cont=0;
		System.out.println("Inserisci la Stringa: ");
		String s = input.nextLine();
		for (int i=0; i<s.length(); i++)
		{
			switch (s.charAt(i))
			{	case ' ':cont++; break;
			}

		}
		System.out.print(cont);
	}
}
