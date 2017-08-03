import java.util.Scanner;
public class Ripeti
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Iserire la stringa: ");
		String s=input.nextLine();
		System.out.print("Quante volte vuoi stampare questa stringa: ");
		int n = input.nextInt();
		if (n<0)
			System.out.print("ERRORE!!: numero negativo!");
		for (int i=0; i<n; i++)
			System . out . println (s);
	}

}