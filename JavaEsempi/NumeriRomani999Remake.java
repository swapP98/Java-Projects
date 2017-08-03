/**
 * @(#)Numeri999Remake.java
 *
 *
 * @author SWAPNIL PAUL
 * @version 3.0 2014/12/12
 */

public class NumeriRomani999Remake
{
    public static void main(String[] args)
    {
   	int u, d, c, id=10, iu=1;
       for (u=1; u<=9; u++)
       {
        	System.out.print((iu++) + "  ");
        	switch (u)
       		{
       			case 1: System.out.println("I"); break;
       			case 2: System.out.println("II"); break;
       			case 3: System.out.println("III"); break;
       			case 4: System.out.println("IV"); break;
       			case 5: System.out.println("V"); break;
       			case 6: System.out.println("VI"); break;
       			case 7: System.out.println("VII"); break;
       			case 8: System.out.println("VIII"); break;
       			case 9: System.out.println("IX"); break;
       		}
		}

		for (d=1; d<=9; d++)
			for (u=0; u<=9; u++)
				{
					System.out.print((id++) + " ");
					if (u!=0)
					{
						switch (d)
       					{
       						case 1: System.out.print("X"); break;
    	   					case 2: System.out.print("XX"); break;
    		   				case 3: System.out.print("XXX"); break;
       						case 4: System.out.print("XL"); break;
       						case 5: System.out.print("L"); break;
       						case 6: System.out.print("LX"); break;
	      	 				case 7: System.out.print("LXX"); break;
    	 	  				case 8: System.out.print("LXXX"); break;
       						case 9: System.out.print("XC"); break;
       					}

						switch (u)
			       		{
			       			case 1: System.out.println("I"); break;
			       			case 2: System.out.println("II"); break;
			       			case 3: System.out.println("III"); break;
			       			case 4: System.out.println("IV"); break;
			       			case 5: System.out.println("V"); break;
			       			case 6: System.out.println("VI"); break;
			       			case 7: System.out.println("VII"); break;
			       			case 8: System.out.println("VIII"); break;
			       			case 9: System.out.println("IX"); break;
			       		}
					}
       				else
						switch (d)
       					{
       						case 1: System.out.println("X"); break;
    	   					case 2: System.out.println("XX"); break;
    		   				case 3: System.out.println("XXX"); break;
       						case 4: System.out.println("XL"); break;
       						case 5: System.out.println("L"); break;
       						case 6: System.out.println("LX"); break;
	      	 				case 7: System.out.println("LXX"); break;
    	 	  				case 8: System.out.println("LXXX"); break;
       						case 9: System.out.println("XC"); break;
       					}

				}

			for (c=1; c<=9; c++)
				for (d=0; d<=9; d++)
					for (u=0; u<=9; u++)
					{
						System.out.print((id++) + " ");
						if (u!=0)
						{

							switch (c)
       						{
 	      						case 1: System.out.print("C"); break;
    		   					case 2: System.out.print("CC"); break;
    			   				case 3: System.out.print("CCC"); break;
       							case 4: System.out.print("CD"); break;
       							case 5: System.out.print("D"); break;
       							case 6: System.out.print("DC"); break;
	      	 					case 7: System.out.print("DCC"); break;
	    	 	  				case 8: System.out.print("DCCC"); break;
    	   						case 9: System.out.print("CM"); break;
       						}

							switch (d)
	       					{
	       						case 1: System.out.print("X"); break;
	    	   					case 2: System.out.print("XX"); break;
	    		   				case 3: System.out.print("XXX"); break;
	       						case 4: System.out.print("XL"); break;
	       						case 5: System.out.print("L"); break;
	       						case 6: System.out.print("LX"); break;
		      	 				case 7: System.out.print("LXX"); break;
	    	 	  				case 8: System.out.print("LXXX"); break;
	       						case 9: System.out.print("XC"); break;
	       					}

							switch (u)
				       		{
				       			case 1: System.out.println("I"); break;
				       			case 2: System.out.println("II"); break;
				       			case 3: System.out.println("III"); break;
				       			case 4: System.out.println("IV"); break;
				       			case 5: System.out.println("V"); break;
				       			case 6: System.out.println("VI"); break;
				       			case 7: System.out.println("VII"); break;
				       			case 8: System.out.println("VIII"); break;
				       			case 9: System.out.println("IX"); break;
				       		}
						}

	       				else
	       				{

							switch (c)
       						{
 	      						case 1: System.out.print("C"); break;
    		   					case 2: System.out.print("CC"); break;
    			   				case 3: System.out.print("CCC"); break;
       							case 4: System.out.print("CD"); break;
       							case 5: System.out.print("D"); break;
       							case 6: System.out.print("DC"); break;
	      	 					case 7: System.out.print("DCC"); break;
	    	 	  				case 8: System.out.print("DCCC"); break;
    	   						case 9: System.out.print("CM"); break;
       						}

							switch (d)
	       					{
	       						case 1: System.out.println("X"); break;
	    	   					case 2: System.out.println("XX"); break;
	    		   				case 3: System.out.println("XXX"); break;
	       						case 4: System.out.println("XL"); break;
	       						case 5: System.out.println("L"); break;
	       						case 6: System.out.println("LX"); break;
		      	 				case 7: System.out.println("LXX"); break;
	    	 	  				case 8: System.out.println("LXXX"); break;
	       						case 9: System.out.println("XC"); break;
	       					}
	       				}

						if ((d==0) && (u==0))
							System.out.print("\n");

					}
    }
}
