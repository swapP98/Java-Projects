
//Versione 2.0


public class Numeri999
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
				case 11: System.out.println("undici");break;
				case 12:System.out.println("dodici");break;
				case 13:System.out.println("tredici");break;
				case 14:System.out.println("quattordici");break;
				case 15:System.out.println("quindici");break;
				case 16:System.out.println("sedici");break;
				case 17:System.out.println("diciassette");break;
				case 18:System.out.println("diciotto");break;
				case 19:System.out.println("diciannove");break;
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
		i=i+1;
		}

	}
}