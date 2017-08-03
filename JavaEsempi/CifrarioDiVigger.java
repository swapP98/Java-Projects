public class CifrarioDiVigger
{
	private String chiave;
	public CifrarioDiVigger(java.lang.String k)
	{chiave = k;}
	public void codifica(java.lang.String m)
	{
		char tab[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','w','x','y','z'};
		char codLettera;
		int cont=0;
		int cont2=0;
		for(int i=0; i<chiave.length();i++)
		for(int j=0; j<tab.length; j++)
		{
			if(chiave.charAt(i)==tab[j])
				cont = j;
			if(m.charAt(i)==tab[j])
			{
				cont2 = cont+j;
				if(cont2>25)
				{
					cont2 = cont2 - 26;
				}
				codLettera = tab[cont2];
				System.out.print(codLettera);
			}
		}
	}

	public void decodifica(java.lang.String m)
	{
		char tab[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','w','x','y','z'};
		char codLettera;
		int cont=0;
		int cont2=0;
		for(int i=0; i<chiave.length();i++)
		for(int j=0; j<tab.length; j++)
		{
			if(chiave.charAt(i)==tab[j])
				cont = j;
			if(m.charAt(i)==tab[j])
			{
				cont2 = Math.abs(cont-j);
				if(cont2>25)
				{
					cont2 = cont2 - 26;
				}
				codLettera = tab[cont2];
				System.out.print(codLettera);
			}
		}
	}

}