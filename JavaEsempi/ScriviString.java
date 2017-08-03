/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrivistring;

import java.util.Scanner;

/**
 *
 * @author Swapnil
 */
public class ScriviString extends Thread{

    /**
     * @param args the command line arguments
     */
   
    char s;
	int length,colonna;
	public ScriviString(char s, int length, int colonna) {
		this.s=s;
		this.length=length;
		this.colonna=colonna;
	}
	
	public synchronized void run()
	{
		String spa = "";
		for(int i=0; i<colonna; i++)
			spa += " ";
		for(int j=0; j<length; j++)
			System.out.print(spa + s + "\n");
	}
    
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		ScriviString str = null;
		
		for(int i=0; i<s.length(); i++)
		{
			str = new ScriviString(s.charAt(i),s.length(),i);
			str.start();
		}
	}
    
}
