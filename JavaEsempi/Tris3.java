import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tris3 extends JFrame
{
	private String text1 = "X", text2 = "O";
	
	private JButton[][] button = new JButton[3][3];
	
	private boolean tris(String text)
	{
		boolean tris = true;
		for (int i = 0; i < 3; i++)
			tris = tris && text.equals(button[i][i].getText());
		if (tris) return true;
		
		tris = true;
		for (int i = 0; i < 3; i++)
			tris = tris && text.equals(button[i][2-i].getText());
		if (tris) return true;
		
		for (int i = 0; i < 3; i++)
		{	tris = true;
			for (int j = 0; j < 3; j++)
				tris = tris && text.equals(button[i][j].getText());
			if (tris) return true;
		}
		for (int j = 0; j < 3; j++)
		{	tris = true;
			for (int i = 0; i < 3; i++)
				tris = tris && text.equals(button[i][j].getText());
			if (tris) return true;
		}
		return false;
	}	
	private class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JButton button = (JButton) event.getSource();
			if (button.getText() == null && !tris(text2))
			{	button.setText(text1);
				if (tris(text1))
					System.out.println(text1 + " ha fatto tris!");
				else
					System.out.println("Tocca a " + text2 + ":");
				String temp = text1;
				text1 = text2;
				text2 = temp;
			}
		}
	}
	public Tris3(String title)
	{
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 3));

		// Inserisce i componenti della finestra
		Listener listener = new Listener();
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
		{	button[i][j] = new JButton();
			button[i][j].setText(null);
			button[i][j].addActionListener(listener);
			add(button[i][j]);
		}
		// Ingrandisce la finestra alle dimensioni ottimali, la
		// posiziona al centro dello schermo e la rende visibile.
		setSize(200, 200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		// Crea una finestra con titolo "GIOCO DEL TRIS"
		new Tris3("GIOCO DEL TRIS");
		System.out.println("Tocca a X:");
	}
}
