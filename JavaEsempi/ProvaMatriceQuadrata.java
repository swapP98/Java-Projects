public class ProvaMatriceQuadrata
{
	static double[][] a;
	static double[][] b;
	static double[] c;
	static double[][]p;
	static double[][] cofat;
	static double[][] inver;
	static double[][] id;
	static int cont=0;
	static boolean trovato=false;

	//MAIN
	public static void main(String[] args)
	{
		//MATRICE A
		a = new double[][]{{1,2,3},
						   {4,55,6},
						   {7,86,9}
								};
		//STAMPA MATRICE A
		System.out.println("-----MATRICE A----");
		for (int r=0; r<a.length; r++)
		for (int c=0; c<a[0].length; c++)
		{
			System.out.printf("%6.2f",a[r][c]);
			cont++;
			if (cont==a[0].length)
			{
				trovato=true;
				cont=0;
				if (trovato=true)
					System.out.println();
			}
		}
		//dichiarazione delle matrici
		b = new double[a.length][a[0].length];
		c = new double[a[0].length];
		p = new double[a.length][b[0].length];
		cofat = new double[a.length][a[0].length];
		inver = new double[a.length][b[0].length];
		id = new double[a.length][a[0].length];

		//INVOCAZIONE DEL METODO TRASPOSTA RICORSIONE
		System.out.println();
		System.out.println("------MATRICE TRASPOSTA DI A (quindi matrice b)------");
		b = TraspostaRic(a);
		for(int i=0; i<a.length; i++)
		for(int j=0; j<a[i].length; j++)
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

		//PRODOTTO TRA MATRICI A & B
		System.out.print("il prodotto della mtrice a & b è : \n");
		p = prodotto(a,b);
		for(int i=0; i<p.length; i++)
		for(int j=0; j<p[i].length; j++)
		{
			System.out.printf("%8.2f",p[i][j]);
			cont++;
			if (cont==p[0].length)
			{
				trovato=true;
				cont=0;
				if (trovato=true)
					System.out.println();
			}
		}


		//ELEMENT MINIMO METRICE A
		System.out.println("\nl'emento minimo è: ");
		minimo(a);

		//determinante
		System.out.printf("\n\nDeterminante di una matrice: " + "%4.2f",determinante(a));
		System.out.println();

		//COFATTORI
		System.out.println("\nCofattore: ");
		cofat = cofattori(a);
		for(int i=0; i<cofat.length; i++)
		for(int j=0; j<cofat[i].length; j++)
		{
			System.out.printf("%8.2f",cofat[i][j]);
			cont++;
			if (cont==cofat[0].length)
			{
				trovato=true;
				cont=0;
				if (trovato=true)
					System.out.println();
			}
		}

		//INVERSA
		System.out.println("\nMatrice Inversa di a: ");
		inver = inversa(a);
		for(int i=0; i<inver.length; i++)
		for(int j=0; j<inver[i].length; j++)
		{
			System.out.printf("%8.2f",inver[i][j]);
			cont++;
			if (cont==inver[0].length)
			{
				trovato=true;
				cont=0;
				if (trovato=true)
					System.out.println();
			}
		}

		//IDENTITà
		System.out.println("\nIndetità è: ");
		id = identità(a);
		for(int i=0; i<id.length; i++)
		for(int j=0; j<id[i].length; j++)
		{
			System.out.printf("%8.2f",id[i][j]);
			cont++;
			if (cont==id[0].length)
			{
				trovato=true;
				cont=0;
				if (trovato=true)
					System.out.println();
			}
		}

	}




///----------------------------inzio dei metodi----------------

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
	//minimo
	static void  minimo (double[][] a)
	{
		double min =a[0][0];
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a[0].length; j++)
			{
				if(a[i][j]<min)
					min=a[i][j];
			}
		System.out.print(min);
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

	//COFATTORI
	static double[][] cofattori (double[][] a)
	{
		for(int i=0; i<cofat.length; i++)
			for(int j=0; j<cofat[i].length; j++)
			{
				cofat[i][j]=((Math.pow(-1,i+j))*(determinante(a)));
			}
		return cofat;
	}

	//INVERSA
	static double[][] inversa(double[][] a)
	{
		for(int i=0; i<inver.length; i++)
			for(int j=0; j<inver[i].length; j++)
			{
				inver[i][j] = ((1/determinante(a))*(b[i][j]));
			}
		return inver;
	}

	//IDENTITà
	static double[][] identità(double[][] a)
	{
		for(int i=0; i<id.length; i++)
			for(int j=0; j<id[i].length; j++)
			{
				id[i][j] = a[i][j]*inver[i][j];
			}
		return id;

	}

}