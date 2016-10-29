import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;


public class Order extends JPanel {

	/**
	 * Create the panel.
	 */
	public Order(JFrame frame) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 18, 18, 20, 100, 0, 26, 0, 0, 20, 20, 0};
		gridBagLayout.rowHeights = new int[]{41, 0, 0, 0, 0, 0, 0, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 3.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel OrderButton = new JLabel("Order!");
		OrderButton.setFont(OrderButton.getFont().deriveFont(OrderButton.getFont().getSize() + 35f));
		GridBagConstraints gbc_OrderButton = new GridBagConstraints();
		gbc_OrderButton.fill = GridBagConstraints.VERTICAL;
		gbc_OrderButton.gridwidth = 26;
		gbc_OrderButton.gridheight = 2;
		gbc_OrderButton.insets = new Insets(0, 0, 5, 0);
		gbc_OrderButton.gridx = 1;
		gbc_OrderButton.gridy = 1;
		add(OrderButton, gbc_OrderButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 6;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 19;
		gbc_lblNewLabel.gridy = 6;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridwidth = 6;
		gbc_list.gridheight = 10;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 19;
		gbc_list.gridy = 7;
		add(list, gbc_list);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton pizzaButton = new JButton("Pizza");
		pizzaButton.setForeground(Color.BLUE);
		GridBagConstraints gbc_pizzaButton = new GridBagConstraints();
		gbc_pizzaButton.gridwidth = 11;
		gbc_pizzaButton.fill = GridBagConstraints.BOTH;
		gbc_pizzaButton.insets = new Insets(0, 0, 5, 5);
		gbc_pizzaButton.gridx = 2;
		gbc_pizzaButton.gridy = 8;
		add(pizzaButton, gbc_pizzaButton);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.gridwidth = 11;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 11;
		add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton_2.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_2.gridwidth = 11;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 16;
		add(btnNewButton_2, gbc_btnNewButton_2);

	}

}
