
import java.util.Scanner;

public class digit
{
	public static void main (String[] args)
	{

		Scanner input = new Scanner(System.in);
		System.out.print("Digitare il raggio del cerchio: ");
		double raggio = input.nextDouble();
		double PiGreco = 3.14;
		double circonferenza = 2 * PiGreco * raggio;
		double area = raggio * raggio * PiGreco;
		System.out.println ( "la circonferenza � = " + circonferenza + "cm"); 			//questa � l'area
		System.out.println ( "l'area � = " + area + "cm" );								//questa � la circonferenza
	}
}



