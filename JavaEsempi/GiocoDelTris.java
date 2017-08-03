/*	Author : SWAPNIL PAUL
 *	Program name : GiocoDelTRis
 *	Date: 26/02/2015
 *	Version : 3.0
 */

import java.util.Scanner;
public class GiocoDelTris
{
	//INIZIALIZZAIONE DELLA TABELLA (TABELLA VUOTA)
	 static char[][] tabellaTris ={
	 								{' ', ' ', ' '},
									{' ', ' ', ' '},
									{' ', ' ', ' '}
	 												};

	//TABELLA_TRIS
		static void stampaTabella (char[][] tabellaTris)
		{
			int contSpazio = 0;
			int r,c;
			boolean impostazioneTabella = false;
			for (r=0; r<3; r++)
				for(c=0; c<3; c++)
				{
					System.out.print(tabellaTris[r][c] + "  ");
					contSpazio++;

					if(contSpazio==3)
					{
						impostazioneTabella = true;
						contSpazio = 0;
						if(impostazioneTabella==true)
							System.out.println();
					}
				}
		 }

		 //CONDIZIONI DI VITTORIA
		 static boolean controlloVittoria (char[][] tabellaTris)
		 {
		 	boolean controllo = false;
		 	boolean controlloSpazio = false;
			boolean progInEsec=true;
			int r,c;
			for (r=0; r<3; r++)
				for(c=0; c<3; c++)
				{
					if (tabellaTris[r][c]==' ')
						controlloSpazio = false;
					else
						controlloSpazio = true;
				}

		 	if ((tabellaTris[0][0]==tabellaTris[0][1])&&(tabellaTris[0][1]==tabellaTris[0][2])||
		 		(tabellaTris[1][0]==tabellaTris[1][1])&&(tabellaTris[1][1]==tabellaTris[1][2])||
		 		(tabellaTris[2][0]==tabellaTris[2][1])&&(tabellaTris[2][1]==tabellaTris[2][2])||
		 		(tabellaTris[0][0]==tabellaTris[1][0])&&(tabellaTris[1][0]==tabellaTris[2][0])||
		 		(tabellaTris[0][1]==tabellaTris[1][1])&&(tabellaTris[1][1]==tabellaTris[2][1])||
		 		(tabellaTris[0][2]==tabellaTris[1][2])&&(tabellaTris[1][2]==tabellaTris[2][2])||
		 		(tabellaTris[0][0]==tabellaTris[1][1])&&(tabellaTris[1][1]==tabellaTris[2][2])||
		 		(tabellaTris[0][2]==tabellaTris[1][1])&&(tabellaTris[1][1]==tabellaTris[2][0])
		 																					)
		 		 controllo = true;
		 		 if ((controllo==true)&&(controlloSpazio==true))
		 		 {
					System.out.print("HAI VINTO!!");
		 		 	System.exit(0);
		 		 }
				return progInEsec;
		}

	//CONTROLLO INSERIMENTO GIOCATORE 1
	static void controlInserimentoGIOC1 (int riga, int colonna)
	{
		Scanner input = new Scanner(System.in);
		boolean controlInserimento=true;
		if((tabellaTris[riga][colonna]=='X')||(tabellaTris[riga][colonna]=='O'))
			{
				do
				{
					System.out.print("Inserire nuovamente il numero della riga:  ");
					riga = input.nextInt();
					System.out.print("Inserire nuovamente il numero della colonna:  ");
					colonna = input.nextInt();

					if(tabellaTris[riga][colonna]==' ')
					{
						controlInserimento=false;
						tabellaTris[riga][colonna] = 'X';
					}
					else
					{
						tabellaTris[riga][colonna] = 'O';
						controlInserimentoGIOC1 (riga,colonna);
					}
				}
				while(controlInserimento=false);
			}
	}

	//CONTROLLO INSERIMENTO GIOCATORE 2
	static void controlInserimentoGIOC2 (int riga, int colonna)
	{
		Scanner input = new Scanner(System.in);
		boolean controlInserimento=true;
		if((tabellaTris[riga][colonna]=='X')||(tabellaTris[riga][colonna]=='O'))
			{
				do
				{
					System.out.print("Inserire nuovamente il numero della riga:  ");
					riga = input.nextInt();
					System.out.print("Inserire nuovamente il numero della colonna:  ");
					colonna = input.nextInt();

					if(tabellaTris[riga][colonna]==' ')
					{
						controlInserimento=false;
						tabellaTris[riga][colonna] = 'O';
					}
					else
					{
						tabellaTris[riga][colonna] = 'X';
						controlInserimentoGIOC2 (riga,colonna);
					}
				}
				while(controlInserimento=false);
			}
	}

	//METODO MAIN
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean controlInserimento=true;
		int contMosse = 9;
		int i,j,r,c;

		while((controlloVittoria(tabellaTris)==true)||(contMosse==0))
		{
			int colonna, riga;

			///GIOCATORE 1
			System.out.println("GIOCATORE 1");
			System.out.print("Inserire il numero della riga:  ");
			riga = input.nextInt();
			System.out.print("Inserire il numero della colonna:  ");
			colonna = input.nextInt();
			controlInserimentoGIOC1(riga,colonna);
			if((tabellaTris[riga][colonna] == ' ')||(tabellaTris[riga][colonna] != 'O')||(tabellaTris[riga][colonna] == 'X'))
			tabellaTris[riga][colonna] = 'X';
			stampaTabella(tabellaTris);
			contMosse--;
			controlloVittoria(tabellaTris);


			///GIOCATORE 2
			System.out.println("GIOCATORE 2");
			System.out.print("Inserire il numero della riga:  ");
			riga = input.nextInt();
			System.out.print("Inserire il numero della colonna:  ");
			colonna = input.nextInt();
			controlInserimentoGIOC2(riga,colonna);
			if((tabellaTris[riga][colonna] == ' ')||(tabellaTris[riga][colonna] == 'O')||(tabellaTris[riga][colonna] != 'X'))
			tabellaTris[riga][colonna] = 'O';
			stampaTabella(tabellaTris);
			contMosse--;
			controlloVittoria(tabellaTris);


			if (contMosse==0)
				System.out.println("NESSUNO DEI DUE HA VINTO!!!");
		}
	}
}