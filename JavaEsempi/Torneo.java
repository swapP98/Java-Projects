/**
 * @(#)Combinazioni.java
 *
 *
 * @author
 * @version 1.00 2014/12/3
 */
import java.util.Scanner;

public class Torneo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digita il numero di partecipanti: ");
        int n = input.nextInt();
        String[] p = new String[n];
        System.out.println("Digita i nomi dei partecipanti:");
        for (int i = 0; i < n; i++)
        		p[i] = input.next();
        for (int i = 0; i < n - 1; i++)
        		for (int j = i + 1; j < n; j++)
        			System.out.println(p[i] + "\t" + p[j]);
    }
}
