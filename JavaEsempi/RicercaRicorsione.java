import java.util.Scanner;
public class RicercaRicorsione
{
	static int[] a;
	public static void main (String[] args)
	{
		Scanner input =  new Scanner(System.in);
		System.out.print("Inseire la quantità di elementi desiderati:" );
		int d = input.nextInt();
		a=new int[d];

		for(int i=0; i<d; i++)
		{
			a[i]=(int)(Math.random()*100);
			System.out.print(a[i] + " ");
		}


		System.out.print("\n Elemento che si desidera ricercare: ");
		int elemRicercato = input.nextInt();


		System.out.println("minimo" + Minimo(a.length));
		System.out.println("somma" + Somma(a.length));
		Ricerca(elemRicercato,d,0);
	}

	static int Minimo(int dim)
	{
		if (dim==1)
			return a[0];
		return Math.min(a[dim-1],Minimo(dim-1));
	}

	static int Somma(int dim)
	{
		if (dim==1)
			return 1;
		return Somma(dim-1) + a[dim-1];
	}

	static void Ricerca(int n, int dim, int i)
	{
			while(i<dim)
			{
				if(a[i]==n)
				System.out.print( true );
				if(a[i]!=n)
				System.out.print( false );
				Ricerca(n,dim,i+1);
				break;
			}
	}
}