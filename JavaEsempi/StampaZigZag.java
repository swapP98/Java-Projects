public class StampaZigZag
{
	public static void main(String[] args)
	{
		int[] a= new int[10];
		int[] b= new int[10];

		System.out.println("il primo array: ");
		for(int k=0; k<10; k++)
		{
			a[k]=(int)(Math.random()*100);
			System.out.print(a[k]+" ");
		}

		System.out.println();
		System.out.println("il secondo array: ");
		for (int l=0; l<10; l++)
		{
			b[l] = (int)(Math.random()*100);
			System.out.print(b[l]+" ");
		}
		System.out.println("\n" +  "Array zigzagato");

		for(int i=0; i<10;i++)
		{
			int j=9-i;
			System.out.print(a[i] + " ");
			System.out.print(b[j]+ " ");
		}

	}
}