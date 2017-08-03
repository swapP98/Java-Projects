import java.util.Scanner;
public class DueSequenze
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String[] a = new String[5];
		String[] b = new String[5];
		System.out.println("Prima Stringa");

		for (int i=0; i<a.length; i++)
		{
			String primoString = input.nextLine();
			a[i]=primoString;
		}
		System.out.println("Seconda Stringa");

		for (int j=0; j<5; j++)
		{
			String secondoString = input.nextLine();
			b[j]=secondoString;
		}

		boolean trov = false;
		int k=0;

		while(k<a.length && !trov)
		{
			int l=0;
			while(l<b.length && !trov)
			{
				if(a[k].equals(b[l]))
					trov=true;
					l++;
			}
			k++;
		}


		if (trov)
			System.out.println("due sequenze");
		else
			System.out.println("nO");
	//	for (int k=0; k<a.length; k++)
	//	System.out.print(a[k]);


	}
}