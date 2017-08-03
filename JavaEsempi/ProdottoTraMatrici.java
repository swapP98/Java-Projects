/*	Author : Swapnil Paul
 *	Date : 26/02/2015
 *
*/
import java.util.Scanner;
public class ProdottoTraMatrici
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int nRighe,nColonne;
		int nRighe2,nColonne2;
		int r,c,cont=0;
		boolean trovato = false;
		//DICHIARAZIONE DELLA MATRICE A & B

		System.out.print("Inserire il numero di rige della prima matrice ");
		nRighe = input.nextInt();
		System.out.print("Inserire il numero di colonne della prima matrice ");
		nColonne = input.nextInt();

		int[][] a = new int[nRighe][nColonne];


		System.out.print("Inserire il numero di rige della seconda matrice ");
		 nRighe2 = input.nextInt();
		System.out.print("Inserire il numero di colonne della seconda matrice ");
		 nColonne2 = input.nextInt();

		int[][] b = new int[nRighe2][nColonne2];

		//CONDIZIONE
		if(nRighe!=nColonne2)
		System.out.print("IMPOSSIBILE FARE IL PRODOTOO DELLA MATRICE PERCHé IL NUMERO DI nRighe E nColonne2 NON SONO UGUALI ");
		else
		{
		//STAMPA DELLA MATRICE A
		System.out.println("matrice a ");

		for (r=0; r<nRighe; r++)
			for ( c=0; c<nColonne; c++)
			{
				a[r][c]=(int)(Math.random()*-10);
					System.out.print(a[r][c] + " ");
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
		//STAMPA DELLA MATRICE B
		System.out.println("matrice b");

		for (r=0; r<nRighe2; r++)
			for ( c=0; c<nColonne2; c++)
			{
				b[r][c]=(int)(Math.random()*10);
					System.out.print(b[r][c] + " ");
					cont++;

				if (cont==nColonne2)
				{
					trovato=true;
					cont=0;

					if (trovato=true)
						System.out.println();
				}
			}
		}

		int[][] p = new int[nRighe2][nColonne];
		for(int i=0; i<nRighe2; i++)
			for(int j=0; i<nColonne; j++)
			{
				p[i][j]=a[i][j]*b[i][j];
				System.out.print(p[i][j] + " ");
				if (cont==nColonne2)
				{
					trovato=true;
					cont=0;

					if (trovato=true)
						System.out.println();
				}
			}

	}
}