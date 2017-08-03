import java.util.Scanner;
public class NumPariOrdinatiInversamente
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Quanti numeri desideri inserire: ");
		int n = input.nextInt();

		int[] a = new int[n];
		int contaPari=0;

		for (int i=0; i<a.length; i++)
		{
			System.out.print("Elemento numero " + (i+1) + " :");
			a[i] = input.nextInt();
				if ((a[i]%2==0)&&(a[i]>=0))
					contaPari++;
		}

		int[] b = new int[contaPari];
		int k=0;
		while(k<contaPari)
		{
			for(int y=0; y<a.length; y++)
			{
				if ((a[y]%2==0)&&(a[y]>=0))
				{
					b[k]=a[y];							//copia il numero positivo e maggiore sul vettore b
					k++;
				}
			}
		}

		System.out.println("numeri pari risultati nel vettore: " + contaPari);

		for (int j=contaPari-1; j>=0; j--)		//inversione dei numeri
			System.out.print(b[j] + " ");
	}
}

