package week3.day15;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonClick implements ActionListener {

	private int counter = 0;

	private JLabel counterLabel;

	private JButton countUpButton;

	// private JButton countDownButton;

	public JPanel createPanel() {

		JPanel bcPanel = new JPanel();
		

		countUpButton = new JButton ("Count up");
		countUpButton.addActionListener(this);
		bcPanel.add(countUpButton);
		
		// countDownButton = new JButton ("Count down");
		// countDownButton.addActionListener(this);
		// bcPanel.add(countDownButton);
		

		counterLabel = new JLabel("" + counter);
		bcPanel.add(counterLabel);
		
		return bcPanel;
	}
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == countUpButton) {
			counter++;
			
			counterLabel.setText("" + counter);
		}
		else {
			counter--;
			counterLabel.setText("" + counter);
		}
	}
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Click Me!");
		f.setSize(new Dimension(400, 400));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ButtonClick bc = new ButtonClick();
		JPanel bcPanel = bc.createPanel(); 
			
		Container contentPane = f.getContentPane();
		contentPane.add(bcPanel, BorderLayout.CENTER);
		
		f.setVisible(true);

	}

}