import java.util.Scanner;
public class CombinazioniCoppie
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int i,j;
		char[] c = new char[input.nextInt()];
		for (i=0; i<c.length; i++)
			c[i] = (char) ('A' + i);
			for (i=0; i<c.length-1;i++)
				for (j=i+1;j<c.length; j++)
					System.out.println(c[i] + "\t" + c[j]);
	}
}