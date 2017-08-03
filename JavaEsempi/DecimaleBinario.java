import java.util.Scanner;

public class DecimaleBinario	//Conversione di un numero decimale in binario.
{
	public static void main(String args[])
	{
		System.out.print("Digitare un numero intero positivo: ");
		Scanner input = new Scanner(System.in);
		int decimale = input.nextInt();
		String binario = new String();
		while (decimale > 0)
		{	binario = decimale % 2 + binario;
			decimale = decimale / 2;
		}
		System.out.println("Numero binario corrispondente: " + binario);
	}
}