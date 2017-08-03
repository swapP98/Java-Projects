/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Swapnil Paul
 */
public class TRET  implements Runnable{
    
    
    
    int n, select;

    public TRET(int n, int select) {
        this.n = n;
        this.select = select;
    }

    @Override
    public void run() {
        switch (select) {
            case 1:
                calcolaSommaRadice();
                break;
            case 2:
                calcolaSommaQuadrati();
                break;
            case 3:
                calcolaDivisori();
                break;
            default:
                System.err.println("Numero di selezione non coretta");
        }
    }

    private void calcolaSommaRadice() {
        double sommaRadici = 0;
        for (int i = 1; i <= n; i++) {
            sommaRadici += Math.sqrt(i);
        }
        System.out.println("\nLa somma delle radici quadrate = " + sommaRadici + ";");
    }

    private void calcolaSommaQuadrati() {
        double sommaQuadrati = 0;
        for (int i = 1; i <= n; i++) {
            sommaQuadrati += i * i;
        }
        System.out.println("\nLa somma dei quadrati = " + sommaQuadrati + ";");
    }

    private void calcolaDivisori() {

        ArrayList<Integer[]> lista = new ArrayList<>(2);

        for (int i = 0; i < n; i++) {
            lista.add(i, listaDivisori(i + 1));
        }
        lista.trimToSize();

        Integer[] n = null;
        for (int j = 0; j < lista.size(); j++) {
            n = lista.get(j);
            System.out.print("\nI divisori di " + (j + 1) + " = ");
            for (int k = 0; k < n.length; k++) {
                if (n[k] == null) {
                    System.out.print("");
                } else {
                    System.out.print(n[k] + " ");
                }
            }
        }
    }

    private Integer[] listaDivisori(int p) {
        Integer[] numDivisori = new Integer[p];

        int j = 0;
        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                numDivisori[j] = i;
                j++;
            }
        }
        return numDivisori;
    }

    //Sottoclasse TretThreads implementa l'inferfaccia Runnable
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserire un numero: ");
        int n = input.nextInt();
        TRET sommaRadice = new TRET(n, 1);
        TRET sommaQuadrati = new TRET(n, 2);
        TRET divisori = new TRET(n, 3);
        Thread t1 = new Thread(sommaRadice);
        Thread t2 = new Thread(sommaQuadrati);
        Thread t3 = new Thread(divisori);

        t1.start();
        t2.start();
        t3.start();
    }

}
