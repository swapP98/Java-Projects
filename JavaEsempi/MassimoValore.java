/*	Author : Swapnil Paul
 * 	Date 15/02/2015
 *	Program name : MassimiRelativi
*/
import java.util.Scanner;
import java.awt.*;
public class MassimoValore
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int i,j;
		System.out.print("Inserire numero di righe: ");
		final int nRighe = input.nextInt();
		System.out.print("Inserire numero di colonne: ");
		final int nColonne = input.nextInt();
		int cont=0;
		boolean trovato = false;
		int[][] matrice = new int[nRighe][nColonne];
		for (i=0; i<nRighe; i++)
			for(j=0; j<nColonne; j++)
			{
				matrice[i][j]=(int)(Math.random()*100);				//INSERIMENTO CASUALE DEI NUMERI NELLA MATRICE
				System.out.print(matrice[i][j] + " ");
				cont++;

				if (cont==nColonne)
				{
					trovato = true;
					cont=0;
					if (trovato=true)
						System.out.println();
				}

			}

		int r=0, c=0;

		for(i=0; i<nRighe; i++)
			for(j=0; j<nColonne; j++)
			{
				if (matrice[i][j] > matrice[r][c])				//CONTROLLO DEL MASSIMO VALORE
				{	r = i;
					c = j;
				}
			}
			System.out.println("Il massimo valore della matrice è " + matrice[r][c] + " in posizione (" + (r+1) + "," + (c+1) + ")");

			String s = "!=>";

			for(i=0; i<nRighe; i++)
				for (j=0; j<nColonne; j++)
				{
					System.out.print(matrice[i][j] + " ");
					cont++;


					if(matrice[i][j]==matrice[r][c-1])
						System.out.printf("%2s",s);

					if (cont==nColonne)
					{
						trovato = true;
						cont=0;
						if (trovato=true)
							System.out.println();
					}


				}

	}
}





