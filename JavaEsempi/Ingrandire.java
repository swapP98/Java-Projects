/**
 *	Author:	Swapnil Paul
 *	Name Porgram:	Inverso
 *	Date:	 12/11/2014
 * Version: 1.0
*/

import java.util.Scanner;
public class Ingrandire
{
	public static void main (String[] args)
	{
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		for(int i=s.length()-1;i<=0;i++)
			System.out.print(s.charAt(i));
	}
}