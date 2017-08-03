public class Ordinamento_per_scambio
{
	public static void main(String[]args)
	{
		int[] a=new int [] {5,4,3,2,1};
		boolean ordinato=false;
		while (!ordinato)
		{
			ordinato= true;
			for (int i=0;i<n-1;i++)
				if(a[i]>a[i+1])
				{
					int v=a[i];a[i]=a[i+1];a[i+1]=v;
					ordinato false;
				}
			System.out.print(a);
		}
	}
}