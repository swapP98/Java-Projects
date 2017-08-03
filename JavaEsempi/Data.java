/**
 * @(#)Data.java
 *
 * Data application
 *
 * @author	Paul Swapnil
 * @version 1.00  -  2015/4/22
 */
import java.util.*;
public class Data {

  	int giorno, mese, anno;
  	Calendar c = new GregorianCalendar();

	static int nMesi[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	static String nomiMese[] = {"0","Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
	static String nomiGiorno[] = {"0","Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato", "Domenica"};

  public Data()
  {
	//float a = System.currentTimeMillis();
   	anno = c.get(Calendar.YEAR); //Math.round(a/1000/60/60/24/365+1970); //com :lengenda 1000=millisecondi; 60=secondi; 60=minuti; 24=ore; 365=giorni
   	//float m = (a/1000/60/60/24/31)-(2014-1970)*12;
   	mese = c.get(Calendar.MONTH)+1;		//Math.round(m);				//com : 30.41 = numero medio di giorni per mese
   	giorno = c.get(Calendar.DAY_OF_MONTH);
  }


 public Data(int g, int m, int a)
  {
		giorno = g;
		mese = m;
		anno = a;
  }

/* public Data(long giorno)
  	{

  	}
*/

	public boolean annoBisestile()
	{
		boolean bisestile;
		if((anno%4==0)&&(anno%100!=0))
			bisestile=true;
		else bisestile=false;
		return bisestile;
	}

	public long giorni()
	{
		float a = System.currentTimeMillis();
		long g = Math.round(a/1000/60/60/24);
		return g;
	}

	public int giornoDellAnno()
	{
		return c.get(Calendar.DAY_OF_YEAR);
	}

	public int anno()
	{
		return anno;
	}

	public int giornoDelMese()
	{
		if ((giorno>31)||(giorno<0))
			return 0;
		return giorno;
	}

	public int mese()
	{
		return mese;
	}

	public int giornoDellaSettimana()
	{
		return c.get(Calendar.DAY_OF_WEEK)-1;
	}

	public int settimana()
	{
		return c.get(Calendar.WEEK_OF_YEAR);
	}

	public Data giornoDopo()
	{
		Data d = new Data();
		if (annoBisestile()==true)
			nMesi[2]=29;
		if((giorno>=1)&&(giorno<nMesi[mese]))
		{
			d = new Data(giorno+1,mese,anno);
			return d;
		}
		if((giorno==nMesi[mese])&&(mese==12))
		{
			d = new Data(1,1,anno+1);
			return d;
		}
		if(giorno==nMesi[mese])
		{
			d = new Data(1,mese+1,anno);
			return d;
		}
		return d;
	}

	public Data giornoDopo(int giorni)
	{
		Data d = new Data();
		int totGiorn = giorno + giorni;
		int m = totGiorn/nMesi[mese];
		int totMes = mese + m;
		int contG = 0;
		int ms = mese;
		int a = anno;
		if (annoBisestile()==true)
			nMesi[2]=29;
		if((totGiorn>nMesi[ms])&&(totMes<=12))
		{
			do
			{
				totGiorn = totGiorn - nMesi[ms];
				ms++;
			}
			while (totGiorn > nMesi[ms]);
			d =  new Data(totGiorn, ms, a);
			return d;
		}

		if(totMes>12)
		{
			if(ms==12)
			{
				ms = 1;
				a++;
				do
				{
					totGiorn = totGiorn - nMesi[ms];
					ms++;
				}
				while(totGiorn > nMesi[ms]);
				d = new Data(totGiorn, ms, a);
				return d;
			}
			do
			{
				totGiorn = totGiorn - nMesi[ms];
				ms++;
				if(ms==12)
				{
					ms=1;
					totGiorn = totGiorn - nMesi[ms];
					ms++;
					a++;
				}
			}
			while(totGiorn > nMesi[ms]);
			d = new Data(totGiorn, ms, a);
			return d;
		}

		if(totGiorn<nMesi[ms])
		{
			d =  new Data(totGiorn, ms, a);
			return d;
		}
		return d;
	}

	public Data giornoPrima()
	{
		Data d = new Data();
		if (annoBisestile()==true)
			nMesi[2]=29;
		if((giorno>1)&&(giorno<=nMesi[mese]))
		{
			d = new Data(giorno-1,mese,anno);
			return d;
		}
		if((giorno==1)&&(mese==1))
		{
			d = new Data(nMesi[mese],12,anno-1);
			return d;
		}
		if(giorno==1)
		{
			d = new Data(nMesi[mese-1],mese-1,anno);
			return d;
		}
		return d;
	}

	public Data giornoPrima(int giorni)
	{
		Data d = new Data();
		int totGiorn = giorno - giorni;
		int m = totGiorn/nMesi[mese];
		int totMes = mese - m;
		int contG = 0;
		int ms = mese;
		int a = anno;
		if (annoBisestile()==true)
			nMesi[2]=29;
		if(totMes>1)
		{
			if(ms==1)
			{
				ms = 12;
				a--;
				do
				{
					totGiorn = totGiorn + nMesi[ms];
					ms--;
				}
				while(totGiorn < 1);
				d = new Data(totGiorn, ms, a);
				return d;
			}
			do
			{
				totGiorn = totGiorn + nMesi[ms];
				ms--;
				if(ms==1)
				{
					ms=12;
					totGiorn = totGiorn + nMesi[ms];
					ms--;
					a--;
				}
			}
			while(totGiorn < 1);
			d = new Data(totGiorn, ms, a);
			return d;
		}

		if(totGiorn>1)
		{
			d =  new Data(totGiorn, ms, a);
			return d;
		}
		return d;
	}

	public java.lang.String nomeDelMese()
	{
		String nomeDelMese = nomiMese[mese];
		return nomeDelMese;
	}
	public java.lang.String nomeDelGiorno()
	{
		String nomeDelGiorno = nomiGiorno[giornoDellaSettimana()];
		return nomeDelGiorno;
	}

	public java.lang.String toString()
	{
		return giorno+"/"+mese+"/"+anno;
	}

	//MAIN
	public static void main(String[] args)
	{
		Data d = new Data();
		System.out.println("Anno bisestile: " + d.annoBisestile());
		System.out.println("giorni " + d.giorni());
		System.out.println("giornoDellAnno " + d.giornoDellAnno());
		System.out.println("anno " + d.anno());
		System.out.println("giornoDelMese " + d.giornoDelMese());
		System.out.println(" mese " +  d.mese());
		System.out.println("giornoDellaSettimana " + d.giornoDellaSettimana());
		System.out.println("settimana " + d.settimana());
		System.out.println("nomeDelMese " + d.nomeDelMese());
		System.out.println("nomeDelGiorno " + d.nomeDelGiorno());

		System.out.println("il giorno di oggi " + d);
		System.out.println("giorno prima-1 " + d.giornoPrima());
		System.out.println("giorno prima " + d.giornoPrima(30));
		System.out.println("giorno dopo+1 " +d.giornoDopo());
		System.out.println("giorno dopo " +d.giornoDopo(30));




		 System.out.print(d.giorno);
	}

}
