import java.util.Arrays;
public class EsercizioMatrice
{
		static int [][] a = new int[3][3];
		public static void main(String[]args)
		{
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


//----------------ORDINAMENTO PER SORT------------------------
			int b[] = new int[10];
			for( int i=0; i<b.length;i++)
				b[i]=(int)(Math.random()*100);

			Arrays.sort(b);
			for(int j=0; j<b.length; j++)
				System.out.print(b[j] + " ");
//-----------------ORDINAMENTO IN MODO SEMPLICE--------------
				System.out.println('\n' + '\n');


			int[] c = new int[10];
			c[0]=0;
			for(int i=1; i<c.length; i++)
			{
				c[i]=c[i-1]+(int)(Math.random()*100);
				System.out.print(c[i] +" ");
			}


//-----------------------------------------------------
		int[][] d = new int[10][10];
		int v,j;
			for(int i=0; i<d.length; i++)
				for(j=0; j<d[0].length; j++)
				{
					d[i][j]=(int)(Math.random()*10);
					System.out.print(d[i][j] + " ");
					cont++;
					if(cont==d.length)
					{
						cont=0;
						System.out.println();
					}
				}

		for (int i=1; i<d.length; i++)
			{
				v=d[i];
				for(j=i-1; j>=0; j--)
					if(d[j]>v)
						d[j+1]=d[j];
					else break;
					d[j+1]=v;
						nconfronti++;
			}
		}
}