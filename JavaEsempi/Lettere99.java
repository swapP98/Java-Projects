/**	Author: Swapnil Paul
*	Date of creation: 22/10/2014
*	Version: beta 2.0
*/

public class Lettere99
{
	public static void main(String[] args)
	{
		for (int n=1; n<=99; n++)
		{
			int d = (n/10)%10;
     		int u = n%10;
			if (u != 0)
			{
				switch (d)
				{	case 1:System.out.print("dieci");break;
					case 2:System.out.print("venti");break;
					case 3:System.out.print("trenta");break;
					case 4:System.out.print("quaranta");break;
					case 5:System.out.print("cinquanta");break;
					case 6:System.out.print("sessanta");break;
					case 7:System.out.print("settanta");break;
					case 8:System.out.print("ottanta");break;
					case 9:System.out.print("novanta");break;
				}
				switch(u)
				{	case 1:System.out.println("uno");break;
					case 2:System.out.println("due");break;
					case 3:System.out.println("tre");break;
					case 4:System.out.println("quattro");break;
					case 5:System.out.println("cinque");break;
					case 6:System.out.println("sei");break;
					case 7:System.out.println("sette");break;
					case 8:System.out.println("otto");break;
					case 9:System.out.println("nove");break;
					case 10:System.out.print("dieci");break;
				}
			}
			else
				switch (d)
				{	case 1:System.out.println("dieci");break;
					case 2:System.out.println("venti");break;
					case 3:System.out.println("trenta");break;
					case 4:System.out.println("quaranta");break;
					case 5:System.out.println("cinquanta");break;
					case 6:System.out.println("sessanta");break;
					case 7:System.out.println("settanta");break;
					case 8:System.out.println("ottanta");break;
					case 9:System.out.println("novanta");break;
				}
	     }
	}
}