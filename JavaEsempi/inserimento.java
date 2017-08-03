import java.util.Scanner;
public class inserimento
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
		for (int i=1;i<=a.length-1;i++)	//ordinamento
			{	int v=a[i],j;
				for (j=i-1;j>=0;j--)
					if (a[j]>v) a[j+1]=a[j];
					else break;
				confronti++;
				a[j+1]=v;
			}
		System.out.println("Gli elementi del vettore a ordinato sono:");
		for (int j=0;j<a.length;j++) System.out.print(a[j]+" ");
		System.out.print("\r");
		System.out.println("Il numero di confronti eseguiti è " + confronti + ".");
	}
}
