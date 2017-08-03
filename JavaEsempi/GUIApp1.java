import javax.swing.*;
import java.awt.*;

public class GUIApp1 {

  public static void main(String[] args) {

    // Crea una finestra con titolo "ALCUNI COMPONENTI GRAFICI"
	JFrame frm = new JFrame("ALCUNI COMPONENTI GRAFICI");
	// frm.setSize(300, 300);
	frm.setLocation(400, 100);
	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JPanel northPanel = new JPanel();
	northPanel.add(new JLabel("Nome del cliente:"));
	northPanel.add(new JTextField("testo iniziale", 30));
	frm.add(northPanel, BorderLayout.NORTH);

	JPanel southPanel = new JPanel();
	//southPanel.setLayout(new FlowLayout());
	southPanel.add(new JButton("CONFERMA"));
	southPanel.add(new JButton("ANNULLA"));
   southPanel.add(new JButton("PULSANTE"));
	frm.add(southPanel, BorderLayout.SOUTH);

	JPanel westPanel = new JPanel();
	westPanel.setLayout(new GridLayout(3, 1));
	westPanel.add(new JCheckBox("PRIMO"));
	westPanel.add(new JCheckBox("SECONDO"));
	westPanel.add(new JCheckBox("CONTORNO"));
	frm.add(westPanel, BorderLayout.WEST);

	JRadioButton uomo = new JRadioButton("UOMO");
	JRadioButton donna = new JRadioButton("DONNA");
	JRadioButton bambino = new JRadioButton("BAMBINO");
	ButtonGroup scelta = new ButtonGroup();
	scelta.add(uomo);
	scelta.add(donna);
	scelta.add(bambino);
	JPanel eastPanel = new JPanel();
	eastPanel.setLayout(new GridLayout(3, 1));
	eastPanel.add(uomo);
	eastPanel.add(donna);
	eastPanel.add(bambino);
	frm.add(eastPanel, BorderLayout.EAST);

	String[] options = {"Lunedì",
						"Martedì",
						"Mercoledì",
						"Giovedì",
						"Venerdì",
						"Sabato",
						"Domenica"};
	JComboBox box = new JComboBox(options);
	box.setEditable(true);
	JPanel centerPanel = new JPanel();
	centerPanel.setLayout(new GridLayout(3, 1));
	centerPanel.add(box);
	frm.add(centerPanel, BorderLayout.CENTER);

	frm.pack();
    // Rende la finestra visibile (di default non lo e')
	frm.setVisible(true);
	System.out.println("Ciao ciao");
  }
}