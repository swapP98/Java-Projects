import java.util.Scanner;
public class InversoRemake
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String parola = input.nextLine();

		for(int i=parola.length()-1; i>=0; i--)
			System.out.print(parola.charAt(i));
	}
}