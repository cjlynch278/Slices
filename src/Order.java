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
import java.util.Scanner;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;

import javax.swing.UIManager;

import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;


public class Order extends JPanel {
	public int count = 1;
	
	//public ArrayList<String> orderList;
	/**
	 * Create the panel.
	 * @param orderList 
	 * @param total 
	 */
	
	private JTextField textField;
	public Order(Launch launch, DefaultListModel<String> model, ArrayList<String> orderList, double total,ArrayList<String> priceList, DefaultListModel<String> priceModel) {
		
		File file = new File("Prices");
		ArrayList<Double> prices = new ArrayList<Double>();
		
		
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()){
				
				prices.add(Double.parseDouble(scan.nextLine()));
			}
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		setBackground(Color.LIGHT_GRAY);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{200, 200, 0};
		gridBagLayout.rowHeights = new int[]{50, 450, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{143, 133, 250, 16, 0};
		gbl_panel_3.rowHeights = new int[]{25, 25, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
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
		lblNewLabel_1.setFont(lblNewLabel_1.getFont().deriveFont(lblNewLabel_1.getFont().getSize() + 60f));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.gridheight = 2;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		panel_3.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
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
		
		JButton btnCheckou = new JButton("Checkout");
		btnCheckou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launch.getReceipt().setVisible(true);
				setVisible(false);
				
			}
		});
		btnCheckou.setIcon(new ImageIcon(Order.class.getResource("/Backicon/rsz_checkout-light.png")));
		btnCheckou.setFont(btnCheckou.getFont().deriveFont(btnCheckou.getFont().getSize() + 10f));
		GridBagConstraints gbc_btnCheckou = new GridBagConstraints();
		gbc_btnCheckou.fill = GridBagConstraints.BOTH;
		gbc_btnCheckou.insets = new Insets(0, 0, 0, 5);
		gbc_btnCheckou.gridx = 2;
		gbc_btnCheckou.gridy = 1;
		panel_3.add(btnCheckou, gbc_btnCheckou);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{25, 75, 75, 25, 0};
		gbl_panel_1.rowHeights = new int[]{25, 100, 25, 100, 25, 60, 50, 0};
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
		btnNewButton.setFont(btnNewButton.getFont().deriveFont(btnNewButton.getFont().getSize() + 25f));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				launch.getPizza().setVisible(true);
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
		gbc_rigidArea_2.fill = GridBagConstraints.BOTH;
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
		btnNewButton_1.setFont(btnNewButton_1.getFont().deriveFont(btnNewButton_1.getFont().getSize() + 25f));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				model.clear();
				priceModel.clear();
				priceList.add(prices.get(6).toString());
				for(int i = 0; i < priceList.size(); i++){
					priceModel.addElement((i+1) + ". " + priceList.get(i));
					
				}
				orderList.add("Beverage");
				System.out.println(total);
				
				for(int i = 0; i < orderList.size(); i++){
					model.addElement((i+1) + ". " + orderList.get(i));
					
				}
				
				//txtTotalPrice.setText("Total Price: " + (total + (total*(prices.get(7)/100))));
				
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
		btnBack.setFont(btnBack.getFont().deriveFont(btnBack.getFont().getSize() + 10f));
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
		gbl_panel_2.columnWidths = new int[]{87, 87, 26};
		gbl_panel_2.rowHeights = new int[]{350, 50, 25, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0, 1.0};
		gbl_panel_2.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
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
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getSize() + 15f));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		/*textField = new JTextField();
		textField.setText("Total Price: ");
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
				priceModel.clear();
				for(int i = 0; i < priceList.size(); i++){
					model.addElement((i+1) + ". " + orderList.get(i));
					
				}
			}
		});
		
		Component rigidArea_8 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_8 = new GridBagConstraints();
		gbc_rigidArea_8.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_8.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_8.gridx = 2;
		gbc_rigidArea_8.gridy = 0;
		panel_2.add(rigidArea_8, gbc_rigidArea_8);
		btnDeleteSelection.setFont(btnDeleteSelection.getFont().deriveFont(btnDeleteSelection.getFont().getSize() + 10f));
		GridBagConstraints gbc_btnDeleteSelection = new GridBagConstraints();
		gbc_btnDeleteSelection.insets = new Insets(0, 0, 5, 5);
		gbc_btnDeleteSelection.fill = GridBagConstraints.BOTH;
		gbc_btnDeleteSelection.gridx = 0;
		gbc_btnDeleteSelection.gridy = 1;
		panel_2.add(btnDeleteSelection, gbc_btnDeleteSelection);
		
		JButton btnClearCart = new JButton("Clear Cart");
		btnClearCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.clear();
				orderList.clear();
				priceModel.clear();
				priceList.clear();
				
				
			}
		});
		btnClearCart.setFont(btnClearCart.getFont().deriveFont(btnClearCart.getFont().getSize() + 10f));
		GridBagConstraints gbc_btnClearCart = new GridBagConstraints();
		gbc_btnClearCart.fill = GridBagConstraints.BOTH;
		gbc_btnClearCart.insets = new Insets(0, 0, 5, 5);
		gbc_btnClearCart.gridx = 1;
		gbc_btnClearCart.gridy = 1;
		panel_2.add(btnClearCart, gbc_btnClearCart);
		
		Component rigidArea_9 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_9 = new GridBagConstraints();
		gbc_rigidArea_9.gridwidth = 2;
		gbc_rigidArea_9.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_9.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea_9.gridx = 0;
		gbc_rigidArea_9.gridy = 2;
		panel_2.add(rigidArea_9, gbc_rigidArea_9);

	}
}
