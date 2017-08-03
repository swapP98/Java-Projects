import java.util.Scanner;
public class TriangoloTartaglia
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int t[] = {1};
		int j;
		for (int i=1; i<=n; i++)
		{
			int[] r = new int[i+1];
			for(j=0; j<i; j++)
			{
				System.out.print(t[j] + "\t");
			}
				System.out.println();
				r[0]=1;
				r[i]=1;
				for ( j=1; j<i;j++)
					r[j] = t[j-1] + t[j];
					t=r;
		}
	}
}
