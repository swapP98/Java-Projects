/*
 *  Program name: Esercizio1.java
 *  Date: 18/09/2015
 *  Author: Swapnil Paul 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Esercizio4s
{
	public static void main(String[] args)
	{
		ArrayList<String> vettore = new ArrayList<String>(2);
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
		
		String[] line = new String[vettore.size()];
		for(int l=0; l<line.length; l++)
			line[l]= vettore.get(l);
		
		line = ordinamento(line);
		for(int g=0; g<line.length; g++)
			System.out.println(line[g]);
		
		try 
		{
			PrintStream outputFile = new PrintStream(fileSecondo);
			for(int i=0; i<line.length; i++)
				outputFile.println(line[i]);
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
	
	public static String[] ordinamento (String[] s)
	{
		for(int i=1; i<s.length; i++)
		{
			
			String v=s[i];
			int j;
			for(j=i-1; j>=0; j--)
				if(s[j].length()>s[i].length())
					s[j+1]=s[j];
				else break;
			s[j+1]=v;
			
		}
		return s;
	}
}
//C:\Users\Swapnil\Desktop\as.txt