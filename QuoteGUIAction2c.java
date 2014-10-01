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

public class QuoteGUIAction2c {
	public QuoteGUIAction2c() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("08-600 Sample Quote GUI");
		frame.setSize(480, 420);

		JPanel pane = new JPanel();

		Font font = new Font(Font.SERIF, Font.BOLD, 20);

		JLabel label = new JLabel("How about a presidential quote?");
		label.setFont(font);
		pane.add(label);

		JButton obamaButton = new JButton(new ImageIcon("obama.jpg"));
		JButton gwbButton = new JButton(new ImageIcon("gwb.jpg"));

		JPanel line = new JPanel();
		line.add(obamaButton);
		line.add(gwbButton);
		pane.add(line);

		JTextArea textArea = new JTextArea(10, 30);
		textArea.setText("Click image for a presidential quote.\n");
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);

		JScrollPane scroller = new JScrollPane(textArea);
		pane.add(scroller);

		obamaButton.addActionListener(new ObamaActionListener(textArea));
		gwbButton.addActionListener(new GWBActionListener(textArea));

		frame.setContentPane(pane);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new QuoteGUIAction2c();
	}

	private static class ObamaActionListener implements ActionListener {
		private JTextArea area;

		public ObamaActionListener(JTextArea a) {
			area = a;
		}

		public void actionPerformed(ActionEvent event) {
			area.append("Yes we can!\n");
		}
	}

	private static class GWBActionListener implements ActionListener {
		private JTextArea area;

		public GWBActionListener(JTextArea a) {
			area = a;
		}

		public void actionPerformed(ActionEvent event) {
			area.append("Nukular!\n");
		}
	}
}
