import java.util.Scanner;
public class Punteggiatura
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int cont=0;
		String s;
		do
		{
			s=input.nextLine();
				for (int i=0; i<s.length(); i++)
				{
					switch(s.charAt(i))
					{	case '.': break;
						case ',': break;
						case ';': break;
						case ':': break;
						case '!': break;
						case '?': break;
					}
					cont++;
				}
		}
		while(!s. isEmpty ());
		System.out.print(cont);
	}
}