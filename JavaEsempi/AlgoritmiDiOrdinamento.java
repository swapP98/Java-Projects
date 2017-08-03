/*	Author : Swapnil Paul
 *	Date : 14/01/2015
 *	Program name : AlgoritmoDiOrdinamento
 */

public class AlgoritmiDiOrdinamento
{
	public static void main(String[] args)
	{
		int[] a = new int[10];
		int i, k, j, v, g;
		int nconfronti=0;
		int nconfrontiSelezione=0;
		int nconfrontiScambio=0;
		for (i=0; i<a.length-1; i++)
		{
			a[i]=(int)(Math.random()*10);
			System.out.print(a[i] + " ");
		}

		//ALGORITMO DI ORDINAMENTO PER INSERIMENTO

		for (i=1; i<a.length; i++)
		{
			v=a[i];
			for(j=i-1; j>=0; j--)
				if(a[j]>v)
					a[j+1]=a[j];
				else break;
				a[j+1]=v;
					nconfronti++;
		}

		System.out.println( "\n" + "ALGORITMO DI ORDINAMENTO PER INSERIMENTO");

		for (g=1; g<a.length; g++)
			System.out.print(a[g] + " ");

		System.out.println("\n" + "Il numero di confronti (inserimento) è: " + nconfronti);




		// ALGORITMO DI ORDINAMENTO PER SELEZIONE

		for (i=0; i<a.length-1; i++)
		{
			k=i;
			for(j=i+1; j<a.length; j++)
				if(a[j]<a[k])
					k=j;
			v=a[k];
			a[k]=a[i];
			a[i]=v;
			nconfrontiSelezione++;
		}

		System.out.println( "\n" + "ALGORITMO DI ORDINAMENTO PER SELEZIONE");

		for (g=1; g<a.length; g++)
			System.out.print(a[g] + " ");

		System.out.println("\n" + "Il numero di confronti (selezione) è: " + nconfrontiSelezione);



	// ALGORITMO DI ORDINAMENTO PER SCAMBIO

		boolean ordinato=false;
		while(!ordinato)
		{
			ordinato=true;
			for(i=0;i<a.length-1;i++)
				if(a[i]>a[i+1])
				{
					v=a[i];
					a[i]=a[i+1];
					a[i+1]=v;
					ordinato=false;
					nconfrontiScambio++;

				}
			System.out.println( "\n" + "ALGORITMO DI ORDINAMENTO PER SCAMBIO");

			for (g=1; g<a.length; g++)
			System.out.print(a[g] + " ");

			System.out.println("\n" + "Il numero di confronti (scambio) è: " + nconfrontiScambio);
		}



	}
}