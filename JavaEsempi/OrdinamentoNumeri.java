/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordinamentonumeri;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paul.swapnil
 */
public class OrdinamentoNumeri extends Thread {

    /**
     * @param args the command line arguments
     */
    int a[];

    public OrdinamentoNumeri(int a[]) {
        this.a = a;
    }

    @Override
    public void run() {
        Arrays.sort(a);
    }

    public static void main(String[] args) throws InterruptedException {

        String inputSourse = "input.txt";
        File inputFile = new File(inputSourse);

        ArrayList<Integer> array = new ArrayList<>();
        int n;

        try {

            Scanner f = new Scanner(inputFile);
            while (f.hasNextInt()) {
                n = f.nextInt();
                array.add(n);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Nome percorso non valido");
        }

        int a[];
        int b[];
        int i, j, k;

        for (j = 0; j < array.size(); j++) {
            System.out.print(array.get(j) + " ");
        }
        System.out.println();

        if (array.size() % 2 == 0) {
            a = new int[array.size() / 2];
            b = new int[array.size() / 2];
            for (i = 0; i < a.length; i++) {
                a[i] = array.get(i);
            }
            for (k = 0, j = b.length; k < b.length; j++, k++) {
                b[k] = array.get(j);
            }
        } else {
            a = new int[(array.size() / 2) + 1];
            b = new int[array.size() / 2];
            for (i = 0; i < a.length; i++) {
                a[i] = array.get(i);
            }
            for (k = 0, j = b.length + 1; k < b.length; j++, k++) {
                b[k] = array.get(j);
            }
        }

        for (int kl = 0; kl < a.length; kl++) {
            System.out.print(a[kl] + " ");
        }
        for (int kl = 0; kl < b.length; kl++) {
            System.out.print(b[kl] + " ");
        }
        System.out.println();

        OrdinamentoNumeri primoArr = new OrdinamentoNumeri(a);
        OrdinamentoNumeri secondoArr = new OrdinamentoNumeri(b);

        primoArr.start();
        secondoArr.start();
        primoArr.join();
        secondoArr.join();

        for (int kl = 0; kl < a.length; kl++) {
            System.out.print(a[kl] + " ");
        }
        for (int kl = 0; kl < b.length; kl++) {
            System.out.print(b[kl] + " ");
        }
        System.out.println();

        int c[] = new int[a.length + b.length];
        int ai, bi, ci;

        for (ci = 0, ai = 0; (ci < c.length) && (ai < a.length); ci++, ai++) {
            c[ci] = a[ai];
        }
        if (c.length % 2 == 0) {

            for (ci = b.length, bi = 0; (ci < c.length) && (bi < b.length); ci++, bi++) {
                c[ci] = b[bi];
            }
        } else {
            for (ci = b.length + 1, bi = 0; (ci < c.length) && (bi < b.length); ci++, bi++) {
                c[ci] = b[bi];
            }
        }

        Arrays.sort(c);

        String outputSourse = "output.txt";
        File outputFile = new File(outputSourse);
        if (!outputFile.exists()) {
            try {
                outputFile.createNewFile();
                System.out.println("Il file è stato creato con successo!");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        try {
            PrintStream fileOutput = new PrintStream(outputFile);
            for (k = 0; k < c.length; k++) {
                fileOutput.print(c[k] + " ");
            }
            fileOutput.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OrdinamentoNumeri.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (k = 0; k < c.length; k++) {
            System.out.print(c[k] + " ");
        }

    }
}
