import java.util.Scanner;
public class Numcifre
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String n=input.nextLine();
		int ncart=n.length();
		int num=0;
		int ncifre=0;

			for (int a=0; a<100;a++)
				for (int i=0;i<ncart; i++)
				if (n.charAt(i)==a)
						ncifre++;



		System.out.println("numero cifre: " + ncifre);


	}
}
