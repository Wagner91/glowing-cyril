package Test;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JTestingPanel extends JPanel {

	private ArrayList<JButton> botoes;
	
	public static void main(String[] args) {
		JTestingPanel gst = new JTestingPanel();
		JFrame f = new JFrame("Bingo");
		f.getContentPane().add(gst);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}

	private static final long serialVersionUID = 4221317269750527161L;

	public JTestingPanel() {
		
		botoes = new ArrayList<JButton>(24);
		setLayout(new GridLayout(5, 5));
		
		for (int i = 0; i < 24; i++) {

			if (i == 12) {
				JButton button = new JButton("");
				add(button);
				button.setEnabled(false);
			}

			JButton button = new JButton("" + i);
			add(button);
			botoes.add(button);
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				System.out.println(e);
				
				JButton b = (JButton)e.getSource();
				System.out.println(b.getText());
				}
			});

		}
	}

}
