public  class VettoreOrdinato
{
	public static void main(String[] args)
	{
		int[] a = new int[10];
		int i;
		for (i=0; i<10;i++)
		{
			a[i]=(int)(Math.random()*100);
			System.out.print(a[i] + " ");
		}
		int n=a[0];
		int[] b = new int[10];
		a[0]=b[0];
		for (i=0; i<10; i++)
		{
				if(n<b[i])
				{
					for (int k=10; k>10;k++)
						b[k-1]=b[k];

				}
				b[i]=n;
				n=a[i];
		}
		for (i=0; i<10; i++)
		System.out.print( "\n" + b[i] + " ");



	}
}