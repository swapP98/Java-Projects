package medie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Swapnil Paul
 */
public class MEDIE extends Thread {

    static File fileInput;
    static File fileOutput;
    final int MAX_POSTI = 2;
    static int presenti;
    static int buffer[];
    static int coda;
    static int testa;
    static double media;
    static boolean interrotto;

    int num;
    int selection;

    public MEDIE(int num, int selection) {
        this.num = num;
        this.selection = selection;
    }

    public void run() {
        switch (selection) {
            case 1:
                compitoProduttore();
                break;
            case 2:
                compitoConsumatore();
                break;
            default:
                System.err.println("Numero di selezione non coretta");
        }
    }

    private synchronized void compitoProduttore() {
        int n;
        buffer = new int[MAX_POSTI];
        try {
            Scanner f = new Scanner(fileInput);
            while (f.hasNextInt()) {
                n = f.nextInt();
                if (presenti == MAX_POSTI) {
                    System.out.println("\nIl PRODUTTORE ASPETTA per buffer PIENO!");
                    //return;
                }

                /* while(presenti==MAX_POSTI)
                {
                    f.wait();
                }
                 */
                buffer[coda] = n;
                presenti++;
                System.out.println("\nIl PRODUTTORE ha prodotto il dato: " + buffer[coda] + ".");
                System.out.print("\nSul buffer ce ne sono: " + presenti);
                coda = (coda + 1) % MAX_POSTI;
            }
            f.close();
            interrotto = true;
        } catch (FileNotFoundException e) {
            System.err.println("Nome percorso non valido!");
            return;
        }
    }

    private synchronized void compitoConsumatore() {
        int messaggio;
        media = 0;
        double somma = 0;
        int accumulati = 0;
        while (!interrotto) {
            if (presenti == 0) {
                System.out.println("\nIl consumatore ASPETTA che arrivi qualcosa nel buffer ");
                //return;
            }

            messaggio = buffer[testa];
            testa = (testa + 1) % MAX_POSTI;
            presenti--;
            System.out.println("\nIl consumatore sta CONSUMANDO il dato: " + messaggio);
            somma += messaggio;
            accumulati = (accumulati + 1) % num;
            if (accumulati == 0) {
                media = somma / num;
                System.out.println("    media" + media);
                somma = 0;
            }
        }

        while (presenti > 0) {
            messaggio = buffer[testa];
            testa = (testa + 1) % MAX_POSTI;
            presenti--;
            System.out.println("\nIl consumatore sta CONSUMANDO il dato: " + messaggio);
            somma += messaggio;
            accumulati = (accumulati + 1) % num;
            if (accumulati == 0) {
                media = somma / num;
                System.out.println("   media= " + media);
                somma = 0;
            }
        }

        if (accumulati > 0) {
            media = somma / accumulati;
            System.out.println("  media residua= " + media + ", su " + accumulati);
        }
    }

    public static void main(String[] args) throws InterruptedException {

     
           
           presenti = 0;
           coda = 0;
           testa = 0;
           interrotto = false;
           
           String nomePercorsoFileInput = "input.txt"; //input.txt si trova dentro alla cartella MEDIE
           fileInput = new File(nomePercorsoFileInput);
           
           String nomePercorsoFileOutput = "output.txt";
           fileOutput = new File(nomePercorsoFileOutput);
           //in caso il fileOutput non esiste allora viene creato nella cartella MEDIE
           if (!fileOutput.exists()) {
               try {
                   fileOutput.createNewFile();
                   System.out.println("File creato con successo!");
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
           
           Scanner input = new Scanner(System.in);
           System.out.print("Inserire un numero: ");
           int k = input.nextInt();
           MEDIE produttore = new MEDIE(0,1);
           MEDIE consumatore = new MEDIE(k,2);
           produttore.start();
           consumatore.start();
           produttore.join();
           consumatore.join();
           
           try {
               PrintStream outputFile = new PrintStream(fileOutput);
               outputFile.print("   LA MEDIA è: " + media);
               outputFile.close();
               System.out.println("\nOperazione riuscita con successo!");
           } catch (FileNotFoundException e) {
               System.err.println("Nome percorso non valido!");
               return;
           }
    }
}
