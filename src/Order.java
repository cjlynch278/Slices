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


public class Order extends JPanel {
	public int count = 1;
	public ArrayList<String> orderList;
	/**
	 * Create the panel.
	 */
	public Order(JFrame frame, Launch launch , ArrayList<String> o, DefaultListModel<String> model) {
		orderList = o;
		setBackground(Color.LIGHT_GRAY);
		for(int i =0; i<orderList.size() ; i++){
			model.addElement((i+1) + ". " +orderList.get(i));
		}
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{200, 200, 0};
		gridBagLayout.rowHeights = new int[]{100, 400, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{100, 200, 75, 25, 0};
		gbl_panel_3.rowHeights = new int[]{50, 50, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_5 = new GridBagConstraints();
		gbc_rigidArea_5.gridheight = 2;
		gbc_rigidArea_5.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_5.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea_5.gridx = 0;
		gbc_rigidArea_5.gridy = 0;
		panel_3.add(rigidArea_5, gbc_rigidArea_5);
		
		JLabel lblNewLabel_1 = new JLabel("Order");
		lblNewLabel_1.setFont(lblNewLabel_1.getFont().deriveFont(lblNewLabel_1.getFont().getSize() + 20f));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.gridheight = 2;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		panel_3.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Check Out");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Order.class.getResource("/Backicon/rsz_checkout-light.png")));
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 1;
		panel_3.add(btnNewButton_2, gbc_btnNewButton_2);
		
		Component rigidArea_7 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_7 = new GridBagConstraints();
		gbc_rigidArea_7.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_7.gridheight = 2;
		gbc_rigidArea_7.gridx = 3;
		gbc_rigidArea_7.gridy = 0;
		panel_3.add(rigidArea_7, gbc_rigidArea_7);
		GridBagConstraints gbc_3 = new GridBagConstraints();
		gbc_3.fill = GridBagConstraints.BOTH;
		gbc_3.insets = new Insets(0, 0, 5, 0);
		gbc_3.gridwidth = 2;
		gbc_3.gridx = 0;
		gbc_3.gridy = 0;
		add(panel_3, gbc_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{25, 75, 75, 25, 0};
		gbl_panel_1.rowHeights = new int[]{25, 100, 25, 100, 25, 50, 50, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_4 = new GridBagConstraints();
		gbc_rigidArea_4.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_4.gridwidth = 4;
		gbc_rigidArea_4.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_4.gridx = 0;
		gbc_rigidArea_4.gridy = 0;
		panel_1.add(rigidArea_4, gbc_rigidArea_4);
		
		JButton btnNewButton = new JButton("Pizza");
		btnNewButton.setFont(btnNewButton.getFont().deriveFont(btnNewButton.getFont().getSize() + 9f));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				launch.getPizza().setVisible(true);
				launch.getPizza().repaint();
				
				setVisible(false);
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 1;
		panel_1.add(btnNewButton, gbc_btnNewButton);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_2 = new GridBagConstraints();
		gbc_rigidArea_2.gridwidth = 2;
		gbc_rigidArea_2.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_2.gridx = 1;
		gbc_rigidArea_2.gridy = 2;
		panel_1.add(rigidArea_2, gbc_rigidArea_2);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
		gbc_rigidArea_1.gridheight = 6;
		gbc_rigidArea_1.gridx = 3;
		gbc_rigidArea_1.gridy = 1;
		panel_1.add(rigidArea_1, gbc_rigidArea_1);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.gridheight = 5;
		gbc_rigidArea.fill = GridBagConstraints.BOTH;
		gbc_rigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea.gridx = 0;
		gbc_rigidArea.gridy = 1;
		panel_1.add(rigidArea, gbc_rigidArea);
		
		JButton btnNewButton_1 = new JButton("Beverage");
		btnNewButton_1.setFont(btnNewButton_1.getFont().deriveFont(btnNewButton_1.getFont().getSize() + 9f));
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
		gbc_btnNewButton_1.gridwidth = 2;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 3;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
		
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
				launch.getMain().setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setIcon(new ImageIcon(Order.class.getResource("/Backicon/back (1).png")));
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.fill = GridBagConstraints.BOTH;
		gbc_btnBack.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack.gridx = 1;
		gbc_btnBack.gridy = 5;
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
		gbc_rigidArea_6.gridy = 6;
		panel_1.add(rigidArea_6, gbc_rigidArea_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{175, 25};
		gbl_panel_2.rowHeights = new int[]{325, 0, 50, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0};
		gbl_panel_2.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panel_2.add(scrollPane, gbc_scrollPane);
		
		JList<String> list = new JList<String>(model);
		
		list.setFont(list.getFont().deriveFont(list.getFont().getSize() + 8f));
		scrollPane.setViewportView(list);
		
		JLabel lblNewLabel = new JLabel("Cart");
		scrollPane.setColumnHeaderView(lblNewLabel);
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getSize() + 7f));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_1 = new GridBagConstraints();
		gbc_1.fill = GridBagConstraints.BOTH;
		gbc_1.gridx = 1;
		gbc_1.gridy = 1;
		add(panel_2, gbc_1);
		
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
		
		Component rigidArea_8 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_8 = new GridBagConstraints();
		gbc_rigidArea_8.fill = GridBagConstraints.VERTICAL;
		gbc_rigidArea_8.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_8.gridx = 1;
		gbc_rigidArea_8.gridy = 0;
		panel_2.add(rigidArea_8, gbc_rigidArea_8);
		btnDeleteSelection.setFont(btnDeleteSelection.getFont().deriveFont(btnDeleteSelection.getFont().getSize() + 4f));
		GridBagConstraints gbc_btnDeleteSelection = new GridBagConstraints();
		gbc_btnDeleteSelection.insets = new Insets(0, 0, 5, 5);
		gbc_btnDeleteSelection.fill = GridBagConstraints.BOTH;
		gbc_btnDeleteSelection.gridx = 0;
		gbc_btnDeleteSelection.gridy = 1;
		panel_2.add(btnDeleteSelection, gbc_btnDeleteSelection);

	}
}
