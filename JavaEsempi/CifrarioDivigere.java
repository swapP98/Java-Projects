
public class CifrarioDivigere implements Cifrario
{
	private int[] chiave;
	public CifrarioDivigere(String k)
	{
		chiave = new int [k.length()];
		for(int i=0; i<chiave.length; i++)
			chiave[i] = k.charAt(i)-'A';
	}

	public String codifica(String m)
	{
		String mc = new String(); //messaggiocifrario
		for(int i=0; i<m.length(); i++)
		{
			char c = m.charAt(i);
			c = (char)(c+chiave[i%chiave.length]);
			if(c>'Z')
				c-=26;
				mc = mc+c;
		}
		return mc;
	}

	public String decodifica(String m)
	{
		String mc = new String(); //messaggiocifrario
		for(int i=0; i<m.length(); i++)
		{
			char c = m.charAt(i);
			c = (char)(c-chiave[i%chiave.length]);
			if(c<'A')
				c+=26;
				mc = mc+c;
		}
		return mc;
	}
}
