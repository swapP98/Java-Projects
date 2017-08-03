import java.util.Scanner;
public class ContinuagFino
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num;
		int somma=0;
		do
	 	{
	 		num = input.nextInt();
	 		if ((num<0 && num%2==0) || (num>0 && num%3==0))
	 		somma +=num;
	 	}
		while ((num<0 && num%2==0) || (num>0 && num%3==0));

		System.out.println("la somma é " + somma);
	}
}