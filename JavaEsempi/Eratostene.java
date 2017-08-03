class Eratostene
{
	public static void main(String[] args)
		{
			int i, b;
			int max = 1000; 	// Calcola i numeri primi fino a 1000
			boolean[]numeri = new boolean[max];	// Assegna ad ogni elemento del vettore il valore "true"
		for (i=0; i<max; i++)
		{
		numeri[i] = true;
		}
			for (i=2; i<max/2; i++)
				{
					if (numeri[i]==true)
						{
						for (b = i*2; b<max; b += i) // Ciclo per azzerare i multipli di i
						numeri[b] = false;
						}
				}
				for (i=2; i<max; i++)
					{
					if (numeri[i]==true)
						{
						System.out.println(i);
						}
					}
		}
}