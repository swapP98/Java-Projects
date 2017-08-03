/*	Author : Swapnil Paul
 *	Date : 15/02/2015
 *	Program name : TorreDiHanoi
 */

import java.util.Scanner;
public class TorreDiHanoi
{
	static void hanoi (int n, char s, char d, char t)	//i paletti ==> s=sorgente; d=destinazione; t=temporaneo
	{
		if(n==0)
			return;
		hanoi(n-1, s, t, d);
		System.out.println("Sposta il disco da " + s + " a " + d);
		hanoi(n-1, t, d, s);
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire il numero di dischi ");
		int n = input.nextInt();

		hanoi(n, 'A', 'B', 'C');

	}
}