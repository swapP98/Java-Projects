import java.util.Scanner;
public class TuttiPositiviPari
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("qunti numeri vuoi inserire: ");
		int num=input.nextInt();
		int i;
		boolean PosPar=true;
		for(i=0;i<num;i++)
		{
			System.out.print("inserisci i numeri: ");
			int n=input.nextInt();
			if(n<0 || n%2!=0) PosPar=false;
		}
		if (PosPar) System.out.println("tutti positivi e pari");
		else System.out.println("no");
	}
}