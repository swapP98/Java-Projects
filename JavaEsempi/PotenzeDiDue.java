//	Visualizza il valore delle prime n potenze di due

import java.util.Scanner;

public class PotenzeDiDue
{
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Numero delle potenze di due da visualizzare: ");
    	int n = input.nextInt();
    	double p = 1;
    	for (int i = 1; i <= n; i++)
    	{	p = p * 2;
    		System.out.println(i + "\t\t" + p);
    	}
    }
}
