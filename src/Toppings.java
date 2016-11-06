import javax.swing.JPanel;


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
import java.awt.Font;


public class Toppings extends JPanel {
	public int count = 1;
	ArrayList<String> orderList;
	/**
	 * Create the panel.
	 */
	DefaultListModel<String> model = new DefaultListModel<>();
	public Toppings(JFrame frame, Launch launch , ArrayList<String> o, DefaultListModel<String> model) {
		orderList = o;
		setBackground(Color.LIGHT_GRAY);
		
		
		
		for(int i =0; i<orderList.size() ; i++){
			model.addElement((i+1) + ". " +orderList.get(i));
		}
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{1, 271, 200, 0};
		gridBagLayout.rowHeights = new int[]{1, 98, 371, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{100, 200, 75, 25, 0};
		gbl_panel_3.rowHeights = new int[]{50, 50, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_6 = new GridBagConstraints();
		gbc_rigidArea_6.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_6.gridheight = 2;
		gbc_rigidArea_6.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea_6.gridx = 0;
		gbc_rigidArea_6.gridy = 0;
		panel_3.add(rigidArea_6, gbc_rigidArea_6);
		
		JLabel label = new JLabel("Order");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(label.getFont().deriveFont(label.getFont().getSize() + 20f));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.BOTH;
		gbc_label.gridheight = 2;
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		panel_3.add(label, gbc_label);
		
		Component rigidArea_8 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_8 = new GridBagConstraints();
		gbc_rigidArea_8.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_8.gridheight = 2;
		gbc_rigidArea_8.gridx = 3;
		gbc_rigidArea_8.gridy = 0;
		panel_3.add(rigidArea_8, gbc_rigidArea_8);
		
		JButton button = new JButton("Check Out");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridx = 2;
		gbc_button.gridy = 1;
		panel_3.add(button, gbc_button);
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridwidth = 2;
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 1;
		add(panel_3, gbc_panel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{38, 217, 1, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0, 1.0};
		gbl_panel_2.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel = new JLabel("Cart");
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getSize() + 7f));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		panel_2.add(scrollPane, gbc_scrollPane);
		JList<String> list = new JList<String>(model);
		list.setFont(list.getFont().deriveFont(list.getFont().getSize() + 8f));
		scrollPane.setViewportView(list);
		
		JButton btnDeleteSelection = new JButton("Delete Selection");
		btnDeleteSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderList.remove(list.getSelectedIndex());
				
				model.clear();
				for(int i = 0; i < orderList.size(); i++){
					model.addElement((i+1) + ". " + orderList.get(i));
					
				}
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{20, 103, 108, 50, 0};
		gbl_panel_1.rowHeights = new int[]{21, 40, 10, 40, 10, 0, 10, 34, 10, 40, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_4 = new GridBagConstraints();
		gbc_rigidArea_4.gridwidth = 3;
		gbc_rigidArea_4.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_4.gridx = 0;
		gbc_rigidArea_4.gridy = 0;
		panel_1.add(rigidArea_4, gbc_rigidArea_4);
		
		JButton btnNewButton = new JButton("Pepperroni");
		btnNewButton.setFont(btnNewButton.getFont().deriveFont(btnNewButton.getFont().getSize() + 1f));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.clear();
				orderList.add("(" + launch.getSize() + ")" + " Peperronni Pizza" );

				for(int i = 0; i < orderList.size(); i++){
					model.addElement((i+1) + ". " + orderList.get(i));
					
				}
				
					
			
			}
		});
		
		Component rigidArea_10 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_10 = new GridBagConstraints();
		gbc_rigidArea_10.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_10.gridx = 3;
		gbc_rigidArea_10.gridy = 0;
		panel_1.add(rigidArea_10, gbc_rigidArea_10);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 1;
		panel_1.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mushrooms");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.clear();
				orderList.add("Beverage");
				
				
				for(int i = 0; i < orderList.size(); i++){
					model.addElement((i+1) + ". " + orderList.get(i));
					
				}
				
				count++;
				
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 1;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
		
		Component rigidArea_7 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_7 = new GridBagConstraints();
		gbc_rigidArea_7.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_7.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_7.gridx = 3;
		gbc_rigidArea_7.gridy = 1;
		panel_1.add(rigidArea_7, gbc_rigidArea_7);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_2 = new GridBagConstraints();
		gbc_rigidArea_2.gridwidth = 2;
		gbc_rigidArea_2.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_2.gridx = 1;
		gbc_rigidArea_2.gridy = 2;
		panel_1.add(rigidArea_2, gbc_rigidArea_2);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea.gridx = 0;
		gbc_rigidArea.gridy = 3;
		panel_1.add(rigidArea, gbc_rigidArea);
		
		JButton btnLarge = new JButton("Bacon");
		btnLarge.setFont(btnLarge.getFont().deriveFont(btnLarge.getFont().getSize() + 1f));
		GridBagConstraints gbc_btnLarge = new GridBagConstraints();
		gbc_btnLarge.fill = GridBagConstraints.BOTH;
		gbc_btnLarge.insets = new Insets(0, 0, 5, 5);
		gbc_btnLarge.gridx = 1;
		gbc_btnLarge.gridy = 3;
		panel_1.add(btnLarge, gbc_btnLarge);
		
		JButton btnSausage = new JButton("Sausage");
		btnSausage.setFont(btnSausage.getFont().deriveFont(btnSausage.getFont().getSize() + 1f));
		btnSausage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnSausage = new GridBagConstraints();
		gbc_btnSausage.fill = GridBagConstraints.BOTH;
		gbc_btnSausage.insets = new Insets(0, 0, 5, 5);
		gbc_btnSausage.gridx = 2;
		gbc_btnSausage.gridy = 3;
		panel_1.add(btnSausage, gbc_btnSausage);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_3 = new GridBagConstraints();
		gbc_rigidArea_3.gridwidth = 2;
		gbc_rigidArea_3.fill = GridBagConstraints.VERTICAL;
		gbc_rigidArea_3.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_3.gridx = 1;
		gbc_rigidArea_3.gridy = 4;
		panel_1.add(rigidArea_3, gbc_rigidArea_3);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launch.getPizza().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton btnOnion = new JButton("Onions");
		btnOnion.setFont(btnOnion.getFont().deriveFont(btnOnion.getFont().getSize() + 1f));
		GridBagConstraints gbc_btnOnion = new GridBagConstraints();
		gbc_btnOnion.fill = GridBagConstraints.BOTH;
		gbc_btnOnion.insets = new Insets(0, 0, 5, 5);
		gbc_btnOnion.gridx = 1;
		gbc_btnOnion.gridy = 5;
		panel_1.add(btnOnion, gbc_btnOnion);
		
		JButton btnExtraCheese = new JButton("Extra Cheese");
		GridBagConstraints gbc_btnExtraCheese = new GridBagConstraints();
		gbc_btnExtraCheese.fill = GridBagConstraints.BOTH;
		gbc_btnExtraCheese.insets = new Insets(0, 0, 5, 5);
		gbc_btnExtraCheese.gridx = 2;
		gbc_btnExtraCheese.gridy = 5;
		panel_1.add(btnExtraCheese, gbc_btnExtraCheese);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_5 = new GridBagConstraints();
		gbc_rigidArea_5.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_5.gridwidth = 2;
		gbc_rigidArea_5.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_5.gridx = 1;
		gbc_rigidArea_5.gridy = 6;
		panel_1.add(rigidArea_5, gbc_rigidArea_5);
		
		JButton btnGreenPepper = new JButton("Green Peppers");
		btnGreenPepper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnGreenPepper = new GridBagConstraints();
		gbc_btnGreenPepper.fill = GridBagConstraints.BOTH;
		gbc_btnGreenPepper.insets = new Insets(0, 0, 5, 5);
		gbc_btnGreenPepper.gridx = 1;
		gbc_btnGreenPepper.gridy = 7;
		panel_1.add(btnGreenPepper, gbc_btnGreenPepper);
		
		JButton btnNone = new JButton("None");
		btnNone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNone.setFont(btnNone.getFont().deriveFont(btnNone.getFont().getSize() + 2f));
		GridBagConstraints gbc_btnNone = new GridBagConstraints();
		gbc_btnNone.fill = GridBagConstraints.BOTH;
		gbc_btnNone.insets = new Insets(0, 0, 5, 5);
		gbc_btnNone.gridx = 2;
		gbc_btnNone.gridy = 7;
		panel_1.add(btnNone, gbc_btnNone);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
		gbc_rigidArea_1.gridwidth = 2;
		gbc_rigidArea_1.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_1.gridx = 1;
		gbc_rigidArea_1.gridy = 8;
		panel_1.add(rigidArea_1, gbc_rigidArea_1);
		btnBack.setIcon(new ImageIcon(Order.class.getResource("/Backicon/back (1).png")));
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.fill = GridBagConstraints.BOTH;
		gbc_btnBack.insets = new Insets(0, 0, 0, 5);
		gbc_btnBack.gridx = 1;
		gbc_btnBack.gridy = 9;
		panel_1.add(btnBack, gbc_btnBack);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.EAST;
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 2;
		add(panel_1, gbc_panel_1);
		btnDeleteSelection.setFont(btnDeleteSelection.getFont().deriveFont(btnDeleteSelection.getFont().getSize() + 4f));
		GridBagConstraints gbc_btnDeleteSelection = new GridBagConstraints();
		gbc_btnDeleteSelection.gridwidth = 3;
		gbc_btnDeleteSelection.fill = GridBagConstraints.BOTH;
		gbc_btnDeleteSelection.gridx = 0;
		gbc_btnDeleteSelection.gridy = 2;
		panel_2.add(btnDeleteSelection, gbc_btnDeleteSelection);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 2;
		gbc_panel_2.gridy = 2;
		add(panel_2, gbc_panel_2);

	}
}