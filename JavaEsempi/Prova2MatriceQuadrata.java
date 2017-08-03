/** Matrice di interi costruita come array di array.

    Il tipo di un array di elementi di tipo <tipo_x>
    e` <tipo_x>[], per cui un array di int e` int[],
    un array di String e` String[], un array di real e` real[], ecc.
    Allora un array di array di interi (dove <tipo_x>=int[])
    sara` int[][]. Scegliamo l'array piu' esterno per indicizzare
    le righe. Avremmo potuto fare la scelta simmetrica, ma la nostra
    segue una convenzione accettata.

    IMPORTANTE! Notate che il concetto di matrice e l'array di
    array non sono equivalenti, infatti con l'array di array si possono
    creare strutture diverse da quella matriciale, si veda il punto (***)
    nel programma. Occorrera` trovare un modo per avere un vero tipo di
    dato astratto (ADT) 'matrice', che impedisce manipolazioni non corrette
    della matrice. Vedremo come fare usando gli oggetti.

    AGGIUNTE: in questa versione c'e` anche la soluzione all'esercizio sulla stampa
    delle diagonali e del prodotto tra matrici (visto alla lavagna durante la
    lezione del 20 12 2010).
 */

import java.util.* ;

public class Prova2MatriceQuadrata {

  public static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

     int[][] m;

     m = new int[4][8];

     // assegnamo 1 a ciascun elemento
     // riga per riga
     for (int i=0; i<4; i++)
      for (int j=0; j<8; j++)
        m[i][j] = 1;

     // stampiamo ciascun elemento
     // riga per riga
     for (int i=0; i<4; i++) {
	  for (int j=0; j<8; j++)
       System.out.print(m[i][j]+" ");
      System.out.println(); // vado a capo dopo ogni riga
     }

     // assegnamo 1 a ciascun elemento
	 // colonna per colonna (vers. 1).
	 // Anche se i nomi delle variabili
	 // locali ai cicli (i e j) non contano,
	 // in questa versione seguiamo comunque
	 // la convenzione di usare j per le colonne
	 // e i per le righe.
	 for (int j=0; j<8; j++)
	  for (int i=0; i<4; i++)
	         m[i][j] = 1;

     // assegnamo 1 a ciascun elemento
	 // colonna per colonna (vers. 2).
	 // Qui usiamo i per le colonne e
	 // j per le righe.
	 for (int i=0; i<8; i++)
	   for (int j=0; j<4; j++)
	         m[j][i] = 1;


     System.out.println();
     // stampiamo ciascun elemento
	 // riga per riga
	 for (int i=0; i<4; i++) {
	  for (int j=0; j<8; j++)
	   System.out.print(m[i][j]+" ");
	  System.out.println(); // vado a capo dopo ogni riga
     }


     // (***) quello che segue lo rivedremo piu'
     // avanti, dopo aver introdotto gli oggetti
     //m[1] = new int[1];
     //in questo modo, la riga indicizzata con 1
     //diventa di una sola una colonna, anziche'
     //di 8, per cui m non e` piu' una matrice!
     //Come conseguenza, non e` piu' vero che
     //per le colonne possiamo usare qualsiasi
     //elemento m[k], 0 <= k <= m.length-1.

     System.out.println("\n\nProviamo i metodi:\n");

     int[][] miam = creaMatrice();
     stampaMatrice(miam);
     stampaDiagonali(miam);
     int[][] tuam = creaMatrice();
     stampaMatrice(tuam);
     int[][] prod = prodotto(miam,tuam);
     //int[][] prod = prodottoCompatto(miam,tuam);
     if(prod.length==0) System.out.println("\nNon e` stato possibile calcolare il prodotto!");
     else {
	  System.out.println("\nLa matrice prodotto e`:");
      stampaMatrice(prod);
     }
   }// fine main


   public static int[][] creaMatrice() {

	int[][] matrice;
	int n;     //righe
	int m;     //colonne

	System.out.println("Specifica il numero di righe:");
	while(!input.hasNextInt()){
	 input.next();
	 System.out.println("Inserisci un intero");
	}
	n = input.nextInt();
	System.out.println("Specifica il numero di colonne:");
	while(!input.hasNextInt()){
	 input.next();
	 System.out.println("Inserisci un intero");
	}
	m = input.nextInt();
    matrice = new int[n][m];
	for (int i=0; i<n; i++){                  //inserimento elementi della matrice
	 for (int j=0; j<m; j++){
	  System.out.println("Inserisci l'elemento in posizione"+i+""+j);
	  while(!input.hasNextInt()){
	   input.next();
	   System.out.println("Inserisci un intero");
	  }
	  matrice[i][j] = input.nextInt();
	  }
	 }
	 return matrice;
	}//fine metodo


	public static void stampaMatrice(int[][] a){

     int n = a.length;    // num. righe, seguendo la nostra convenzione
	 int m = a[0].length; // num. colonne, seguendo la nostra convenzione
	 		              // NOTA: per le colonne, possiamo usare qualsiasi
		                  // elemento a[k], 0 <= k <= a.length-1, se assumiamo
		                  // che la matrice sia ancora tale (si veda il punto
		                  // (***) sopra)
	 System.out.println("Matrice :");
	 for (int i=0; i<n; i++) {
	  for (int j=0; j<m; j++)
	   System.out.print(a[i][j]+" ");
	  System.out.println();
	 }
    }//fine metodo


    /** ESERCIZIO: scrivere un metodo che
        prende una matrice di int, restituisce
        niente e stampa le due diagonali se la
        matrice e` quadrata (stesso numero di
        righe e di colonne), altrimenti stampa
        un messaggio di errore. Scrivere, se
        possibile, un algoritmo efficiente.
     */
    public static void stampaDiagonali(int[][] a){

	     int n = a.length;
		 int m = a[0].length;
		 if(m != n)
		  System.out.println("La matrice non e` quadrata!");
		 else{
	      System.out.println("Diagonale principale:");
		  for (int i=0; i<n; i++)
		   System.out.print(a[i][i]+" "); //INVARIANTE: riga = colonna
		  System.out.println("\nDiagonale secondaria:");
		  for (int i=0; i<n; i++)
		   System.out.print(a[i][n-1-i]+" "); //INVARIANTE: riga + colonna = num righe
		                                      //con num righe = a.length-1, quindi:
		                                      //colonna = a.length - 1 - riga
		  System.out.println("\n");
        }
   }

   /** Questo metodo fa il prodotto matriciale. Per poter fare il prodotto,
       occorre che la dimensione della matrice a sia (m,n) e della matrice
       b sia (n,p), cioe` che il numero delle colonne della prima sia pari al
       numero di righe della seconda. La matrice risultato avra` m righe e p
       colonne.

       Se la condizione sopradescritta non e` verificata, il metodo restituisce
       una matrice di 0 righe e 0 colonne. Si veda l'uso di questo particolare
       valore di ritorno nel main.
    */
   public static int[][] prodotto(int[][] a, int[][] b) {

	  int[][] mat;

	  if (a[0].length != b.length)
	   mat = new int[0][0];
      else {
       mat = new int[a.length][b[0].length];
       for(int i=0; i<mat.length; i++)
        for(int j=0; j<mat[0].length; j++)
         for(int k=0; k<b.length; k++) //oppure, equiv., k<a[0].length
           mat[i][j] = mat[i][j] + a[i][k]*b[k][j];
      }
      return mat;
  }

  /** Questo metodo fa il prodotto matriciale. Per poter fare il prodotto,
      occorre che la dimensione della matrice a sia (m,n) e della matrice
      b sia (n,p), cioe` che il numero delle colonne della prima sia pari al
      numero di righe della seconda. La matrice risultato avra` m righe e p
      colonne.

      Se la condizione sopradescritta non e` verificata, il metodo restituisce
	  una matrice di 0 righe e 0 colonne. Si veda l'uso di questo particolare
      valore di ritorno nel main.

      Rispetto al metodo prodotto, questo metodo usa solo due cicli annidati,
      SAREBBE quindi piu' efficiente dal punto di vista del numero dei passi
      se FUNZIONASSE.

      ESERCIZIO: capire se funziona e, se si, costruire un ragionamento per dimostrare
      (anche solo informalmente) che e` equivalente al metodo prodotto, se no, costruire
      un ragionamento per dimostrare (anche solo informalmente) perche' non funziona.
   */
   public static int[][] prodottoCompatto(int[][] a, int[][] b) {

  	int[][] mat;

  	if (a[0].length != b.length)
  	 mat = new int[0][0];
    else {
     mat = new int[a.length][b[0].length];
     for(int i=0; i<mat.length; i++)
      for(int j=0; j<mat[0].length; j++)
        mat[i][j] = mat[i][j] + a[i][j]*b[j][i] + a[j][i]*b[i][j];
    }
    return mat;
  }


}