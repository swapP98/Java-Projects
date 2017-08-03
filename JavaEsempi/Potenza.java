import java.util.Scanner;

	public class Potenza
	{
		public static void main(String[] args)
		{
			Scanner input=new Scanner(System.in);
			int a = input.nextInt();
			int b = input.nextInt();
			int c;
		int d=0;
		for (c=a;d<=b;d++)
		{
			c=c*a;
		}
			System.out.print("il prodotto di a*b é: " + c );
		}
}