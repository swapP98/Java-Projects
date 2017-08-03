package gestionelista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Paul Swapnil
 */
public class GestioneLista extends JFrame {
	private JTextField txtField;
	private JTextArea txtArea;
	public GestioneLista() //costruttore
	{
		UserInterFace(); //inizializza tutta l'interfaccia grafica
	}
	private void UserInterFace() { 
	  setTitle("Getione Lista");
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setSize(500, 400);
	  
	  Listener listener = new Listener(); //inizializzazione classe Listener
	  
	  JPanel northPanel = new JPanel();

	  //Pannello sud contiene JLabel
       JLabel titoloLabel = new JLabel("Gestione Lista");
       titoloLabel.setFont(new Font("Serif", Font.BOLD, 24)); 
       northPanel.add(titoloLabel);
       add(northPanel, BorderLayout.NORTH);

	   //Pannello cemtrale contiene JLabel e un JTextField e un JButton
       JPanel centerPanel = new JPanel();
	   centerPanel.setLayout(new FlowLayout(10,50,20));
	   JLabel elementLabel =  new JLabel("Elemento: ");
	   txtField = new JTextField(15);
	   //txtField.setText("<elem>");
	   JButton inserisciBtn = new JButton("Inserisci");
	   inserisciBtn.setPreferredSize(new Dimension(100,40));
	   inserisciBtn.addActionListener(listener); //gestione dell'evento del bottone
	   centerPanel.add(elementLabel);
	   centerPanel.add(txtField);
	   centerPanel.add(inserisciBtn);
	   add(centerPanel,BorderLayout.CENTER);
	   
	   //Pannello sud contiene JLabel e un JTextArea
	   JPanel southPanel = new JPanel();
	   JLabel listaLabel = new JLabel("Lista: ");
	   txtArea = new JTextArea(6,25);
	   txtArea.setEditable(false);
	   txtArea.setLineWrap(true);
	   southPanel.setLayout(new FlowLayout(10,20,70));
	   southPanel.add(listaLabel);
	   southPanel.add(txtArea);
	   add(southPanel,BorderLayout.SOUTH);
	   
	  setLocationRelativeTo(null);
	  setVisible(true);
	  
	}
	
	//classe che gestisce la azione del bottone e inserisce in una lista 
	//concatenata elementi e poi li visualizza su un JTextArea
	private class Listener implements ActionListener
	{
		public SimpleLinkedQueue list;
		public Listener()
		{
			list = new SimpleLinkedQueue(); //inizializza una lista concatenata di tipo coda 
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			String txt = txtField.getText();
			list.add(txt);
			String s = list.toString();
			txtArea.setText(s);
			txtField.setText(null);
		}
		
		
		
	}
	
    //metodo main
	public static void main(String[] args) {
		
		GestioneLista gestioneLista = new GestioneLista();//inizializza oggetto di tipo GestioneLista
    }

	

}
