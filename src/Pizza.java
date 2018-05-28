import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;

import javax.swing.Box;

import java.awt.Dimension;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;

import javax.swing.UIManager;

import java.awt.Font;


public class Pizza extends JPanel {
	public int count = 1;
	private JTextField textField;
	//public ArrayList<String> orderList;
	/**
	 * Create the panel.
	 * @param priceList 
	 * @param orderList2 
	 */

	public Pizza(Launch launch, DefaultListModel<String> model, ArrayList<String> orderList, ArrayList<String> priceList) {
		setBackground(Color.LIGHT_GRAY);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{200, 200, 0};
		gridBagLayout.rowHeights = new int[]{50, 450, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{25, 75, 75, 25, 0};
		gbl_panel_1.rowHeights = new int[]{20, 40, 10, 40, 10, 40, 25, 60, 50, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_4 = new GridBagConstraints();
		gbc_rigidArea_4.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_4.gridwidth = 4;
		gbc_rigidArea_4.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_4.gridx = 0;
		gbc_rigidArea_4.gridy = 0;
		panel_1.add(rigidArea_4, gbc_rigidArea_4);
		
		JButton btnSmall = new JButton("Small");
		btnSmall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launch.setSize("S");
				launch.getToppings().setVisible(true);
				setVisible(false);
			}
		});
		btnSmall.setFont(btnSmall.getFont().deriveFont(btnSmall.getFont().getSize() + 25f));
		GridBagConstraints gbc_btnSmall = new GridBagConstraints();
		gbc_btnSmall.gridwidth = 2;
		gbc_btnSmall.fill = GridBagConstraints.BOTH;
		gbc_btnSmall.insets = new Insets(0, 0, 5, 5);
		gbc_btnSmall.gridx = 1;
		gbc_btnSmall.gridy = 1;
		panel_1.add(btnSmall, gbc_btnSmall);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_2 = new GridBagConstraints();
		gbc_rigidArea_2.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_2.gridwidth = 2;
		gbc_rigidArea_2.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_2.gridx = 1;
		gbc_rigidArea_2.gridy = 2;
		panel_1.add(rigidArea_2, gbc_rigidArea_2);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
		gbc_rigidArea_1.gridheight = 8;
		gbc_rigidArea_1.gridx = 3;
		gbc_rigidArea_1.gridy = 1;
		panel_1.add(rigidArea_1, gbc_rigidArea_1);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.gridheight = 7;
		gbc_rigidArea.fill = GridBagConstraints.BOTH;
		gbc_rigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea.gridx = 0;
		gbc_rigidArea.gridy = 1;
		panel_1.add(rigidArea, gbc_rigidArea);
		
		JButton btnMedium = new JButton("Medium");
		btnMedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launch.setSize("M");
				launch.getToppings().setVisible(true);
				setVisible(false);
			}
		});
		btnMedium.setFont(btnMedium.getFont().deriveFont(btnMedium.getFont().getSize() + 25f));
		GridBagConstraints gbc_btnMedium = new GridBagConstraints();
		gbc_btnMedium.gridwidth = 2;
		gbc_btnMedium.fill = GridBagConstraints.BOTH;
		gbc_btnMedium.insets = new Insets(0, 0, 5, 5);
		gbc_btnMedium.gridx = 1;
		gbc_btnMedium.gridy = 3;
		panel_1.add(btnMedium, gbc_btnMedium);
		
		Component rigidArea_10 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_10 = new GridBagConstraints();
		gbc_rigidArea_10.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_10.gridwidth = 2;
		gbc_rigidArea_10.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_10.gridx = 1;
		gbc_rigidArea_10.gridy = 4;
		panel_1.add(rigidArea_10, gbc_rigidArea_10);
		
		JButton btnLarge = new JButton("Large");
		btnLarge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launch.setSize("L");
				launch.getToppings().setVisible(true);
				setVisible(false);
			}
		});
		btnLarge.setFont(btnLarge.getFont().deriveFont(btnLarge.getFont().getSize() + 25f));
		GridBagConstraints gbc_btnLarge = new GridBagConstraints();
		gbc_btnLarge.fill = GridBagConstraints.BOTH;
		gbc_btnLarge.gridwidth = 2;
		gbc_btnLarge.insets = new Insets(0, 0, 5, 5);
		gbc_btnLarge.gridx = 1;
		gbc_btnLarge.gridy = 5;
		panel_1.add(btnLarge, gbc_btnLarge);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_3 = new GridBagConstraints();
		gbc_rigidArea_3.gridwidth = 2;
		gbc_rigidArea_3.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_3.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_3.gridx = 1;
		gbc_rigidArea_3.gridy = 6;
		panel_1.add(rigidArea_3, gbc_rigidArea_3);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(btnBack.getFont().deriveFont(btnBack.getFont().getSize() + 10f));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launch.getOrder().setVisible(true);
				setVisible(false);
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{75, 133, 200, 16, 0};
		gbl_panel.rowHeights = new int[]{50, 50, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_5 = new GridBagConstraints();
		gbc_rigidArea_5.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_5.gridheight = 2;
		gbc_rigidArea_5.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea_5.gridx = 0;
		gbc_rigidArea_5.gridy = 0;
		panel.add(rigidArea_5, gbc_rigidArea_5);
		
		JLabel lblChooseSize = new JLabel("Choose Size");
		lblChooseSize.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseSize.setFont(lblChooseSize.getFont().deriveFont(lblChooseSize.getFont().getSize() + 50f));
		GridBagConstraints gbc_lblChooseSize = new GridBagConstraints();
		gbc_lblChooseSize.fill = GridBagConstraints.BOTH;
		gbc_lblChooseSize.gridheight = 2;
		gbc_lblChooseSize.insets = new Insets(0, 0, 0, 5);
		gbc_lblChooseSize.gridx = 1;
		gbc_lblChooseSize.gridy = 0;
		panel.add(lblChooseSize, gbc_lblChooseSize);
		
		Component rigidArea_7 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_7 = new GridBagConstraints();
		gbc_rigidArea_7.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_7.gridheight = 2;
		gbc_rigidArea_7.gridx = 3;
		gbc_rigidArea_7.gridy = 0;
		panel.add(rigidArea_7, gbc_rigidArea_7);
		
		JButton button = new JButton("Checkout");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launch.getReceipt().setVisible(true);
				setVisible(false);
			}
		});
		button.setIcon(new ImageIcon(Pizza.class.getResource("/Icons/rsz_checkout-light.png")));
		button.setFont(button.getFont().deriveFont(button.getFont().getSize() + 10f));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridx = 2;
		gbc_button.gridy = 1;
		panel.add(button, gbc_button);
		btnBack.setIcon(new ImageIcon(Order.class.getResource("/Icons/back (1).png")));
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.fill = GridBagConstraints.BOTH;
		gbc_btnBack.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack.gridx = 1;
		gbc_btnBack.gridy = 7;
		panel_1.add(btnBack, gbc_btnBack);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(panel_1, gbc);
		
		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_6 = new GridBagConstraints();
		gbc_rigidArea_6.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_6.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea_6.gridx = 1;
		gbc_rigidArea_6.gridy = 8;
		panel_1.add(rigidArea_6, gbc_rigidArea_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 87, 87, 26};
		gbl_panel_2.rowHeights = new int[]{350, 50, 25, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0};
		gbl_panel_2.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 0;
		panel_2.add(scrollPane, gbc_scrollPane);
		
		JList<String> list = new JList<String>(model);
		
		list.setFont(list.getFont().deriveFont(list.getFont().getSize() + 8f));
		scrollPane.setViewportView(list);
		
		JLabel lblNewLabel = new JLabel("Cart");
		scrollPane.setColumnHeaderView(lblNewLabel);
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getSize() + 15f));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		/*textField = new JTextField();
		textField.setText("Total Price: 0.0");
		textField.setColumns(10);
		scrollPane.setRowHeaderView(textField);
		*/
		GridBagConstraints gbc_1 = new GridBagConstraints();
		gbc_1.fill = GridBagConstraints.BOTH;
		gbc_1.gridx = 1;
		gbc_1.gridy = 1;
		add(panel_2, gbc_1);
		
		JButton btnDeleteSelection = new JButton("Delete Selection");
		btnDeleteSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderList.remove(list.getSelectedIndex());
				priceList.remove(list.getSelectedIndex());
				
				
				model.clear();
				for(int i = 0; i < orderList.size(); i++){
					model.addElement((i+1) + ". " + orderList.get(i));
					
				}
				
			}
		});
		
		Component rigidArea_8 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_8 = new GridBagConstraints();
		gbc_rigidArea_8.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_8.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_8.gridx = 3;
		gbc_rigidArea_8.gridy = 0;
		panel_2.add(rigidArea_8, gbc_rigidArea_8);
		btnDeleteSelection.setFont(btnDeleteSelection.getFont().deriveFont(btnDeleteSelection.getFont().getSize() + 10f));
		GridBagConstraints gbc_btnDeleteSelection = new GridBagConstraints();
		gbc_btnDeleteSelection.insets = new Insets(0, 0, 5, 5);
		gbc_btnDeleteSelection.fill = GridBagConstraints.BOTH;
		gbc_btnDeleteSelection.gridx = 1;
		gbc_btnDeleteSelection.gridy = 1;
		panel_2.add(btnDeleteSelection, gbc_btnDeleteSelection);
		
		JButton btnClearCart = new JButton("Clear Cart");
		btnClearCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.clear();
				orderList.clear();
				priceList.clear();
			}
		});
		btnClearCart.setFont(btnClearCart.getFont().deriveFont(btnClearCart.getFont().getSize() + 10f));
		GridBagConstraints gbc_btnClearCart = new GridBagConstraints();
		gbc_btnClearCart.fill = GridBagConstraints.BOTH;
		gbc_btnClearCart.insets = new Insets(0, 0, 5, 5);
		gbc_btnClearCart.gridx = 2;
		gbc_btnClearCart.gridy = 1;
		panel_2.add(btnClearCart, gbc_btnClearCart);
		
		Component rigidArea_9 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_9 = new GridBagConstraints();
		gbc_rigidArea_9.gridwidth = 2;
		gbc_rigidArea_9.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_9.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea_9.gridx = 1;
		gbc_rigidArea_9.gridy = 2;
		panel_2.add(rigidArea_9, gbc_rigidArea_9);

	}
}
