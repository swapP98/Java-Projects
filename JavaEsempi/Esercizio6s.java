
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.NoSuchElementException;

/**

 @author paul.swapnil
 */
public class Esercizio6s {

	/**
	 @param args the command line arguments
	 */
	public static void main(String[] args) throws NoSuchElementException {
		// TODO code application logic here
		ArrayList<String> vettore = new ArrayList<String>(2);
		ArrayList<String> paroleContate = new ArrayList<String>(2);
		ArrayList contatori = new ArrayList(2);
		Scanner input = new Scanner(System.in);
		System.out.println("Digitare nome percorso del file input: ");
		String nomePercorsoFile = input.nextLine();
			if(nomePercorsoFile.length()==0)
				return;
			int i=0;
			File file = new File(nomePercorsoFile);
		try
		{
			Scanner f = new Scanner(file);
			while(f.hasNext())
			{
				vettore.add(f.next().toString());
				i++;
			}
				//vettore.trimToSize();
				f.close();
		}
		catch (FileNotFoundException e1)
		{
			// TODO Auto-generated catch block
			System.out.println("Nome percorso non valido!");
			return ;
		}
		System.out.println(i);
	/*	boolean check = false;
		String s;
		int cont=0;
		s = vettore.get(0);
		paroleContate.add(s);
		for (i=0; i<vettore.size(); i++)
			if (s.equalsIgnoreCase(vettore.get(i)))
				cont++;
		for(i=1; i<vettore.size(); i++)
		{
			s = vettore.get(i);
			for(int j=0; j<vettore.size(); j++)
			{
				if(s.equalsIgnoreCase(paroleContate.get(j)))
				{	check=true;
				}
				paroleContate.add(vettore.get(i));
				
			}	
			
		}
		System.out.println(paroleContate);
		System.out.print(contatori);
		//System.out.print("jkaldhkasbd");*/
	} 

}//C:\Users\paul.swapnil.LAP\Desktop\a.txt

//C:\Users\Swapnil\Desktop\a.txt
