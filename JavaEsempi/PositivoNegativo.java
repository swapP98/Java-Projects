import java.util.Scanner;
public class PositivoNegativo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		boolean trov=false;
		while (num!=0)
		{	int prec=num;
			num=input.nextInt();
			if (prec>0 && num<0)
				trov=true;
		}
		if(trov)
			System.out.println("ok");
			else
				System.out.println("no");
	}
}

