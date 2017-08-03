package traduttore;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 * @author paul.swapnil
 */
public class Traduttore {
	private TreeMap<String, String> dizionario;
	private JFrame frame;
	private JTextField txtFieldIta;
	private JButton itaBtn;
	private JTextField txtFieldIng;
	private JButton ingBtn;
	public Traduttore()
	{
		dizionario = new TreeMap<>();
		UI();
	}
	
	void UI()
	{
		Listener listener = new Listener();
		frame = new JFrame("Traduttore");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2, 3));
		frame.add(new JLabel("italiano"));
		txtFieldIta = new JTextField(20);
		txtFieldIta.setEditable(true);
		txtFieldIta.addActionListener(listener);
		frame.add(txtFieldIta);
		itaBtn = new JButton("ita");
		itaBtn.addActionListener(listener);
		frame.add(itaBtn);
		
		frame.add(new JLabel("inglese"));
		txtFieldIng = new JTextField(20);
		txtFieldIng.setEditable(true);
		txtFieldIng.addActionListener(listener);
		frame.add(txtFieldIng);
		ingBtn = new JButton("ing");
		ingBtn.addActionListener(listener);
		frame.add(ingBtn);
		
		frame.pack();
		frame.setVisible(true);
	}
		
	void put(String k, String v)
	{
		dizionario.put(k, v);
	}
		
	String get(String k)
	{
		return dizionario.get(k);
	}

	private class Listener  implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			JButton btn = (JButton) event.getSource();
			String str = txtFieldIta.getText();
			if(str!=null)
			{
				if(dizionario.containsKey(str))
			    txtFieldIng.setText(dizionario.get(str));
				else 
				{  
					String s = (String)JOptionPane.showInputDialog(
										frame,
                                        "Inserire la traduzione in inglese",
                                        "Inserire la traduzione",
                                        JOptionPane.WARNING_MESSAGE,
                                        null,
                                        null,
                                        "parola in inglese");
					dizionario.put(str, s);
					//JOptionPane.showInputDialog(frame);
				}
			}
		}
	}
	
	public static void main(String[] args) {
        Traduttore r = new Traduttore();
		r.put("Parola", "world");
		r.put("Ciao", "Hello");
		
		System.out.println(r.get("Parola"));
    }

}
