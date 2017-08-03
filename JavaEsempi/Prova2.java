/**
 * @(#)Prova2.java
 *
 *
 * @author Lazzarini Stefano
 * @version 1.00 2014/9/24
 */

public class Prova2 {

    /**
     * Creates a new instance of <code>Prova2</code>.
     */
    public Prova2() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean variabile_booleana = true;
        System.out.println("variabile_booleana = " + variabile_booleana);
        variabile_booleana = false;
        System.out.println("variabile_booleana = " + variabile_booleana);

        char variabile_carattere = '\u0041';
        System.out.println("variabile_carattere = " + variabile_carattere);
        variabile_carattere = ++variabile_carattere;
        System.out.println("variabile_carattere = " + variabile_carattere);

        int variabile_intera = 100;
        System.out.println("variabile_intera = " + variabile_intera);
        variabile_intera = variabile_intera / 100;
        System.out.println("variabile_intera = " + variabile_intera);

        double variabile_reale = 3.14;
        System.out.println("variabile_reale = " + variabile_reale);
    }
}
