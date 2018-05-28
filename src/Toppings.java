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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;

import javax.swing.UIManager;

import java.awt.Font;


public class Toppings extends JPanel {
	
	public int count = 1;
	public ArrayList<String> orderList;
	private JTextField textField;
	public double total;
	
	/**
	 * Create the panel.
	 * @param priceList 
	 * @param priceModel 
	 * @param orderList2 
	 */

	public Toppings(Launch launch, DefaultListModel<String> model, ArrayList<String> orderList, double t, ArrayList<String> priceList, DefaultListModel<String> priceModel) {
		total = t;
		File file = new File("Prices");
		ArrayList<Double> prices = new ArrayList<Double>();
		Scanner scan;
		try {
			scan = new Scanner(file);
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{25, 75, 10, 65, 25, 0};
		gbl_panel_1.rowHeights = new int[]{50, 12, 50, 12, 50, 13, 50, 50, 60, 50, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton btnNewButton = new JButton("Pepperoni");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(total);
				
				priceModel.clear();
				for(int i = 0; i < priceList.size(); i++){
					priceModel.addElement((i+1) + ". " + priceList.get(i));
					
				}
				
				model.clear();
				orderList.add("(" + launch.getSize() + ")" + " Peperronni Pizza" );

				for(int i = 0; i < orderList.size(); i++){
					model.addElement((i+1) + ". " + orderList.get(i));
				}
				if(launch.getSize() == "S"){
					priceList.add((prices.get(0)+ prices.get(3)) + " ");
				}
				else if(launch.getSize() == "M"){
					priceList.add((prices.get(1)+ prices.get(4)) + " ");
				}
				else if(launch.getSize() == "L"){
					priceList.add((prices.get(2)+ prices.get(5)) + " ");
				}
				priceModel.clear();
				for(int i = 0; i < priceList.size(); i++){
					priceModel.addElement((i+1) + ". " + priceList.get(i));
					
				}
			}
			
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 0;
		panel_1.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnMushrooms = new JButton("Mushrooms");
		btnMushrooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(total);
				model.clear();
				orderList.add("(" + launch.getSize() + ")" + " Mushroom Pizza" );

				for(int i = 0; i < orderList.size(); i++){
					model.addElement((i+1) + ". " + orderList.get(i));
				}
				if(launch.getSize() == "S"){
					total += prices.get(0) + prices.get(3);
				}
				if(launch.getSize() == "S"){
					priceList.add((prices.get(0)+ prices.get(3)) + " ");
				}
				else if(launch.getSize() == "M"){
					priceList.add((prices.get(1)+ prices.get(4)) + " ");
				}
				else if(launch.getSize() == "L"){
					priceList.add((prices.get(2)+ prices.get(5)) + " ");
				}
				priceModel.clear();
				for(int i = 0; i < priceList.size(); i++){
					priceModel.addElement((i+1) + ". " + priceList.get(i));
					
				}
			}
		});
		GridBagConstraints gbc_btnMushrooms = new GridBagConstraints();
		gbc_btnMushrooms.gridwidth = 2;
		gbc_btnMushrooms.fill = GridBagConstraints.BOTH;
		gbc_btnMushrooms.insets = new Insets(0, 0, 5, 5);
		gbc_btnMushrooms.gridx = 2;
		gbc_btnMushrooms.gridy = 0;
		panel_1.add(btnMushrooms, gbc_btnMushrooms);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
		gbc_rigidArea_1.gridheight = 10;
		gbc_rigidArea_1.gridx = 4;
		gbc_rigidArea_1.gridy = 0;
		panel_1.add(rigidArea_1, gbc_rigidArea_1);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.gridheight = 9;
		gbc_rigidArea.fill = GridBagConstraints.BOTH;
		gbc_rigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea.gridx = 0;
		gbc_rigidArea.gridy = 0;
		panel_1.add(rigidArea, gbc_rigidArea);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_2 = new GridBagConstraints();
		gbc_rigidArea_2.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_2.gridwidth = 3;
		gbc_rigidArea_2.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_2.gridx = 1;
		gbc_rigidArea_2.gridy = 1;
		panel_1.add(rigidArea_2, gbc_rigidArea_2);
		
		JButton btnBacon = new JButton("Bacon");
		btnBacon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(total);
				model.clear();
				orderList.add("(" + launch.getSize() + ")" + " Bacon Pizza" );

				for(int i = 0; i < orderList.size(); i++){
					model.addElement((i+1) + ". " + orderList.get(i));
				}
				if(launch.getSize() == "S"){
					total += prices.get(0) + prices.get(3);
				}
				if(launch.getSize() == "S"){
					priceList.add((prices.get(0)+ prices.get(3)) + " ");
				}
				else if(launch.getSize() == "M"){
					priceList.add((prices.get(1)+ prices.get(4)) + " ");
				}
				else if(launch.getSize() == "L"){
					priceList.add((prices.get(2)+ prices.get(5)) + " ");
				}
				priceModel.clear();
				for(int i = 0; i < priceList.size(); i++){
					priceModel.addElement((i+1) + ". " + priceList.get(i));
					
				}
			}
		});
		GridBagConstraints gbc_btnBacon = new GridBagConstraints();
		gbc_btnBacon.fill = GridBagConstraints.BOTH;
		gbc_btnBacon.insets = new Insets(0, 0, 5, 5);
		gbc_btnBacon.gridx = 1;
		gbc_btnBacon.gridy = 2;
		panel_1.add(btnBacon, gbc_btnBacon);
		
		JButton btnSausage = new JButton("Sausage");
		btnSausage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(total);
				model.clear();
				orderList.add("(" + launch.getSize() + ")" + " Sausage Pizza" );

				for(int i = 0; i < orderList.size(); i++){
					model.addElement((i+1) + ". " + orderList.get(i));
				}
				if(launch.getSize() == "S"){
					total += prices.get(0) + prices.get(3);
				}
				if(launch.getSize() == "S"){
					priceList.add((prices.get(0)+ prices.get(3)) + " ");
				}
				else if(launch.getSize() == "M"){
					priceList.add((prices.get(1)+ prices.get(4)) + " ");
				}
				else if(launch.getSize() == "L"){
					priceList.add((prices.get(2)+ prices.get(5)) + " ");
				}
				priceModel.clear();
				for(int i = 0; i < priceList.size(); i++){
					priceModel.addElement((i+1) + ". " + priceList.get(i));
					
				}
			}
		});
		GridBagConstraints gbc_btnSausage = new GridBagConstraints();
		gbc_btnSausage.gridwidth = 2;
		gbc_btnSausage.fill = GridBagConstraints.BOTH;
		gbc_btnSausage.insets = new Insets(0, 0, 5, 5);
		gbc_btnSausage.gridx = 2;
		gbc_btnSausage.gridy = 2;
		panel_1.add(btnSausage, gbc_btnSausage);
		
		Component rigidArea_10 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_10 = new GridBagConstraints();
		gbc_rigidArea_10.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_10.gridwidth = 3;
		gbc_rigidArea_10.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_10.gridx = 1;
		gbc_rigidArea_10.gridy = 3;
		panel_1.add(rigidArea_10, gbc_rigidArea_10);
		
		JButton btnNewButton_1 = new JButton("Extra Cheese");
		btnNewButton_1.setFont(btnNewButton_1.getFont().deriveFont(btnNewButton_1.getFont().getSize() - 1f));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(total);
				model.clear();
				orderList.add("(" + launch.getSize() + ")" + " Extra Cheese" );

				for(int i = 0; i < orderList.size(); i++){
					model.addElement((i+1) + ". " + orderList.get(i));
				}
				if(launch.getSize() == "S"){
					total += prices.get(0) + prices.get(3);
				}
				if(launch.getSize() == "S"){
					priceList.add((prices.get(0)+ prices.get(3)) + " ");
				}
				else if(launch.getSize() == "M"){
					priceList.add((prices.get(1)+ prices.get(4)) + " ");
				}
				else if(launch.getSize() == "L"){
					priceList.add((prices.get(2)+ prices.get(5)) + " ");
				}
				priceModel.clear();
				for(int i = 0; i < priceList.size(); i++){
					priceModel.addElement((i+1) + ". " + priceList.get(i));
					
				}
				
			}
		});
		
		JButton btnOnions = new JButton("Onions");
		btnOnions.setFont(btnOnions.getFont().deriveFont(btnOnions.getFont().getSize() + 1f));
		btnOnions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(total);
				model.clear();
				orderList.add("(" + launch.getSize() + ")" + " Onions Pizza" );

				for(int i = 0; i < orderList.size(); i++){
					model.addElement((i+1) + ". " + orderList.get(i));
				}
				if(launch.getSize() == "S"){
					total += prices.get(0) + prices.get(3);
				}
				if(launch.getSize() == "S"){
					priceList.add((prices.get(0)+ prices.get(3)) + " ");
				}
				else if(launch.getSize() == "M"){
					priceList.add((prices.get(1)+ prices.get(4)) + " ");
				}
				else if(launch.getSize() == "L"){
					priceList.add((prices.get(2)+ prices.get(5)) + " ");
				}
				priceModel.clear();
				for(int i = 0; i < priceList.size(); i++){
					priceModel.addElement((i+1) + ". " + priceList.get(i));
					
				}
			}
		});
		GridBagConstraints gbc_btnOnions = new GridBagConstraints();
		gbc_btnOnions.fill = GridBagConstraints.BOTH;
		gbc_btnOnions.insets = new Insets(0, 0, 5, 5);
		gbc_btnOnions.gridx = 1;
		gbc_btnOnions.gridy = 4;
		panel_1.add(btnOnions, gbc_btnOnions);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridwidth = 2;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 4;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
		
		Component rigidArea_11 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_11 = new GridBagConstraints();
		gbc_rigidArea_11.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_11.gridwidth = 3;
		gbc_rigidArea_11.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_11.gridx = 1;
		gbc_rigidArea_11.gridy = 5;
		panel_1.add(rigidArea_11, gbc_rigidArea_11);
		
		JButton btnGreenPeppers = new JButton("Green Peppers");
		btnGreenPeppers.setFont(btnGreenPeppers.getFont().deriveFont(btnGreenPeppers.getFont().getSize() - 1f));
		btnGreenPeppers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(total);
				model.clear();
				orderList.add("(" + launch.getSize() + ")" + " Green Peppers" );

				for(int i = 0; i < orderList.size(); i++){
					model.addElement((i+1) + ". " + orderList.get(i));
				}
				if(launch.getSize() == "S"){
					total += prices.get(0) + prices.get(3);
				}
				if(launch.getSize() == "S"){
					priceList.add((prices.get(0)+ prices.get(3)) + " ");
				}
				else if(launch.getSize() == "M"){
					priceList.add((prices.get(1)+ prices.get(4)) + " ");
				}
				else if(launch.getSize() == "L"){
					priceList.add((prices.get(2)+ prices.get(5)) + " ");
				}
				priceModel.clear();
				for(int i = 0; i < priceList.size(); i++){
					priceModel.addElement((i+1) + ". " + priceList.get(i));
					
				}
			}
		});
		GridBagConstraints gbc_btnGreenPeppers = new GridBagConstraints();
		gbc_btnGreenPeppers.fill = GridBagConstraints.BOTH;
		gbc_btnGreenPeppers.insets = new Insets(0, 0, 5, 5);
		gbc_btnGreenPeppers.gridx = 1;
		gbc_btnGreenPeppers.gridy = 6;
		panel_1.add(btnGreenPeppers, gbc_btnGreenPeppers);
		
		JButton btnNone = new JButton("None");
		btnNone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(total);
				model.clear();
				orderList.add("(" + launch.getSize() + ")" + " Peperronni Pizza" );

				for(int i = 0; i < orderList.size(); i++){
					model.addElement((i+1) + ". " + orderList.get(i));
				}
				if(launch.getSize() == "S"){
					total += prices.get(0);
				}
				if(launch.getSize() == "S"){
					priceList.add((prices.get(0)+ prices.get(3)) + " ");
				}
				else if(launch.getSize() == "M"){
					priceList.add((prices.get(1)+ prices.get(4)) + " ");
				}
				else if(launch.getSize() == "L"){
					priceList.add( prices.get(5) + " ");
				}
				priceModel.clear();
				for(int i = 0; i < priceList.size(); i++){
					priceModel.addElement((i+1) + ". " + priceList.get(i));
					
				}
			}
		});
		btnNone.setFont(btnNone.getFont().deriveFont(btnNone.getFont().getSize() + 1f));
		GridBagConstraints gbc_btnNone = new GridBagConstraints();
		gbc_btnNone.gridwidth = 2;
		gbc_btnNone.fill = GridBagConstraints.BOTH;
		gbc_btnNone.insets = new Insets(0, 0, 5, 5);
		gbc_btnNone.gridx = 2;
		gbc_btnNone.gridy = 6;
		panel_1.add(btnNone, gbc_btnNone);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_3 = new GridBagConstraints();
		gbc_rigidArea_3.gridwidth = 3;
		gbc_rigidArea_3.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_3.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_3.gridx = 1;
		gbc_rigidArea_3.gridy = 7;
		panel_1.add(rigidArea_3, gbc_rigidArea_3);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(btnBack.getFont().deriveFont(btnBack.getFont().getSize() + 1f));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launch.getPizza().setVisible(true);
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
		
		JLabel lblChooseToppin = new JLabel("Choose Topping");
		lblChooseToppin.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseToppin.setFont(lblChooseToppin.getFont().deriveFont(lblChooseToppin.getFont().getSize() + 30f));
		GridBagConstraints gbc_lblChooseToppin = new GridBagConstraints();
		gbc_lblChooseToppin.fill = GridBagConstraints.BOTH;
		gbc_lblChooseToppin.gridheight = 2;
		gbc_lblChooseToppin.insets = new Insets(0, 0, 0, 5);
		gbc_lblChooseToppin.gridx = 1;
		gbc_lblChooseToppin.gridy = 0;
		panel.add(lblChooseToppin, gbc_lblChooseToppin);
		
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
		button.setIcon(new ImageIcon(Toppings.class.getResource("/Icons/rsz_checkout-light.png")));
		button.setFont(button.getFont().deriveFont(button.getFont().getSize() + 10f));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridx = 2;
		gbc_button.gridy = 1;
		panel.add(button, gbc_button);
		btnBack.setIcon(new ImageIcon(Toppings.class.getResource("/Icons/back (1).png")));
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.gridwidth = 2;
		gbc_btnBack.fill = GridBagConstraints.BOTH;
		gbc_btnBack.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack.gridx = 1;
		gbc_btnBack.gridy = 8;
		panel_1.add(btnBack, gbc_btnBack);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(panel_1, gbc);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setFont(btnMainMenu.getFont().deriveFont(btnMainMenu.getFont().getSize() + 1f));
		GridBagConstraints gbc_btnMainMenu = new GridBagConstraints();
		gbc_btnMainMenu.fill = GridBagConstraints.BOTH;
		gbc_btnMainMenu.insets = new Insets(0, 0, 5, 5);
		gbc_btnMainMenu.gridx = 3;
		gbc_btnMainMenu.gridy = 8;
		panel_1.add(btnMainMenu, gbc_btnMainMenu);
		
		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_6 = new GridBagConstraints();
		gbc_rigidArea_6.gridwidth = 3;
		gbc_rigidArea_6.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_6.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea_6.gridx = 1;
		gbc_rigidArea_6.gridy = 9;
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
		textField.setText("Total Price:" + total);
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
