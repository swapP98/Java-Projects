
import java.util.Scanner;

public class radici
{	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Coefficente a= ");					//coefficente a
		double a = input.nextDouble();							// digitare coefficente a
		System.out.print("Coefficente b= ");					//coefficente b
		double b = input.nextDouble();							// digitare coefficente b
		System.out.print("Coefficente c= ");					//coefficente c
		double c = input.nextDouble();							// digitare coefficente c
		double delta = Math.sqrt( b * b - 4 * a * c );			// espressione del delta
		double x1 = (-b +delta) / (2 * a);						//
		double x2 = (-b -delta) / (2 * a);
		System.out.println( "Risultato di x1= " + x1 );
		System.out.println( "Risultato di x2= " + x2 );
	}
}