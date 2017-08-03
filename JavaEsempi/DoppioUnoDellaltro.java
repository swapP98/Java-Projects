public class DoppioUnoDellaltro
{
	public static void main(String[] args)
	{
		int[] a = new int[10];

		int y,i,j=0;
		for (y=0; y<a.length; y++)
		{
			a[y]=(int)(Math.random()*10);
			System.out.print(a[y] + " ");
		}

		boolean trovato = false;
		for (i=0;i<a.length-1;i++)
		{
			j=i+1;
			if (a[i]==(a[j]*2))
				trovato=true;
		}

		if(trovato)
			System.out.print("ok");
		else
			System.out.print("no");


	}
}