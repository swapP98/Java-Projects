import java.util.Scanner;
public class AlternazaParola
{
	public static void main(String[] args)
	{
		Scanner input= new Scanner (System.in);
		System.out.print("aquisire frase ");
		String fraseUno = input.nextLine();
		System.out.print("aquisire parola che si vuole sostituire ");
		String fraseDue = input.nextLine();

		int ncartUno=fraseUno.length();
		int ncartDue=fraseDue.length();
		int i=0;
		String fraseFinale="";
		for (i=0;i<ncartUno;i++)
		{
			for ( i=0;i<ncartDue;i++)
			{
				if (fraseUno.charAt(i)==' ')
			fraseFinale=fraseUno+fraseDue+' ';
			}
		}
		System.out.print(fraseFinale);


	}
}