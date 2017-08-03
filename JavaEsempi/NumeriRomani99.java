
//Versione 2.0


public class NumeriRomani99
{
	public static void main (String[]args)
	{	int i=0;
		while(i<=99)
		{	int d = (i/10)%10;
			int u = i % 10;

			if (u != 0)
			if (d<=19)
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
				case 9:System.out.println("VIIII");break;
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
				case 9:System.out.println("VIIII");break;
				case 10:System.out.print("X");break;
			}
		i=i+1;
		}

	}
}