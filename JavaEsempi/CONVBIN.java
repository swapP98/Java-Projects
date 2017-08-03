/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convbin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Date: 26/01/2016
 *
 * @author Paul Swapnil
 */
public class CONVBIN {

    public static void main(String[] args) {

        String nomePercorsoFileInput = "input.txt"; //input.txt si trova dentro alla cartella CONVBIN
        File fileInput = new File(nomePercorsoFileInput);

        String nomePercorsoFileOutput = "output.txt";
        File fileOutput = new File(nomePercorsoFileOutput);
        //in caso il fileOutput non esiste allora viene creato nella cartella CONVBIN
        if (!fileOutput.exists()) {
            try {
                fileOutput.createNewFile();
                System.out.println("File creato con successo!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        int n;
        String[] tab = new String[130];
        try {
            Scanner f = new Scanner(fileInput);
            PrintStream outputFile = new PrintStream(fileOutput);

            while (f.hasNextInt()) {
                n = f.nextInt();
                convbin(n, tab);

                //Scrittura in file output e debbuging
                for (int l = 0; l < tab.length; l++) {
                    if (tab[l] == null) {
                        System.out.print("");
                        outputFile.print("");
                    } else {
                        System.out.print(tab[l]);
                        outputFile.print(tab[l]);
                    }
                }
                System.out.print(" ");
                outputFile.print(" ");
            }
            outputFile.close();
            f.close();
            System.out.println("\nOperazione riuscita con successo!");
        } catch (FileNotFoundException e) {
            System.err.println("Nome percorso non valido!");
            return;
        }
    }

    public static void convbin(int n, String ris[]) {
        int a = n;
        int k = -1;
        do {
            ris[++k] = "" + a % 2;
            a = a / 2;
        } while (a > 0);
        int i, j;
        String h;
//inversione della stringa
        for (i = 0; i <= k / 2; i++) {
            j = k - i;
            h = ris[i];
            ris[i] = ris[j];
            ris[j] = h;
        }
        ris[k + 1] = "";

    }
}
