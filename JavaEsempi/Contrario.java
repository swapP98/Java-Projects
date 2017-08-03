import java.util.Scanner;
public class Contrario
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Inserisci una stringa ");
		String a=input.nextLine();
		for(int i=a.length()-1;i>=0;i--)
			System.out.print(a.charAt(i));
	}
}