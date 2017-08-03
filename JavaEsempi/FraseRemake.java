import java.util.Scanner;
public class FraseRemake
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire la frase: ");
		String frase = input.nextLine();
		int i,j,k;

		int carat = frase.length();
		System.out.println("I numeri dei caratteri sono: " + carat);

		boolean parola = false;
		int indiceparola = 0;
		for ( i=0; i<carat; i++)
		if (frase.charAt(i)==' ')
			parola=false;
		else if (!parola)
		{
			indiceparola++;
			parola=true;
		}
		System.out.println("Numeri di parola nella frase sono: " + indiceparola);


		int indicespazio = 0;
		for (i=0; i<carat; i++)
		{
			if (frase.charAt(i)==' ')
				indicespazio++;
		}
		System.out.println("I numeri degli spazi sono: " + indicespazio);

		int indicevocali = 0;
		for (i=0; i<carat; i++)
 		switch(frase.charAt(i))
 		{
 			case 'a':indicevocali++; break;
 			case 'e':indicevocali++; break;
 			case 'i':indicevocali++; break;
 			case 'o':indicevocali++; break;
 			case 'u':indicevocali++; break;

 		}
		System.out.println("I numeri delle vocali trovati con SWITCH sono: " + indicevocali);

		int voc=0;
		char[] v= new char[]{'a','e','i','o','u'};
		for (j=0;j<5; j++)
		for (i=0; i<carat; i++)
		{
			if (frase.charAt(i)==v[j])
				voc++;

		}
		System.out.println("I nuemri delle vocali trovati con ARRAY sono: " + voc);

		int cons=0;
		char[] c= new char[]{'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		for (i=0; i<carat; i++)
		for ( k=0;k<21;k++)
		{
			if (frase.charAt(i)==c[k])
			cons++;
		}
		System.out.println("I nuemri delle consonanti trovati con ARRAY sono: " + cons);

		int interuzioni = 0;
		char[] interz = new char[]{'!', '"', '%','?','/'};
		for (i=0; i<carat; i++)
		for (int g=0; g<5; g++)
		{
			if(frase.charAt(i)==interz[g])
				interuzioni++;
		}
		System.out.println("Il numero delle interuzioni trovati con ARRAY sono: " + interuzioni);

		int cifre = 0;
		int[] num = new int[]{'1','2','3','4','5','6','7','8','9','0'};
		for(i=0; i<carat; i++)
		for (int l=0; l<10; l++)
		{
			if(frase.charAt(i)==num[l])
				cifre++;
		}
		System.out.println("Il numero di cifre sono: " + cifre );

		System.out.println(frase.toUpperCase());
	}
}


















