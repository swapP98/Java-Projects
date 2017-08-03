/*	Author: Swapnil Paul
*	Date of creation: 22/10/2014
*	Version: beta 2.0
*/

public class LetteraRomana99
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
				{	case 1:System.out.print("X");break;
					case 2:System.out.print("XX");break;
					case 3:System.out.print("XXX");break;
					case 4:System.out.print("XL");break;
					case 5:System.out.print("L");break;
					case 6:System.out.print("LX");break;
					case 7:System.out.print("LXX");break;
					case 8:System.out.print("LXXX");break;
					case 9:System.out.print("LXXXX");break;
				}
				switch(u)
				{	case 1:System.out.println("I");break;
					case 2:System.out.println("II");break;
					case 3:System.out.println("III");break;
					case 4:System.out.println("IV");break;
					case 5:System.out.println("V");break;
					case 6:System.out.println("VI");break;
					case 7:System.out.println("VII");break;
					case 8:System.out.println("VIII");break;
					case 9:System.out.println("IX");break;

				}
			}
			else
				switch (d)
				{	case 1:System.out.println("X");break;
					case 2:System.out.println("XX");break;
					case 3:System.out.println("XXX");break;
					case 4:System.out.println("XL");break;
					case 5:System.out.println("L");break;
					case 6:System.out.println("LX");break;
					case 7:System.out.println("LXX");break;
					case 8:System.out.println("LXXX");break;
					case 9:System.out.println("LXXXX");break;
				}
	    }
	}
}