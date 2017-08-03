/**	Author: Swapnil Paul
*	Date of creation: 22/10/2014
*	Version: beta 2.0
*/

public class Lettere999
{
	public static void main(String[] args)
	{
		for (int n=1; n<=999; n++)
		{
			int c = (n/100)%10;
			int d = (n/10)%10;
     		int u = n%10;
			if (d != 0)
				if ( u != 0)
			{
				switch (c)
			    {	case 1:System.out.print("cento");break;
					case 2:System.out.print("duecento");break;
					case 3:System.out.print("trecento");break;
					case 4:System.out.print("quattrocento");break;
					case 5:System.out.print("cinquecento");break;
					case 6:System.out.print("seicento");break;
					case 7:System.out.print("settecento");break;
					case 8:System.out.print("ottocento");break;
					case 9:System.out.print("novecento");break;
					}
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
						switch (c)
			    {	case 1:System.out.print("cento");break;
					case 2:System.out.print("duecento");break;
					case 3:System.out.print("trecento");break;
					case 4:System.out.print("quattrocento");break;
					case 5:System.out.print("cinquecento");break;
					case 6:System.out.print("seicento");break;
					case 7:System.out.print("settecento");break;
					case 8:System.out.print("ottocento");break;
					case 9:System.out.print("novecento");break;
				 }
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
				else
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
			 }
		}
}