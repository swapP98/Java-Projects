public class Numeri99
{
   public static void main(String[] args)
   {
    int d;
    int u;
    for (int n=1; n<100; n++)
     	d=n/10;
     	u= n % 10;
     	switch (d)
     	{
     		case 1: System.out.println("dieci");
                  break;
         case 2: System.out.println("venti");
                  break;
         case 3: System.out.println("trenta");
                  break;
         case 4: System.out.println("quaranta");
                  break;
         case 5: System.out.println("cinquanta");
                  break;
         case 6: System.out.println("sesanta");
                  break;
         case 7: System.out.println("settant");
                  break;
         case 8: System.out.println("ottanta");
                  break;
         case 9: System.out.println("novanta");
 		}
 		for (int u=0; u<99; u++)
 			switch (u)
 			{
 				case 1: System.out.println("uno");
                  break;
         case 2: System.out.println("due");
                  break;
         case 3: System.out.println("tre");
                  break;
         case 4: System.out.println("quattro");
                  break;
         case 5: System.out.println("cinque");
                  break;
         case 6: System.out.println("sei");
                  break;
         case 7: System.out.println("sette");
                  break;
         case 8: System.out.println("otto");
                  break;
         case 9: System.out.println("nove");
                  break;
 			}
    	}
}
