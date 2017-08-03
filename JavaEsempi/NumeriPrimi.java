public class NumeriPrimi	//Stampa tutti i numeri primi minori di 100000.
{

    public static void main(String[] args)
    {
    	int n, d, c = 0;
    	System.out.println();
    	for (n = 2; n < 100000; n++)
    	{	for (d = 2; d < n; d++)
    			if (n % d == 0)
    				break;
    		if (d == n)
    		{	System.out.printf("%6d", n);
    			c = (c + 1) % 16;
    			if (c == 0)
    				System.out.println();
    		}
    	}
    }
}
