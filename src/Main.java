import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Main extends JPanel {

	/**
	 * Create the panel.
	 */
	public Main(JFrame frame) {
		setLayout(null);
		JButton OrderButton = new JButton("Order");
		OrderButton.addActionListener(new ActionListener() {
		JPanel Order2 = new Order2(frame);
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().add(Order2);
				Order2.setVisible(true);
				setVisible(false);
				
				
			}
		});
		OrderButton.setBounds(56, 100, 317, 58);
		add(OrderButton);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(51, 169, 155, 65);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(216, 169, 161, 65);
		add(btnNewButton_2);

	}

}
