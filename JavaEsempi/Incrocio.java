/**
 * @(#)Incrocio.java
 *
 *
 * @author Matei Artemon
 * @version 1.00 2014/11/27
 */
 import java.util.Scanner;
public class Incrocio
{
    public static void main(String[] args)
    {
      Scanner input=new Scanner(System.in);
      System.out.print("Questo programma incrocia le parole di due frasi \n");O
		System.out.print("Dimmi la prima frase: ");
		String f1=input.nextLine();
		f1=f1+" ";
		System.out.print("Dimmi la seconda frase: ");
		String f2=input.nextLine();
		f2=f2+" ";
		int i=0;
		String finale="f1+f2";
		String parola="";
		System.out.print(f1+f2);
    }
}
