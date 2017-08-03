public class Ordinamento_per_selezione
{
	public static void main(String[]args)
	{
		int n=0;
		int[] a=new int[] {5,4,3,2,1};
		for(int i=0;i<n-2;i++)
		{
			int k=i;
			for(int j=i+1;j<n;j++)
				if(a[j]<a[k]) k=j;
			int v=a[k];
			a[k]=a[i];
			a[i]=v;
		}
	System.out.print(a);
	}
}