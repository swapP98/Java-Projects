import java.util.Scanner;
public class Frase
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String frase=input.nextLine();		//inserimento della frase
		int ncart=frase.length();				//conteggio caratteri
		int nvocali=0;
		int nconsonanti=0;
		int z;
		System.out.println("numero caratteri " + ncart);
		for (int i=0; i<ncart; i++)
		switch (frase.charAt(i))
		{	case 'a':nvocali++; break;
			case 'e':nvocali++; break;
			case 'i':nvocali++; break;
			case 'o':nvocali++; break;
			case 'u':nvocali++; break;
			default: nconsonanti++;
		}
		System.out.print("numero vocali " + nvocali);
		System.out.print("numero consonati " + nconsonanti);
	}
}





//		int indspazio=0;
//		int indfrase=1;
//	String spazio="\u00A0";
//		if (frase==spazio)
//			indfrase++;
//			indspazio++;
//		System.out.println("indspazio " + indspazio + "indfrase " + indfrase );