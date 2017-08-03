import java.util.Scanner;
public class Ripetizioni
{
	public static void main(String[] args)
	{	Scanner input=new Scanner(System.in);
		for (int ind=1; ind<=5; ind++)
		{	 System.out.print("Quantli caratteri vuoi inserie? ");
			int num=input.nextInt();
			for (int i=0; i<=num; i++)
			{	String c=input.nextLine();
				System.out.println(c);
			}
		}
	}
}