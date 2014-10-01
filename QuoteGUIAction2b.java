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

public class QuoteGUIAction2b {
	private JButton obamaButton;
	private JButton gwbButton;
	private JTextArea textArea;

	public QuoteGUIAction2b() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("08-600 Sample Quote GUI");
		frame.setSize(480, 420);

		JPanel pane = new JPanel();

		Font font = new Font(Font.SERIF, Font.BOLD, 20);

		JLabel label = new JLabel("How about a presidential quote?");
		label.setFont(font);
		pane.add(label);

		ActionListener listener = new MyActionListener();
		
		obamaButton = new JButton(new ImageIcon("obama.jpg"));
		obamaButton.addActionListener(listener);

		gwbButton = new JButton(new ImageIcon("gwb.jpg"));
		gwbButton.addActionListener(listener);

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

		frame.setContentPane(pane);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new QuoteGUIAction2b();
	}

	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == obamaButton) {
				textArea.append("Yes we can!\n");
			}

			if (event.getSource() == gwbButton) {
				textArea.append("Nukular!\n");
			}
		}
	}
}
