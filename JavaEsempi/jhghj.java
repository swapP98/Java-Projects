public class jhghj
{
	public static void main(String[] args)
	{
		int[][] d = new int[10][10];
		int v, cont=0, j;
			for(int k=0; k<d.length; k++)
				for(int y=0; y<d[0].length; y++)
				{
					d[k][y]=(int)(Math.random()*10);
					System.out.print(d[k][y] + " ");
					cont++;
					if(cont==d.length)
					{
						cont=0;
						System.out.println();
					}
				}

				System.out.println();
///--------------Ordinamento matrice per colonne (ordinamento per inserimento)-------
		for (int r=0; r<d.length; r++)
			for(int c=0;c<d.length;c++)
			{
				v=d[r][c];
				for(j=r-1; j>=0; j--)
					if(d[j][c]>v)
						d[j+1][c]=d[j][c];
					else break;
					d[j+1][c]=v;
			}

		for(int g=0; g<d.length; g++)
			for(int t=0; t<d[0].length; t++)
			{
				System.out.print(d[g][t] + " ");
					cont++;
					if(cont==d.length)
					{
						cont=0;
						System.out.println();
					}
			}

				System.out.println();
//---------------------------------------


	}
}