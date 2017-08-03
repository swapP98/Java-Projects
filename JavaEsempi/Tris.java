import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tris
{
	public static String buttonText1 = "X",
						 buttonText2 = "O";

	public static void main(String[] args)
	{
		// Crea una finestra con titolo "GIOCO DEL TRIS"
		// ed imposta l'azione associata al tasto di chiusura.
		JFrame frm = new JFrame("GIOCO DEL TRIS");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(new GridLayout(3, 3));

		// Inserisce i componenti della finestra
		for (int i = 0; i < 9; i++)
		{	JButton button = new JButton();
			button.setText(null);
			button.addActionListener(new ButtonListener(button));
			frm.add(button);
		}
		// Ingrandisce la finestra alle dimensioni ottimali, la
		// posiziona al centro dello schermo e la rende visibile.
		frm.setSize(200, 200);
		frm.setLocationRelativeTo(null);
		frm.setVisible(true);
  }
}
class ButtonListener implements ActionListener
{
	private JButton button;

	public ButtonListener(JButton b)
	{
		button = b;
	}
	public void actionPerformed(ActionEvent event)
	{
		if (button.getText() == null)
		{	button.setText(Tris.buttonText1);
			String temp = Tris.buttonText1;
			Tris.buttonText1 = Tris.buttonText2;
			Tris.buttonText2 = temp;
		}
		else
		{	button.setText(null);
			String temp = Tris.buttonText1;
			Tris.buttonText1 = Tris.buttonText2;
			Tris.buttonText2 = temp;
		}
	}
}