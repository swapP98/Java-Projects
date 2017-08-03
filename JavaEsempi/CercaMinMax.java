public class CercaMinMax
{
    public static void main(String args[])
    {
    	System.out.println("Questo programma cerca il minimo e il massimo valore contenuto in un vettore");
    	double v[] = new double[10000000];
    	for (int i = 0; i < v.length; i++)
    		v[i] = Math.random();
    	double min = v[0], max = min, tot = max;
    	for (int i = 1; i < v.length; i++)
    	{	if (v[i] < min)
    			min = v[i];
    		if (v[i] > max)
    			max = v[i];
    		tot += v[i];
    	}
    	System.out.printf("Il minimo  valore  contenuto  nel vettore è %6.4f\n", min);
    	System.out.printf("Il massimo valore  contenuto  nel vettore è %6.4f\n", max);
    	System.out.printf("La media dei valori contenuti nel vettore è %6.4f\n", tot / v.length);
    }
}
