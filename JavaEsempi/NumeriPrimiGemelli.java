public class NumeriPrimiGemelli	//Stampa tutti i numeri primi gemelli minori di 100000.
{

    public static void main(String[] args)
    {
    	int n, d, c = 0, p = 1;
    	System.out.println();
    	for (n = 2; n < 100000; n++)
    	{	for (d = 2; d < n; d++)
    			if (n % d == 0)
    				break;
    		if (d == n)
    		{	if (d - p == 2)
    			{	System.out.printf("%6d -%6d", p, d);
    				c = (c + 1) % 8;
    				if (c == 0)
    					System.out.println();
    			}
    			p = d;
    		}
    	}
    }
}
