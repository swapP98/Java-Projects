import java.util.Scanner;
public class RicercaSequenziale
{
	public static void main(String[] args)
	{
		int[] a=new int[]{12,21,31,41,51,61,71,81,91,101};
		Scanner input=new Scanner(System.in);
		int v=input.nextInt();
		int i=0;
		for(;i<10;i++)
			if(v==a[i]) break;
		if (i<10)
			System.out.println(i);
		else System.out.println("Valore non trovato");

		}
}
