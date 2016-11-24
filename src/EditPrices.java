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
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import java.awt.Font;

public class EditPrices extends JPanel {
	private JTextField smallTopp;
	private JTextField medTopp;
	private JTextField lrgTopp;
	private JTextField soda;
	private JTextField smallPizz;
	private JTextField medPizz;
	private JTextField lrgPizz;
	private JTextField taxRate;
	Scanner scan;
	File file = new File("Prices");
	ArrayList<JTextField> fields = new ArrayList<JTextField>();
	ArrayList<String> prices = new ArrayList<String>();

	/**
	 * Create the panel.
	 */
	public EditPrices(JFrame frame, Launch launch) {
		setBackground(Color.LIGHT_GRAY);
		DefaultListModel<String> model = new DefaultListModel<>();
		model.addElement("Franklin Pierce");
		model.addElement("George Washington");
		model.addElement("John AppleSeed");

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 245, Short.MAX_VALUE).addContainerGap()));
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 0, 0 };
		gbl_panel_3.rowHeights = new int[] { 52, 0 };
		gbl_panel_3.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);

		JLabel lblNewLabel_1 = new JLabel("Edit Prices");
		lblNewLabel_1.setFont(lblNewLabel_1.getFont().deriveFont(lblNewLabel_1.getFont().getSize() + 20f));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_3.add(lblNewLabel_1, gbc_lblNewLabel_1);

		DefaultListModel<String> listModel = new DefaultListModel<String>();
		listModel.addElement("hayyylo");
		listModel.addElement("Yasss");
		for (int i = 0; i < 103; i++) {
			listModel.addElement("Yassssss");
		}

		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 40, 91, 50, 70, 50, 40, 0 };
		gbl_panel_1.rowHeights = new int[] { 50, 0, 0, 0, 13, 0, 0, 50, 0, 0, 45, 20 };
		gbl_panel_1.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0 };
		panel_1.setLayout(gbl_panel_1);

		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.fill = GridBagConstraints.BOTH;
		gbc_rigidArea.gridheight = 11;
		gbc_rigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea.gridx = 0;
		gbc_rigidArea.gridy = 0;
		panel_1.add(rigidArea, gbc_rigidArea);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launch.getSettings().setVisible(true);
				setVisible(false);
			}
		});

		try {
			scan = new Scanner(file);

			JLabel lblSizes = new JLabel("Toppings Prices");
			lblSizes.setHorizontalAlignment(SwingConstants.CENTER);
			lblSizes.setFont(lblSizes.getFont().deriveFont(lblSizes.getFont().getSize() + 3f));
			GridBagConstraints gbc_lblSizes = new GridBagConstraints();
			gbc_lblSizes.insets = new Insets(0, 0, 5, 5);
			gbc_lblSizes.gridx = 1;
			gbc_lblSizes.gridy = 0;
			panel_1.add(lblSizes, gbc_lblSizes);

			JLabel lblSmall = new JLabel("Small  $");
			GridBagConstraints gbc_lblSmall = new GridBagConstraints();
			gbc_lblSmall.anchor = GridBagConstraints.EAST;
			gbc_lblSmall.insets = new Insets(0, 0, 5, 5);
			gbc_lblSmall.gridx = 1;
			gbc_lblSmall.gridy = 1;
			panel_1.add(lblSmall, gbc_lblSmall);

			smallTopp = new JTextField();
			fields.add(smallTopp);
			smallTopp.setText(scan.nextLine());
			prices.add(smallTopp.getText());
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.insets = new Insets(0, 0, 5, 5);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 2;
			gbc_textField.gridy = 1;
			panel_1.add(smallTopp, gbc_textField);
			smallTopp.setColumns(10);

			JLabel lblNewLabel = new JLabel("Medium  $");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 1;
			gbc_lblNewLabel.gridy = 2;
			panel_1.add(lblNewLabel, gbc_lblNewLabel);

			medTopp = new JTextField();
			fields.add(medTopp);
			medTopp.setText(scan.nextLine());
			prices.add(medTopp.getText());
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.insets = new Insets(0, 0, 5, 5);
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.gridx = 2;
			gbc_textField_1.gridy = 2;
			panel_1.add(medTopp, gbc_textField_1);
			medTopp.setColumns(10);

			JLabel lblLarge = new JLabel("Large  $");
			GridBagConstraints gbc_lblLarge = new GridBagConstraints();
			gbc_lblLarge.insets = new Insets(0, 0, 5, 5);
			gbc_lblLarge.anchor = GridBagConstraints.EAST;
			gbc_lblLarge.gridx = 1;
			gbc_lblLarge.gridy = 3;
			panel_1.add(lblLarge, gbc_lblLarge);

			lrgTopp = new JTextField();
			fields.add(lrgTopp);
			lrgTopp.setText(scan.nextLine());
			prices.add(lrgTopp.getText());
			GridBagConstraints gbc_txtLarge = new GridBagConstraints();
			gbc_txtLarge.insets = new Insets(0, 0, 5, 5);
			gbc_txtLarge.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtLarge.gridx = 2;
			gbc_txtLarge.gridy = 3;
			panel_1.add(lrgTopp, gbc_txtLarge);
			lrgTopp.setColumns(10);

			JLabel label = new JLabel("Pizza Prices");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(label.getFont().deriveFont(label.getFont().getSize() + 3f));
			GridBagConstraints gbc_label = new GridBagConstraints();
			gbc_label.insets = new Insets(0, 0, 5, 5);
			gbc_label.gridx = 1;
			gbc_label.gridy = 5;
			panel_1.add(label, gbc_label);

			JLabel lblNewLabel_3 = new JLabel("Small Pizza  $");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
			GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
			gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_3.gridx = 1;
			gbc_lblNewLabel_3.gridy = 6;
			panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);

			smallPizz = new JTextField();
			fields.add(smallPizz);
			smallPizz.setText(scan.nextLine());
			prices.add(smallPizz.getText());
			GridBagConstraints gbc_textField_5 = new GridBagConstraints();
			gbc_textField_5.insets = new Insets(0, 0, 5, 5);
			gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_5.gridx = 2;
			gbc_textField_5.gridy = 6;
			panel_1.add(smallPizz, gbc_textField_5);
			smallPizz.setColumns(10);

			JLabel lblMedium = new JLabel("Medium Pizza  $");
			lblMedium.setHorizontalAlignment(SwingConstants.TRAILING);
			GridBagConstraints gbc_lblMedium = new GridBagConstraints();
			gbc_lblMedium.anchor = GridBagConstraints.EAST;
			gbc_lblMedium.fill = GridBagConstraints.VERTICAL;
			gbc_lblMedium.insets = new Insets(0, 0, 5, 5);
			gbc_lblMedium.gridx = 1;
			gbc_lblMedium.gridy = 7;
			panel_1.add(lblMedium, gbc_lblMedium);

			medPizz = new JTextField();
			fields.add(medPizz);
			medPizz.setText(scan.nextLine());
			prices.add(medPizz.getText());
			GridBagConstraints gbc_textField_6 = new GridBagConstraints();
			gbc_textField_6.insets = new Insets(0, 0, 5, 5);
			gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_6.gridx = 2;
			gbc_textField_6.gridy = 7;
			panel_1.add(medPizz, gbc_textField_6);
			medPizz.setColumns(10);

			JLabel lblLarge_1 = new JLabel("Large Pizza  $");
			lblLarge_1.setHorizontalAlignment(SwingConstants.TRAILING);
			GridBagConstraints gbc_lblLarge_1 = new GridBagConstraints();
			gbc_lblLarge_1.anchor = GridBagConstraints.EAST;
			gbc_lblLarge_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblLarge_1.gridx = 1;
			gbc_lblLarge_1.gridy = 8;
			panel_1.add(lblLarge_1, gbc_lblLarge_1);

			lrgPizz = new JTextField();
			fields.add(lrgPizz);
			lrgPizz.setText(scan.nextLine());
			prices.add(lrgPizz.getText());
			GridBagConstraints gbc_textField_7 = new GridBagConstraints();
			gbc_textField_7.insets = new Insets(0, 0, 5, 5);
			gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_7.gridx = 2;
			gbc_textField_7.gridy = 8;
			panel_1.add(lrgPizz, gbc_textField_7);
			lrgPizz.setColumns(10);

			JLabel lblSoda = new JLabel("Beverage");
			lblSoda.setFont(lblSoda.getFont().deriveFont(lblSoda.getFont().getSize() + 3f));
			GridBagConstraints gbc_lblSoda = new GridBagConstraints();
			gbc_lblSoda.insets = new Insets(0, 0, 5, 5);
			gbc_lblSoda.gridx = 3;
			gbc_lblSoda.gridy = 0;
			panel_1.add(lblSoda, gbc_lblSoda);

			JLabel lblNewLabel_2 = new JLabel("2 Liter  $");
			GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
			gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_2.gridx = 3;
			gbc_lblNewLabel_2.gridy = 1;
			panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);

			soda = new JTextField();
			fields.add(soda);
			soda.setText(scan.nextLine());
			prices.add(soda.getText());
			GridBagConstraints gbc_textField_2 = new GridBagConstraints();
			gbc_textField_2.insets = new Insets(0, 0, 5, 5);
			gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_2.gridx = 4;
			gbc_textField_2.gridy = 1;
			panel_1.add(soda, gbc_textField_2);
			soda.setColumns(10);

			JLabel lblTaxRate = new JLabel("Tax Rate");
			lblTaxRate.setFont(lblTaxRate.getFont().deriveFont(lblTaxRate.getFont().getSize() + 3f));
			lblTaxRate.setHorizontalAlignment(SwingConstants.CENTER);
			GridBagConstraints gbc_lblTaxRate = new GridBagConstraints();
			gbc_lblTaxRate.fill = GridBagConstraints.BOTH;
			gbc_lblTaxRate.insets = new Insets(0, 0, 5, 5);
			gbc_lblTaxRate.gridx = 3;
			gbc_lblTaxRate.gridy = 5;
			panel_1.add(lblTaxRate, gbc_lblTaxRate);

			JLabel label_1 = new JLabel("%");
			label_1.setHorizontalAlignment(SwingConstants.TRAILING);
			GridBagConstraints gbc_label_1 = new GridBagConstraints();
			gbc_label_1.anchor = GridBagConstraints.EAST;
			gbc_label_1.fill = GridBagConstraints.VERTICAL;
			gbc_label_1.insets = new Insets(0, 0, 5, 5);
			gbc_label_1.gridx = 3;
			gbc_label_1.gridy = 6;
			panel_1.add(label_1, gbc_label_1);

			taxRate = new JTextField();
			fields.add(taxRate);
			taxRate.setText(scan.nextLine());
			prices.add(taxRate.getText());
			GridBagConstraints gbc_textField_3 = new GridBagConstraints();
			gbc_textField_3.insets = new Insets(0, 0, 5, 5);
			gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_3.gridx = 4;
			gbc_textField_3.gridy = 6;
			panel_1.add(taxRate, gbc_textField_3);
			taxRate.setColumns(10);

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
		gbc_rigidArea_1.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_1.gridwidth = 5;
		gbc_rigidArea_1.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_1.gridx = 1;
		gbc_rigidArea_1.gridy = 9;
		panel_1.add(rigidArea_1, gbc_rigidArea_1);
		btnBack.setIcon(new ImageIcon(Order.class.getResource("/Backicon/back (1).png")));
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.fill = GridBagConstraints.BOTH;
		gbc_btnBack.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack.gridx = 1;
		gbc_btnBack.gridy = 10;
		panel_1.add(btnBack, gbc_btnBack);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(btnSubmit.getFont().deriveFont(btnSubmit.getFont().getSize() + 7f));

		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.fill = GridBagConstraints.BOTH;
		gbc_btnSubmit.insets = new Insets(0, 0, 5, 5);
		gbc_btnSubmit.gridx = 4;
		gbc_btnSubmit.gridy = 10;
		panel_1.add(btnSubmit, gbc_btnSubmit);

		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FileWriter writer = null;

				try {
					
					
					writer = new FileWriter(file, false);
					
					for (JTextField f : fields) {
						
						if (!isNumeric(f.getText())){
							JOptionPane.showMessageDialog(null,
									"A value you entered is not acceptable.");
							
							for (int i = 0; i < fields.size(); i++){
								fields.get(i).setText(prices.get(i));
							}
							
							break;
						} else {
						
						writer.write(f.getText()+ "\n");
						
						}
					}
					writer.close();
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				launch.getSettings().setVisible(true);
				setVisible(false);
				
			}
		});

		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_6 = new GridBagConstraints();
		gbc_rigidArea_6.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_6.gridwidth = 6;
		gbc_rigidArea_6.gridx = 0;
		gbc_rigidArea_6.gridy = 11;
		panel_1.add(rigidArea_6, gbc_rigidArea_6);
		setLayout(groupLayout);

	}
	
	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
}
