import java.util.Scanner;
public class SoloVocali
{
	public static void main (String[] args)
	{
		Scanner input=new Scanner(System.in);
			String frase = input.nextLine();
			int vocali=0;
			int consonanti=0;
			for(int i=0;i<frase.length(); i++)
				switch (frase.charAt(i))
				{
					case 'a': vocali++; break;
					case 'e': vocali++; break;
					case 'i': vocali++; break;
					case 'o': vocali++; break;
					case 'u': vocali++; break;
					default: consonanti++;

				}
				System.out.print("numero vocali " + vocali + '\n' + "numero consonanti" + consonanti);

	}
}