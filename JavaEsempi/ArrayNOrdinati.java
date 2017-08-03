import java.util.Scanner;
public class ArrayNOrdinati
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	   System.out.print("quanti numeri vuoi inserire: ");
	   int i, n, j, x;
	   int n1=input.nextInt();
	   int[] a = new int[n1];

		for (i=0; i<n1; i++)
		{	System.out.print("elemento numero " + (i+1) + ": ");
			x= input.nextInt();
			a[i]=x;

		}

		for (i=0; i<n1; i++)
			System.out.print(a[i] + " ");



	}
}