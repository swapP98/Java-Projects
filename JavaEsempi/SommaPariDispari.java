public class SommaPariDispari
{
	public static void main(String[] args)
	{
		int[] a= new int[10];
		for (int j=0; j<10; j++)
			a[j]=(int)(Math.random()*10);
		int somma1=0;
		int somma2=0;
		for (int i=0; i<10;i++)
		{
			if (i%2==0)
				somma1+=a[i];

			if (i%2!=0)
				somma2+=a[i];

		}
		System.out.println("la somma1 è uguale ad: " + somma1);
		System.out.println("la somma2 è uguale ad: " + somma2);

			if (somma1==somma2)
				System.out.print("Pari e dispari uguali");
			else
				System.out.print("Pari e dispari diversi");
	}
}