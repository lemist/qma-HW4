import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class QuoteGUIAction1a extends JFrame implements ActionListener {
	private JButton obamaButton;
	private JButton gwbButton;
	private JTextArea textArea;

	public QuoteGUIAction1a() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("08-600 Sample Quote GUI");
		setSize(480, 420);

		JPanel pane = new JPanel();

		Font font = new Font(Font.SERIF, Font.BOLD, 20);

		JLabel label = new JLabel("How about a presidential quote?");
		label.setFont(font);
		pane.add(label);

		obamaButton = new JButton(new ImageIcon("obama.jpg"));
		obamaButton.addActionListener(this);

		gwbButton = new JButton(new ImageIcon("gwb.jpg"));
		gwbButton.addActionListener(this);

		JPanel line = new JPanel();
		line.add(obamaButton);
		line.add(gwbButton);
		pane.add(line);

		textArea = new JTextArea(10, 30);
		textArea.setText("Click image for a presidential quote.\n");
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);

		JScrollPane scroller = new JScrollPane(textArea);
		pane.add(scroller);

		setContentPane(pane);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == obamaButton) {
			textArea.append("Yes we can!\n");
		}
		
		if (event.getSource() == gwbButton) {
			textArea.append("Nukular!\n");
		}
	}

	public static void main(String[] args) {
		new QuoteGUIAction1a();
	}
}
