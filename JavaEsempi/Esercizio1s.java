/*
 *  Program name: Esercizio1.java
 *  Date: 18/09/2015
 *  Author: Swapnil Paul 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio1s
{
	public static void main(String[] args)
	{
		ArrayList<String> vettore = new ArrayList<String>(2);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digitare nome percorso del file input: ");
		String nomePercorsoFile = input.nextLine();
			if(nomePercorsoFile.length()==0)
				return;
		File file = new File(nomePercorsoFile);
		try 
		{
			Scanner f = new Scanner(file);
			while(f.hasNextLine())
				vettore.add(f.nextLine().toString());
				vettore.trimToSize();
				f.close();
		}
		catch (FileNotFoundException e1) 
		{
			// TODO Auto-generated catch block
			System.err.println("Nome percorso non valido!");
			return ;
		}
		
		System.out.println("Digitare nome percorso del file output: ");
		String nomePercorsoFileSecondo = input.nextLine();
		if(nomePercorsoFileSecondo.length()==0)
			return;
		File fileSecondo = new File(nomePercorsoFileSecondo);
		if(fileSecondo.exists()==false)
			try 
			{
				fileSecondo.createNewFile();
				System.out.println("File creato con successo!");
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		try 
		{
			PrintStream outputFile = new PrintStream(fileSecondo);
			for(int i=vettore.size()-1; i>=0; i--)
				outputFile.println(vettore.get(i));
			System.out.println("Operazione riuscita con successo!");
				outputFile.close();
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			System.err.println("Nome percorso non valido!");
			return ;
		}
		
	}
}
//C:\Users\Swapnil\Desktop\as.txt