import java.util.Scanner;
public class TreConsecutivi
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] a = new int[6];
		int i;

		for (i=0; i<a.length; i++)
			a[i]= input.nextInt();


		boolean trovato=false;
		for(int j=0; j<a.length-1; j++)
		{
			if ((a[j]==a[j+1]) && (a[j+1]==a[j+2]) )
			trovato=true;
		}

			if (trovato==true)
				System.out.print("Nuemeri consecutivi");
			if (trovato==false)
				System.out.print("Nuemeri non consecutivi");



	}
}