import java.util.Scanner;

public class AperB
{
	public static void main (String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Inserire il valore a: ");
		int a =input.nextInt();
		System.out.print("Inserire il valore b: ");
		int b=input.nextInt();
		int i;
		int r=a;
		int p=a;
		int q=0;

		for (i=1; i<b;i++)
		{
			p*=a;

		}
		System.out.println(p);
		for (i=0;i<b; i++)
		{
			r-=b;
			q++;

		}
		System.out.println("quoz" + q  +'\n' + "rest" + r);
	}
}