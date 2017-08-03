//	Tavola Pitagorica dei numeri da 1 a 10

public class TavolaPitagorica
{
    public static void main(String[] args)
    {
    	System.out.println("Tavola Pitagorica dei numeri da 1 a 10:\n");
    	for (int i = 1; i <= 10; i++)
    		for (int j = 1; j <= 10; j++)
    		{	System.out.print(i * j);
    			if (j == 10)
    				System.out.println();
    			else
    				System.out.print("\t");
    		}
    }
}
