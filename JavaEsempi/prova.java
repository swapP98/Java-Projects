import java.util.Scanner;
public class prova
{
	static double[][] a;
	static double[][] b;

	//MAIN
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//VARIABILI
		int nRighe,nColonne;
		int r,c,cont=0;
		boolean trovato = false;

		//DICHIARAZIONE DELLA MATRICE A

		System.out.print("Inserire il numero di rige della prima matrice ");
		nRighe = input.nextInt();
		System.out.print("Inserire il numero di colonne della prima matrice ");
		nColonne = input.nextInt();

		a = new double[nRighe][nColonne];

		 //STAMPA DELLA MATRICE A
		System.out.println("matrice a ");
		for (r=0; r<nRighe; r++)
		for ( c=0; c<nColonne; c++)
		{
			a[r][c]=(double)(Math.random()*10);
				System.out.printf("%6.2f",a[r][c]);
				cont++;

			if (cont==nColonne)
			{
				trovato=true;
				cont=0;

				if (trovato=true)
					System.out.println();
			}
		}

		System.out.println();

		double v;
		 b = new double[nRighe][nColonne];
		for(int i=0; i<a.length; i++)
		for(int j=0; j<a[i].length; j++)
		{
			b[i][j]=a[j][i];
		}

		System.out.println();
		for(int i=0; i<a.length; i++)
		for(int j=0; j<a[0].length; j++)
		{

		System.out.printf("%6.2f",b[i][j]);
		cont++;

			if (cont==nColonne)
			{
				trovato=true;
				cont=0;

				if (trovato=true)
					System.out.println();
			}
		}
	}
}