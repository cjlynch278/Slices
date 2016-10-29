import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class e extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					e frame = new e();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public e() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JLabel topping_title = new JLabel("TOPPING SELECTION");
		topping_title.setAlignmentX(Component.CENTER_ALIGNMENT);
		topping_title.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		topping_title.setForeground(Color.RED);
		contentPane.add(topping_title);
		
		JPanel main_panel = new JPanel();
		contentPane.add(main_panel);
		main_panel.setLayout(new BoxLayout(main_panel, BoxLayout.X_AXIS));
		
		JPanel topping_grid = new JPanel();
		topping_grid.setBackground(Color.DARK_GRAY);
		main_panel.add(topping_grid);
		GridBagLayout gbl_topping_grid = new GridBagLayout();
		gbl_topping_grid.columnWidths = new int[]{0, 117, 0};
		gbl_topping_grid.rowHeights = new int[]{0, 29, 0, 0, 0, 0, 0, 0, 0};
		gbl_topping_grid.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_topping_grid.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		topping_grid.setLayout(gbl_topping_grid);
		
		Component blank_rigid = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_blank_rigid = new GridBagConstraints();
		gbc_blank_rigid.insets = new Insets(0, 0, 5, 0);
		gbc_blank_rigid.gridx = 1;
		gbc_blank_rigid.gridy = 0;
		topping_grid.add(blank_rigid, gbc_blank_rigid);
		
		JButton pepperoni_topping = new JButton("Pepperoni");
		GridBagConstraints gbc_pepperoni_topping = new GridBagConstraints();
		gbc_pepperoni_topping.insets = new Insets(0, 0, 5, 5);
		gbc_pepperoni_topping.gridx = 0;
		gbc_pepperoni_topping.gridy = 1;
		topping_grid.add(pepperoni_topping, gbc_pepperoni_topping);
		
		JButton xcheese_topping = new JButton("Extra Cheese");
		GridBagConstraints gbc_xcheese_topping = new GridBagConstraints();
		gbc_xcheese_topping.insets = new Insets(0, 0, 5, 0);
		gbc_xcheese_topping.gridx = 1;
		gbc_xcheese_topping.gridy = 1;
		topping_grid.add(xcheese_topping, gbc_xcheese_topping);
		
		JButton sausage_topping = new JButton("Sausage");
		GridBagConstraints gbc_sausage_topping = new GridBagConstraints();
		gbc_sausage_topping.insets = new Insets(0, 0, 5, 5);
		gbc_sausage_topping.gridx = 0;
		gbc_sausage_topping.gridy = 2;
		topping_grid.add(sausage_topping, gbc_sausage_topping);
		
		JButton gpeppers_topping = new JButton("Green Peppers");
		GridBagConstraints gbc_gpeppers_topping = new GridBagConstraints();
		gbc_gpeppers_topping.insets = new Insets(0, 0, 5, 0);
		gbc_gpeppers_topping.gridx = 1;
		gbc_gpeppers_topping.gridy = 2;
		topping_grid.add(gpeppers_topping, gbc_gpeppers_topping);
		
		JButton bacon_topping = new JButton("Bacon");
		GridBagConstraints gbc_bacon_topping = new GridBagConstraints();
		gbc_bacon_topping.anchor = GridBagConstraints.BELOW_BASELINE;
		gbc_bacon_topping.insets = new Insets(0, 0, 5, 5);
		gbc_bacon_topping.gridx = 0;
		gbc_bacon_topping.gridy = 3;
		topping_grid.add(bacon_topping, gbc_bacon_topping);
		
		JButton onions_topping = new JButton("Onions");
		onions_topping.setFont(onions_topping.getFont().deriveFont(onions_topping.getFont().getSize() + 9f));
		onions_topping.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_onions_topping = new GridBagConstraints();
		gbc_onions_topping.fill = GridBagConstraints.BOTH;
		gbc_onions_topping.insets = new Insets(0, 0, 5, 0);
		gbc_onions_topping.gridx = 1;
		gbc_onions_topping.gridy = 3;
		topping_grid.add(onions_topping, gbc_onions_topping);
		
		Component blank_rigid4 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_blank_rigid4 = new GridBagConstraints();
		gbc_blank_rigid4.insets = new Insets(0, 0, 5, 5);
		gbc_blank_rigid4.gridx = 0;
		gbc_blank_rigid4.gridy = 4;
		topping_grid.add(blank_rigid4, gbc_blank_rigid4);
		
		Component blank_rigid2 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_blank_rigid2 = new GridBagConstraints();
		gbc_blank_rigid2.insets = new Insets(0, 0, 5, 0);
		gbc_blank_rigid2.gridx = 1;
		gbc_blank_rigid2.gridy = 4;
		topping_grid.add(blank_rigid2, gbc_blank_rigid2);
		
		Component blank_rigid5 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_blank_rigid5 = new GridBagConstraints();
		gbc_blank_rigid5.insets = new Insets(0, 0, 5, 5);
		gbc_blank_rigid5.gridx = 0;
		gbc_blank_rigid5.gridy = 5;
		topping_grid.add(blank_rigid5, gbc_blank_rigid5);
		
		Component blank_rigid3 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_blank_rigid3 = new GridBagConstraints();
		gbc_blank_rigid3.insets = new Insets(0, 0, 5, 0);
		gbc_blank_rigid3.gridx = 1;
		gbc_blank_rigid3.gridy = 5;
		topping_grid.add(blank_rigid3, gbc_blank_rigid3);
		
		JButton btnReturnToMain = new JButton("Main Menu");
		GridBagConstraints gbc_btnReturnToMain = new GridBagConstraints();
		gbc_btnReturnToMain.insets = new Insets(0, 0, 5, 5);
		gbc_btnReturnToMain.gridx = 0;
		gbc_btnReturnToMain.gridy = 6;
		topping_grid.add(btnReturnToMain, gbc_btnReturnToMain);
		
		JButton cancel_order_topping = new JButton("Cancel Order");
		GridBagConstraints gbc_cancel_order_topping = new GridBagConstraints();
		gbc_cancel_order_topping.insets = new Insets(0, 0, 5, 0);
		gbc_cancel_order_topping.gridx = 1;
		gbc_cancel_order_topping.gridy = 6;
		topping_grid.add(cancel_order_topping, gbc_cancel_order_topping);
		
		JPanel selection_grid = new JPanel();
		selection_grid.setBackground(Color.DARK_GRAY);
		main_panel.add(selection_grid);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {68, 0};
		gbl_panel_2.rowHeights = new int[]{16, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		selection_grid.setLayout(gbl_panel_2);
		
		JLabel selection_label = new JLabel("Selections:");
		selection_label.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		selection_label.setForeground(Color.WHITE);
		GridBagConstraints gbc_selection_label = new GridBagConstraints();
		gbc_selection_label.gridx = 0;
		gbc_selection_label.gridy = 0;
		selection_grid.add(selection_label, gbc_selection_label);
	}

}
