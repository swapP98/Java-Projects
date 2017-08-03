import java.util.Scanner;

public class QuozienteResto
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int q=0;
		if (a<0)
			if (b<0)
			{q=q-b;
				q--;
			}
			System.out.println(q);
	}
}