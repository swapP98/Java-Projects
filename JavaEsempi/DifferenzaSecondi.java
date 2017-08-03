import java.util.Scanner;

public class DifferenzaSecondi
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Digitare la ora 1: ");
		int ore1=input.nextInt();
		System.out.print("Digitare i minuti 1: ");
		int min1=input.nextInt();
		System.out.print("Digitare i secondi 1: ");
		int sec1=input.nextInt();
		System.out.print("Digitare la ora 2: ");
		int ore2=input.nextInt();
		System.out.print("Digitare i minuti 2: ");
		int min2=input.nextInt();
		System.out.print("Digitare i secondi 2: ");
		int sec2=input.nextInt();

		int	secondo1= (ore1*3600) + (min1+60) + (sec1);
		int	secondo2= (ore2*3600) + (min2+60) + (sec2);
		int diff= secondo1 - secondo2;
		System.out.print("La differenza tra secondi: " + secondo1 + "-" + secondo2 + "=" + diff);


	}

}