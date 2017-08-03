import java.util.Scanner;

public class MassimoComunDivisore {

    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Calcolo del massimo comun divisore tra due numeri interi positivi\n");
	   int a, b;
	   do {
	    	System.out.print("Primo numero:   a = ");
	   	a = input.nextInt();
	   } while (a <= 0);
	   do {
		   System.out.print("Secondo numero: b = ");
 	   	b = input.nextInt();
	   } while (b <= 0);
    	int r = 1;
    	System.out.println("\nRIGA | OPERAZIONE   |\ta\t|\tb");
    	System.out.println("-----|--------------|-------|------");
    	while (a != b)
    	{	if (a > b)
    		{	System.out.printf("%3d  | a > b\t\t|%4d\t|%4d\n", r++ ,a ,b);
    			a -= b;
    			System.out.printf("%3d  | a = a - b;\t|%4d\t|%4d\n", r++, a, b);
    		}
    		else
    		{	System.out.printf("%3d  | b > a\t\t|%4d\t|%4d\n", r++ ,a ,b);
    			b -= a;	//errore!
    			System.out.printf("%3d  | b = b - a;\t|%4d\t|%4d\n", r++, a, b);
    		}
    	}
    	System.out.println("\nIl massimo comun divisore è " + a);
    }
}
