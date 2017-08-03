/**
 * @(#)MatriceQuadrata.java
 *
 *
 * @author
 * @version 1.00 2015/3/18
 */
import java.util.Scanner;
import java.lang.Object;
public class MatriceQuadrata extends java.lang.Object
{
	static double[][] a;
	static double[][] b;
	static double[][] p;

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
		b=new double[a.length][a[0].length];

		 //STAMPA DELLA MATRICE A
		System.out.println("Matrice a ");
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

		//METODO TRASPOSTA
		System.out.println("\nMatrice trasposta ovvero matrice b");
		Trasposta(a);

	/*	//INVOCAZIONE DEL METEDO TRASPOSTA RICORSIONE !!!!CORETTO!!!
		System.out.println();
		a = TraspostaRic(a);
		for(int i=0; i<a.length; i++)
		for(int j=0; j<a[i].length; j++)
		{
			System.out.printf("%6.2f",a[i][j]);
			cont++;
			if (cont==a[0].length)
			{
				trovato=true;
				cont=0;
				if (trovato=true)
					System.out.println();
			}
		}
	*/

		//INVOCAZIONE DEL METODO PRODOTTO
		System.out.println("\nIl prodotto della mtrice a & b è :");
		p = prodotto(a,b);
		for(int i=0; i<p.length; i++)
		for(int j=0; j<p[i].length; j++)
		{
			System.out.printf("%7.2f",p[i][j]);
			cont++;
			if (cont==p[0].length)
			{
				trovato=true;
				cont=0;
				if (trovato=true)
					System.out.println();
			}
		}

		//INVOCAZIONE DEL METEDO MINORE
		minore(a);

		//INVOCAZIONE DEL METEDO DETERMINANTE DI UNA MATRICE
		System.out.printf("\n\nDeterminante di una matrice: " + "%4.2f",determinante(a) );

	}

//---------------------INIZIO DEI METODI--------------------------

	//TRASPOSTA
	static void Trasposta(double[][] a)
	{
		double v;
		boolean trovato=false;
		int cont=0;

		for(int i=0; i<a.length; i++)
		for(int j=0; j<a[i].length; j++)
		{

			b[i][j]=a[j][i];
		}

		for(int i=0; i<a.length; i++)
		for(int j=0; j<a[0].length; j++)
		{
			System.out.printf("%6.2f",b[i][j]);
					cont++;
			if (cont==a[0].length)
			{
				trovato=true;
				cont=0;
				if (trovato=true)
					System.out.println();
			}
		}
	}
	//TRASPOSTA RICORSIONE
	static double[][] TraspostaRic(double[][] a)
	{
		for(int i=0; i<a.length; i++)
		for(int j=0; j<a[0].length; j++)
				b[i][j]=a[j][i];
				return b;

	}

	//PRODOTTO
	static double[][] prodotto(double[][] a, double[][] b)
	{
		if (a[0].length != b.length)
		 p = new double[0][0];
		else
		{
			p = new double[a.length][b[0].length];
			for(int i=0; i<p.length; i++)
			for(int j=0; j<p[0].length; j++)
				for(int k=0; k<b.length; k++)
			   p[i][j] = p[i][j] + a[i][k]*b[k][j];
		}
      return p;
   	}

	//MINORE
	static void minore(double[][] a)
	{
		double min =a[0][0];
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a[0].length; j++)
			{
				if(a[i][j]<min)
					min=a[i][j];
			}
		System.out.printf("\nL'elemento minore è: " + "%4.2f",min);
	}

	//DETERMINANTE DI UNA MATRICE
		static double determinante (double[][] a)
	{
		if(a.length==1)
		return a[0][0];
		int somma=0, segno = 1;
		for (int i=0; i<a.length; i++)
		{
			double[][] det = new double[a.length-1][a.length-1];
			for(int j=0; j<a.length-1; j++)
				for(int k=0; k<a.length-1; k++)
				if(k<i)
				det[j][k]=a[j+1][k];
				else
				det[j][k]=a[j+1][k+1];
				somma+=segno*a[0][i]*determinante(det);
				segno=-segno;
		}
		return somma;
	}


}