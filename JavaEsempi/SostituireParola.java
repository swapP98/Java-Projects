import java.util.Scanner;
public class SostituireParola
{
	public static void main(String[] args)
	{
		Scanner input= new Scanner (System.in);
		System.out.print("aquisire frase ");
		String s = input.nextLine();
		s=s+' ';
		System.out.print("aquisire parola che si vuole sostituire ");
		String a = input.nextLine();
		System.out.print("aquisire parola che si vuole sostituire ");
		String b = input.nextLine();

		int ncart=s.length();
		int nparola=0;
		int i=0;

		String parola="";
		String fraseFinale="";
			for (i=0;i<ncart;i++)				//incrementa i da 0 fino lunghezza s
			{
				if (s.charAt(i)==' ')
				{
					if (parola.equals(a))
					   fraseFinale=fraseFinale+b+' ';
					else
					   fraseFinale=fraseFinale+parola+' ';
					parola="";
				}
				else
					parola=parola+s.charAt(i);
			}
			System.out.print(fraseFinale);
	}
}

