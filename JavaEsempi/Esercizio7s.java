
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**

 @author paul.swapnil
 */
public class Esercizio7s {

	/**
	 @param args the command line arguments
	 */
	public static void main(String[] args) 
	{
		ArrayList<String> arrayString = new ArrayList<String>(2);
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
		
		for(int i=0; i<arrayString.size(); i++)
		carattere = carattere + arrayString.get(i).length();
		righe = arrayString.size();
		System.out.println("I numero dei caratteri sono:" + carattere);
		System.out.println("I numero dei righe sono:" + righe);
	}
}
//C:\Users\Swapnil\Desktop\a.txt