//SWAPNIL PAUL

import java.util.Scanner;
public class SommaTraMatrici
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
		//CONDIZIONE DI CONFRONTO DELLE RIGHE E DELLE COLONNE
		if((a.length!=b.length)||(a[0].length!=b[0].length))
			System.out.print("IMPOSSIBILE FARE LA SOMMA DELLA MATRICE PER CHE IL NUMERO DI RIGHE E COLONNE NON SONO UGUALI ");
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
				//CREZIONE DELLA MATRICE SOMMA=A+B
				int s[][]= new int[nRighe2][nColonne];


				//STAMAPA DELLA MATRICE SOMMA
				System.out.println("matrice s");

				for (int i=0; i<nRighe2; i++)
					for(int j=0; j<nColonne2; j++)
						{
							s[i][j] = a[i][j]+b[i][j];
								System.out.print(s[i][j] + " ");
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
	}
}