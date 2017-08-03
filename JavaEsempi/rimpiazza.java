import java.util.Scanner;
public class rimpiazza
{
	public static void main (String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Questo programma inverte le parole di una frase ");
		System.out.println(" ");
		//String s="la casa di vicino";
		System.out.print("Dimmi la frase = ");
		String s=input.nextLine();
		s=s+" ";
		System.out.print("Che parola vuoi sostituire = ");
		String sost=input.nextLine();
		//String sost="di";
		System.out.print("Con quale parola vuoi sostituirla = ");
		String dasost=input.nextLine();
		//String dasost="del";
		int i=0;
		String finale="";
		String parola="";
		while (i<s.length())
		{
			if(s.charAt(i)!=' ')
				parola=parola+s.charAt(i);
			else
			{
				if(parola.equals(sost))
				{finale=finale+dasost+" ";
					parola="";
				}
				else
				{finale=finale+parola+" ";
				parola="";
				}
			}
		i=i+1;
		}
System.out.println("la frase finale è = "+finale);
	}
}