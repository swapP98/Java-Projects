import java.util.Scanner;
import java.util.Random;
public class Gioco_del_15
{
	static void ScriviMatrice(int[][]matrice)
	{
													//STAMPA DELLA MATRICE: DA RENDERLA CENTRATA E DA INCORNICIARE LE CASELLE(RENDERLE DI UGUALE DIMENSIONE), PROVARE CON L'USO DI UN'ALTRA FUNZIONE ALL'INTERNO DI QUESTA
		for (int i=1;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{	if(matrice[i][j]==16)
					System.out.print("    ");
				else
					System.out.printf("%4d",matrice[i][j]);

			}
		System.out.println();

		}
	}

	static boolean CondizioniFine(int[][]matrice)
	{
		int numeroSuccessivo;							//SI DETERMINA UN BOOLEAN PER FAR TERMINARE IL CICLO IN BASE ALL' ORDINE CRESCENTE CHE DOVRA AVERE LA MATRICE,
		boolean check=true;								//PERCIò LO SPAZIO VUOTO, PER SEMPLICITA VIENE DICHIARATO COME 16 E POI RESO INVISIBILE ALLA STAMPA DELLA MATRICE
		for(int i=1;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				if((i==4)&&(j==3))
					continue;
				if(j==3)
					numeroSuccessivo=matrice[i+1][1];
				else
					numeroSuccessivo=matrice[i][j+1];

				if(numeroSuccessivo==(matrice[i][j]+1))
					check=true;
				else
				{
					check=false;
					break;
				}

			}

		}
		return check;

	}

	//INIZIO MAIN
	//ALL INTERNO DEL MAIN OLTRE ALLE CHIAMATE DELLE FUNZIONI, è PRESENTE L'ALGORITMO PER LO SCAMBIO CON IL POSTO VUOTO (EVENTUALMENTE DA RENDERE PROCEDURA)
    public static void main(String[] args)
    {
    	int [][] tabella=new int[5][4];

    								/*	{				//INIZIALIZZAZIONE MATRICE
    									{0,0,0,0},
    									{1,2,3,4},
    									{5,6,7,8},
    									{9,10,11,12},
    									{13,14,15,16},
    									};*/

    		Random random=new Random();
    		int r=1;
    		int c=0;
    		for(int i=1;i<=16;i++)
    		{
				while(tabella[r][c]!=0)
				{
					r=random.nextInt(4)+1;
					c=random.nextInt(4);
				}
					tabella[r][c]=i;
    		}

    	int numeroSelezionato;
     	Scanner input =new Scanner(System.in);

		ScriviMatrice(tabella);
		int contatore=0;



		while(CondizioniFine(tabella)==false)					//INIZIO CUORE CODICE
		{

			contatore++; //IL CONTATORE SERVIRà PER DIRE ALL' UTENTE IN QUANTE MOSSE HA VINTO(SAREBBE MEGLIO USARE IL TEMPO)
			do
			{
				System.out.print("Scrivi il numero che vuoi spostare: ");
				numeroSelezionato=input.nextInt();
			}
			while((numeroSelezionato<0)||(numeroSelezionato>15));

			 	for(int i=1;i<5;i++)
			 		for(int j=0;j<4;j++)						//RICERCA DEGLI INDICI CHE LOCALIZZANO LO SPAZIO E IL NUMERO, INSERITI PER COMODITà NELLA PRIMA RIGA DELLA MATRICE(NON VISUALIZZATA)
			 		{
						if(tabella[i][j]==numeroSelezionato)
						{
							tabella[0][0]=i;
							tabella[0][1]=j;
						}
						if(tabella[i][j]==16)
						{
						tabella[0][2]=i;
						tabella[0][3]=j;
						}
			 		}

			if((((Math.abs(tabella[0][0]-tabella[0][2]))==1)||((Math.abs(tabella[0][0]-tabella[0][2]))==0))		//SE LA DIFFERENZA IN VALORE ASSOLUTO TRA LE "COORDINATE" DELLE CASELLE Dà 1 DI RIGA E 0 DI COLONNA O VICEVERSA, ALLORA SIGNIFICA CHE SONO ADIACENTI
				&&(((Math.abs(tabella[0][1]-tabella[0][3]))==0)||(Math.abs(tabella[0][1]-tabella[0][3])==1)))
			{
				int scambio=tabella[tabella[0][0]] [tabella[0][1]];	//SI PROCEDE QUINDI ALLO SCAMBIO
				tabella[tabella[0][0]] [tabella[0][1]]=16;
				tabella[tabella[0][2]] [tabella[0][3]]=scambio;

			}
			else
				System.out.println("\nE' impossibile spostare questo numero, si possono scambiare con lo spazio vuoto solo le coppie adiacenti\n"); //SE LA DIFFERENZA TRA LE COORDINATE Dà VALORI DIVERSI TRA 0 E 1 ALLORA NON SONO ADIACENTI, PERCIò L'UTENTE HA SBAGLIATO

			ScriviMatrice(tabella);
		}
		System.out.println("\n\t\t\t\tHAI VINTO!!!\n\n Mosse impiegate: "+contatore+".");
    }
}
