import java.util.Arrays;
public class DeterminanteMatrice
{
	static int Det(int[][] a)
	{
		if(a.length==1)
		return a[0][0];
		int somma=0, segno = 1;
		for (int i=0; i<a.length; i++)
		{
			int[][] b = new int[a.length-1][a.length-1];
			for(int j=0; j<a.length-1; j++)
				for(int k=0; k<a.length-1; k++)
				if(k<i)
				b[j][k]=a[j+1][k];
				else
				b[j][k]=a[j+1][k+1];
				somma+=segno*a[0][i]*Det(b);
				segno=-segno;
		}
		return somma;
	}

	public static void main(String[] args)
	{
		int [][] a = new int[3][3];
		int cont=0;

		for(int i=0; i<a.length;i++)
			for(int j=0; j<a[0].length; j++)
			{
				a[i][j]=(int)(Math.random()*10);
				System.out.print(a[i][j] + " ");
				cont++;
				if(cont==a.length)
				{
					cont=0;
					System.out.println();
				}
			}
		System.out.println();
			//STAMPA LA DETERMINANTE DELLA MATRICE
				System.out.print(Det(a)+ " ");


	}

}