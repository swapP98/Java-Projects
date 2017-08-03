public class Ordinamento_per_inserimento
{
	public static void main(String[]args)
	{
		int n=0;
		int[] a=new int[] {5,4,3,2,1};
		for(int i=1;i<n;i++)
		{
			int v=a[i],j;
			for (j=i-1;j>=0;j--)
				if (a[j]>v)
					a[j+1]=a[j];
				else break;
			a[j+1]=v;
		}
		System.out.print(a);
	}
}