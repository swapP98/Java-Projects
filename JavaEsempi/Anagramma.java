import java.util.Scanner;
public class Anagramma
{
	public static void main(String[] args)
	{
		Scanner input= new Scanner();
		String s=input.nextLine();
		String z=input.nextLine();

			for (int a=0; a<s.length;a++)			//conteggio ncifre
		{	for (i=0;i<z.length;i++)
			if (s.charAt(i)==z.charAt(z))
			System.out.print ("palindrome");
		}


	}
}