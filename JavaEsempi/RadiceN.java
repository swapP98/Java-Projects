import java.util.Scanner;
public class RadiceN
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Inserire Numero: ");
			int n=input.nextInt();
			int a=0;		//contatore
			int b=1;		//contatore2
			int s=0;
		while (b<=n)
		{	if((a%2)!=0)
			{	s=s+n;
				b--;
			}
			a--;
		}
		System.out.print("Il numero" + n + "^2= " + s );
	}
}