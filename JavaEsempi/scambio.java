import java.util.Scanner;
public class scambio
{	public static void main(String[] args)
	{	Scanner input=new Scanner(System.in);
		System.out.println("Inserire la lunghezza del vettore da generare casualmente.");
		int n=input.nextInt();
		int[] a=new int[n];
		a[0]=(int)(Math.random()*100);
		for (int i=1;i<a.length;i++) a[i]=(int)(Math.random()*100);
		int confronti=0;
		System.out.println("Gli elementi del vettore a sono:");
		for (int j=0;j<a.length;j++) System.out.print(a[j]+" ");
		System.out.print("\r");
		boolean ordinato=false;
		while(!ordinato)	//ordinamento
		{	ordinato=true;
			for(int i=0;i<a.length-1;i++)
			if (a[i]>a[i+1])
			{	int v=a[i];
				a[i]=a[i+1];
				a[i+1]=v;
				ordinato=false;
			}
			confronti++;
		}
		System.out.println("Gli elementi del vettore a ordinato sono:");
		for (int j=0;j<a.length;j++) System.out.print(a[j]+" ");
		System.out.print("\r");
		System.out.println("Il numero di confronti eseguiti è " + confronti + ".");
	}
}
