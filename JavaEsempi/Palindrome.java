/**
 *	Author:	Swapnil Paul
 *	Name Porgram:	Inverso
 *	Date:	 12/11/2014
 * Version: 1.0
*/

import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		boolean palindrome=true;
		for(int i=0, j=s.length()-1;palindrome;i++,j--)
			if(i>=j) break;
			else palindrome=s.charAt(i)==s.charAt(j);
				System.out.println("Palindrome " + palindrome);

	}
}