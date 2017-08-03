import java.util.Scanner;
public class MediaMultipliDiTre
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		System.out.print("Quanti numeri vuoi inserire");
		int num=input.nextInt();

		int somma=0;
		int cont=0;
		for (int i=0; i<num; i++)
		{	int n=input.nextInt();
			if(n%3==0)
			{	somma+=n;
				cont++;
			}
		}
		System.out.print("la media è: " + somma/cont);
	}
}