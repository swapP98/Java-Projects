import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Esercizio8s 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arrayString = new ArrayList<String>(2);
		String[] str = new String[1];
		Scanner input = new Scanner(System.in);
		System.out.println("Digitare nome percorso del file input: ");
		String nomePercorsoFile = "C:\\Users\\Swapnil\\Desktop\\a.txt"; //input.nextLine();
			if(nomePercorsoFile.length()==0)
				return;
			int carattere=0;
			int righe=0;
		File file = new File(nomePercorsoFile);
		try
		{
			Scanner f = new Scanner(file);
			while(f.hasNextLine())
			{
				arrayString.add(f.nextLine());
			}
				f.close();
				arrayString.trimToSize();
		}
		catch (FileNotFoundException e1)
		{
			// TODO Auto-generated catch block
			System.out.println("Nome percorso non valido!");
			return ;
		}	
		
		System.out.println(arrayString);
	}
}
