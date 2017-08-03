
//Versione 2.0


public class NumeriRomani999
{
	public static void main (String[]args)
	{	int i = 0;
		while(i <= 999)
		{  int c = i/100;
			int d = (i/10)%10;
			int u = i % 10;

			if (u != 0)
			if (d <= 19)
			{
		    switch (c)
		    {	case 1:System.out.print("C");break;
				case 2:System.out.print("CC");break;
				case 3:System.out.print("CCC");break;
				case 4:System.out.print("CD");break;
				case 5:System.out.print("D");break;
				case 6:System.out.print("DC");break;
				case 7:System.out.print("DCC");break;
				case 8:System.out.print("DCCC");break;
				case 9:System.out.print("CM");break;

			}

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
				case 10:System.out.print("X");break;

			}
			}
			else
				switch (d)
			{	case 1:System.out.println("I");break;
				case 2:System.out.println("II");break;
				case 3:System.out.println("III");break;
				case 4:System.out.println("IV");break;
				case 5:System.out.println("V");break;
				case 6:System.out.println("VI");break;
				case 7:System.out.println("VII");break;
				case 8:System.out.println("VIII");break;
				case 9:System.out.println("IX");break;
				case 10:System.out.print("X");break;
			}
		i=i+1;
		}

	}
}