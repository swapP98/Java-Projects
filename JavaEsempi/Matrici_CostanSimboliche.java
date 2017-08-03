//LEZIONE DI MART 20/GEN/2015
public class Matrici_CostanSimboliche
{
	public static void main(String[] args)
	{
		//MATRICI A DUE DIMENSIONI

		int i,j,r,c;
		int cont=0;

		boolean trovato=false;
		int[][] t = new int[10][10];
		for(i=0; i<10; i++)
			for (j=0; j<10;j++)
			{
				t[i][j]=(j+1)*(i+1);
					System.out.print(t[i][j]+ " ");
					cont++;

				if (cont==t.length)
				{
					trovato=true;
					cont=0;

					if (trovato=true)
						System.out.println();
				}
			}


		//COSTANTI SIMBOLICHE

		System.out.println("\n" + "COSTANTI SIMBOLICHE" + "\n");

		final int nRighe=10;
		final int nColonne=10;

		int[][] a = new int[nRighe][nColonne];
		int[][] b = new int[nRighe][nColonne];
		int[][] s = new int[nRighe][nColonne];


			System.out.println("Prima dimensione= "  +  a.length);
			System.out.println("Seconda dimensione= " + a[0].length);

		//SOMMA DI DUE MATRICI

		System.out.println("\n" + "SOMMA DI DUE MATRICI " + "\n");

		System.out.println("matrice a ");

		for (r=0; r<nRighe; r++)
			for ( c=0; c<nColonne; c++)
			{
				a[r][c]=(int)(Math.random()*10);
					System.out.print(a[r][c] + " ");
					cont++;

				if (cont==10)
				{
					trovato=true;
					cont=0;

					if (trovato=true)
						System.out.println();
				}
			}

			System.out.println("\n");

		System.out.println("matrice b");

		for (r=0; r<nRighe; r++)
			for ( c=0; c<nColonne; c++)
			{
				b[r][c]=(int)(Math.random()*10);
					System.out.print(b[r][c] + " ");
					cont++;

				if (cont==10)
				{
					trovato=true;
					cont=0;

					if (trovato=true)
						System.out.println();
				}
			}

		System.out.println("\n");

		System.out.println("matrice s= somma tra matrice a & matrice b");

		for(int l=0; l<nRighe; l++)
			for(int g=0; g<nColonne; g++)
			{
				s[l][g] = a[l][g] + b[l][g];
				System.out.print(s[l][g] + " ");
				cont++;

				if (cont==10)
				{
					trovato=true;
					cont=0;

					if (trovato=true)
						System.out.println();
				}
			}


	//----------------------------------------------------------------------------\\
		System.out.println("\n"+"\n");
		char[][] prov = new char[][]{{'s','d','a'},{'l','o','i'}};

		for(i=0; i<2; i++)
			for (j=0; j<3; j++)
			{
				System.out.print(prov[i][j] + " ");
				cont++;

				if(cont==3)
				{
					cont=0;
					System.out.println();
				}

			}
	}
}