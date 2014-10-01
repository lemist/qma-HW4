import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class QuoteGUIAction implements ActionListener {
	private JButton gwbButton;
	private JButton boButton;
	private JTextArea area;
	
	public QuoteGUIAction() {
		JFrame frame = new JFrame();
		frame.setTitle("08-600 QuoteGUI Example");
		frame.setSize(520,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pane = new JPanel();
		
		JLabel label = new JLabel("How about a quote?");
		pane.add(label);

		gwbButton = new JButton(new ImageIcon("gwb.jpg"));
		gwbButton.addActionListener(this);
		pane.add(gwbButton);
		
		boButton = new JButton(new ImageIcon("obama.jpg"));
		boButton.addActionListener(this);
		pane.add(boButton);
		
		area = new JTextArea(10,40);
		pane.add(area);
		
		frame.setContentPane(pane);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == boButton) {
			area.setText("Yes We Can!");
		} else if (evt.getSource() == gwbButton) {
			area.setText("Nukular!");
		}
	}
	
	public static void main(String[] args) {
		new QuoteGUIAction();
	}
}
