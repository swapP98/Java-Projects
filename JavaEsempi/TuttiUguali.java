import java.util.Scanner;
public class TuttiUguali
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a, b, c;
		System.out.print("inserisci primo numero: ");
		a = input.nextInt();
		System.out.print("inserisci secondo numero: ");
		b = input.nextInt();
		System.out.print("inserisci terzo numero: ");
		c = input.nextInt();
		if (a==b && b==c)
			 System.out.print("uguali!");
		if (a!=b && b!=c)
		 System.out.print("diversi");
	}

}



