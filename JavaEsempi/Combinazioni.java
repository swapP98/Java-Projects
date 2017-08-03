/**
 * @(#)Combinazioni.java
 *
 *
 * @author
 * @version 1.00 2014/12/3
 */
import java.util.Scanner;

public class Combinazioni {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digita il numero di elementi: ");
        int n = input.nextInt();
        char[] c = new char[n];
        for (int i = 0; i < n; i++)
        		c[i] = (char) ('A' + i);
        for (int i = 0; i < n - 1; i++)
        		for (int j = i + 1; j < n; j++)
        			System.out.printf("%c %c\n", c[i], c[j]);
    }
}
