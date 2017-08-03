import java.util.Scanner;
public class ContaParole
{
    public static void main(String[] args)
    {
    	System.out.println("Questo programma conta le parole di una linea di testo digitato");
    	Scanner input = new Scanner(System.in);
    	System.out.print("Digitare una linea di testo: ");
    	String text = input.nextLine();
    	boolean word = false;
    	int n = 0;
    	for (int i = 0; i < text.length(); i++)
    	{	if (Character.isWhitespace(text.charAt(i)))
    			if (word)
    				word = false;
    			else ;
    		else
    			if (!word)
    			{	n++;
    				word = true;
    			}
    	}
    	System.out.println("Le parole del testo digitato sono " + n);
    }
}
