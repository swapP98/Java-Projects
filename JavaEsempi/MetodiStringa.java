public class MetodiStringa
{
	public static void main (String[] args)
	{
		String s = "abcdefgh";
		String s2 = "abc";

		String a = s.substring(2,5);
		String b = s.substring(3,4);
		System.out.println(a + "\t" + b + "\t" + "\t" +  " / substring");									//substring

		String c = s.toUpperCase();
		System.out.println(c + "\t" + "\t" + " / toUpperCase" );											//toUpperCase

		String d = c.toLowerCase();
		System.out.println(d + "\t" + "\t" + " / toLowerCase" );											//toLowerCase

		if (s.equals(d))
		System.out.println(s + " => " +  d + "\t" + "\t" +  " / equals" );									//equals

		if (s.equalsIgnoreCase(c))
		System.out.println(s + " => " +  c + "\t" + "\t" +  " / equalsIgnoreCase" );						//equalsIgnoreCase

		s.compareTo(c);
		System.out.println(s.compareTo(c) + "\t" + "\t" +  " / compareTo");									//compareTo

		s.compareToIgnoreCase(c);
		System.out.println(s.compareToIgnoreCase(c) + "\t" + "\t" +  " / compareToIgnoreCase");				//compareToIgnoreCase

		String g=String.valueOf(129);
		System.out.println(g + "\t" + "\t" +  " / String.valueOf");											//String.valueOf


	}
}