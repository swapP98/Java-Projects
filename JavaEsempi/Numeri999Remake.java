/**
 * @(#)Numeri999Remake.java
 *
 *
 * @author SWAPNIL PAUL
 * @version 3.0 2014/12/12
 */

public class Numeri999Remake
{
    public static void main(String[] args)
    {
   	int u, d, c, id=10, iu=1;
       for (u=1; u<=9; u++)
       {
        	System.out.print((iu++) + "  ");
        	switch (u)
       		{
       			case 1: System.out.println("uno"); break;
       			case 2: System.out.println("due"); break;
       			case 3: System.out.println("tre"); break;
       			case 4: System.out.println("quattro"); break;
       			case 5: System.out.println("cinque"); break;
       			case 6: System.out.println("sei"); break;
       			case 7: System.out.println("sette"); break;
       			case 8: System.out.println("otto"); break;
       			case 9: System.out.println("nove"); break;
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
       						case 1: System.out.print("dieci"); break;
    	   					case 2: System.out.print("venti"); break;
    		   				case 3: System.out.print("trenta"); break;
       						case 4: System.out.print("quaranta"); break;
       						case 5: System.out.print("cinquanta"); break;
       						case 6: System.out.print("sessanta"); break;
	      	 				case 7: System.out.print("settanta"); break;
    	 	  				case 8: System.out.print("ottanta"); break;
       						case 9: System.out.print("novanta"); break;
       					}

						switch (u)
       					{
  	     					case 1: System.out.println("uno"); break;
    	   					case 2: System.out.println("due"); break;
  	    	 				case 3: System.out.println("tre"); break;
    			   			case 4: System.out.println("quattro"); break;
    		   				case 5: System.out.println("cinque"); break;
      	 					case 6: System.out.println("sei"); break;
 	      					case 7: System.out.println("sette"); break;
   				   			case 8: System.out.println("otto"); break;
       						case 9: System.out.println("nove"); break;
       					}
					}
       				else
       					switch (d)
       					{
       						case 1: System.out.println("dieci"); break;
    	   					case 2: System.out.println("venti"); break;
 	   		   				case 3: System.out.println("trenta"); break;
    	   					case 4: System.out.println("quaranta"); break;
       						case 5: System.out.println("cinquanta"); break;
       						case 6: System.out.println("sessanta"); break;
	       					case 7: System.out.println("settanta"); break;
    		   				case 8: System.out.println("ottanta"); break;
       						case 9: System.out.println("novanta"); break;
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
 	      						case 1: System.out.print("cento"); break;
    		   					case 2: System.out.print("duecento"); break;
    			   				case 3: System.out.print("trecento"); break;
       							case 4: System.out.print("quattrocento"); break;
       							case 5: System.out.print("cinquecento"); break;
       							case 6: System.out.print("seicento"); break;
	      	 					case 7: System.out.print("settecento"); break;
	    	 	  				case 8: System.out.print("ottocento"); break;
    	   						case 9: System.out.print("novecento"); break;
       						}

							switch (d)
       						{
 	      						case 1: System.out.print("dieci"); break;
    		   					case 2: System.out.print("venti"); break;
    			   				case 3: System.out.print("trenta"); break;
       							case 4: System.out.print("quaranta"); break;
       							case 5: System.out.print("cinquanta"); break;
       							case 6: System.out.print("sessanta"); break;
	      	 					case 7: System.out.print("settanta"); break;
	    	 	  				case 8: System.out.print("ttanta"); break;
    	   						case 9: System.out.print("novanta"); break;
       						}

							switch (u)
       						{
  	     						case 1: System.out.println("uno"); break;
    	   						case 2: System.out.println("due"); break;
	  	    	 				case 3: System.out.println("tre"); break;
    				   			case 4: System.out.println("quattro"); break;
    			   				case 5: System.out.println("cinque"); break;
      	 						case 6: System.out.println("sei"); break;
 	      						case 7: System.out.println("sette"); break;
   					   			case 8: System.out.println("otto"); break;
       							case 9: System.out.println("nove"); break;
       						}
						}


	       				else
	       				{

							switch (c)
       						{
 	      						case 1: System.out.print("cento"); break;
    		   					case 2: System.out.print("duecento"); break;
    			   				case 3: System.out.print("trecento"); break;
       							case 4: System.out.print("quattrocento"); break;
       							case 5: System.out.print("cinquecento"); break;
       							case 6: System.out.print("seicento"); break;
	      	 					case 7: System.out.print("settecento"); break;
	    	 	  				case 8: System.out.print("ottocento"); break;
    	   						case 9: System.out.print("novecento"); break;
       						}

							switch (d)
       						{
 	      						case 1: System.out.println("dieci"); break;
    		   					case 2: System.out.println("venti"); break;
    			   				case 3: System.out.println("trenta"); break;
       							case 4: System.out.println("quaranta"); break;
       							case 5: System.out.println("cinquanta"); break;
       							case 6: System.out.println("sessanta"); break;
	      	 					case 7: System.out.println("settanta"); break;
	    	 	  				case 8: System.out.println("ottanta"); break;
    	   						case 9: System.out.println("novanta"); break;
       						}
	       				}

						if ((d==0) && (u==0))
							System.out.print("\n");

					}
    }
}
