//	Visualizza tutti i fattori primi di un numero intero positivo

import java.util.Scanner;

public class FattoriPrimi
{
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	while (true)
    	{	System.out.print("\nDigitare il numero intero positivo da scomporre: ");
    		int n = input.nextInt();
    		if (n <= 0)
    			break;
    		for (int d = 2; d <= n;)
    		{	while (n % d != 0)
    				d = d + 1;
    			System.out.print(d);
    			n = n / d;
    			if (d <= n)
    				System.out.print(" * ");
    		}
    		System.out.println();
    	}
    }
}
