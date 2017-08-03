import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Esercizio5s 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int cont=0;
		System.out.println("Digitare nome percorso del file input: ");
		String nomePercorsoFile = input.nextLine();
			if(nomePercorsoFile.length()==0)
				return;
		File file = new File(nomePercorsoFile);
		try 
		{
			Scanner f = new Scanner(file);
			while(f.hasNext())
			{
				f.next();
				cont++;
			}
				f.close();
		}
		catch (FileNotFoundException e1) 
		{
			// TODO Auto-generated catch block
			System.err.println("Nome percorso non valido!");
			return ;
		}
		
		System.out.println("Il numero di parole del file di testo sono: " + cont);
	}
}
