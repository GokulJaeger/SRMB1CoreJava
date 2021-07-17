package Assessment.SwingInsert;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MinForm extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MinForm frame = new MinForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public MinForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Car Id");
		l1.setBounds(10, 29, 49, 14);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Car Name");
		l2.setBounds(10, 69, 49, 14);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("car Model");
		l3.setBounds(10, 126, 49, 14);
		contentPane.add(l3);
		
		
		t1 = new JTextField();
		t1.setBounds(66, 26, 96, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(66, 66, 96, 20);
		contentPane.add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(66, 123, 96, 20);
		contentPane.add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(66, 166, 96, 20);
		contentPane.add(t4);
		t4.setColumns(10);
		
		JButton b1 = new JButton("Submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=t1.getText();
				String name=t2.getText();
				String model=t3.getText();
				DBCon obj=new DBCon();
				obj.insertdata(id, name, model);
				}
		});
		b1.setBounds(212, 165, 89, 23);
		contentPane.add(b1);
	}
}
