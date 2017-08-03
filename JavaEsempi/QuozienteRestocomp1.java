import java.util.Scanner;

public class QuozienteRestocomp1
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Inserire il primo numero(dividendo): ");
		int a=input.nextInt();
		System.out.print("Inserire il secondo numero(divisore): ");
		int b=input.nextInt();
		int q=0;
		int	r=a;
			if (a>0 && b>0)
			{
				while (r>=b)
				{	r=r-b;
					q++;
				}
					System.out.println("Il quoziente é: " +q);
					System.out.println("Il resto é: " +r);
			}
			if (a<0 && b<0)
			{
				while (r<=b)
				{	r=r-b;
					q--;
				}
					System.out.println("Il quoziente é: " +q);
					System.out.println("Il resto é: " +(-r));
			}
		}
	}
}