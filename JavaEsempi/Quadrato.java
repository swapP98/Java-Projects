import java.util.Scanner;

public class Quadrato {	//Calcolo del quadrato di un numero.

    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	long n;
    	while (true)
    	{	System.out.print("Digitare un numero intero senza segno:   ");
    		n = input.nextLong();
    		if (n <= 0) break;
    		long q = 0;
    		for (long i = 1; i <= n; i++)
    			q += i + i - 1;
    		System.out.println("Il quadrato del numero intero digitato è " + q);
    	}
    }
}
