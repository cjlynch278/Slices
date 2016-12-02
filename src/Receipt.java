import javax.swing.JPanel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;

import javax.swing.JScrollPane;

import java.awt.Insets;

import javax.swing.JButton;

import java.awt.Component;

import javax.swing.Box;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;


public class Receipt extends JPanel {
	ArrayList<String> orderList = new ArrayList<String>();
	private JTextField subTotal;
	//private static JTextField priceText;
	//private JTextField tax;
	
	/**
	 * Create the panel.
	 * @param launch 
	 * @param total 
	 * @param priceList 
	 * @param priceModel 
	 * @param priceText 
	 */
	public Receipt( ArrayList<String> o, DefaultListModel<String> model, Launch launch, double total, ArrayList<String> priceList, DefaultListModel<String> priceModel, JTextField priceText, JTextField tax, JTextField subTotal) {
		orderList = o;
		for(int i =0; i<orderList.size() ; i++){
			model.addElement((i+1) + ". " +orderList.get(i));
		}
		JList<String> list = new JList<String>(model);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 175, 0, 175, 0, 0};
		gbl_panel.rowHeights = new int[]{50, 350, 50, 0, 30, 10, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel label = new JLabel("Final Order");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(label.getFont().deriveFont(label.getFont().getSize() + 13f));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridwidth = 3;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		panel.add(label, gbc_label);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.gridheight = 2;
		gbc_rigidArea.fill = GridBagConstraints.VERTICAL;
		gbc_rigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea.gridx = 0;
		gbc_rigidArea.gridy = 1;
		panel.add(rigidArea, gbc_rigidArea);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		panel.add(scrollPane, gbc_scrollPane);
		
		list.setFont(list.getFont().deriveFont(list.getFont().getSize() + 8f));
		scrollPane.setViewportView(list);
		
		JList<String> list_1 = new JList<String>(priceModel);
		list_1.setFont(list_1.getFont().deriveFont(list_1.getFont().getSize() + 8f));
		scrollPane.setRowHeaderView(list_1);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
		gbc_rigidArea_1.gridheight = 2;
		gbc_rigidArea_1.fill = GridBagConstraints.VERTICAL;
		gbc_rigidArea_1.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_1.gridx = 4;
		gbc_rigidArea_1.gridy = 1;
		panel.add(rigidArea_1, gbc_rigidArea_1);
		
		
		tax.setText("Tax");
		GridBagConstraints gbc_tax = new GridBagConstraints();
		gbc_tax.insets = new Insets(0, 0, 5, 5);
		gbc_tax.fill = GridBagConstraints.BOTH;
		gbc_tax.gridx = 1;
		gbc_tax.gridy = 3;
		panel.add(tax, gbc_tax);
		tax.setColumns(10);
		
		
		subTotal.setText("Subtotal");
		GridBagConstraints gbc_subTotal = new GridBagConstraints();
		gbc_subTotal.insets = new Insets(0, 0, 5, 5);
		gbc_subTotal.fill = GridBagConstraints.BOTH;
		gbc_subTotal.gridx = 2;
		gbc_subTotal.gridy = 3;
		panel.add(subTotal, gbc_subTotal);
		subTotal.setColumns(10);
		
		
		priceText.setText(orderList.size() + " ");
		
				
		priceText.setFont(priceText.getFont().deriveFont(priceText.getFont().getSize() + 3f));
		//priceText.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_priceText = new GridBagConstraints();
		gbc_priceText.insets = new Insets(0, 0, 5, 5);
		gbc_priceText.fill = GridBagConstraints.BOTH;
		gbc_priceText.gridx = 3;
		gbc_priceText.gridy = 3;
		panel.add(priceText, gbc_priceText);
		priceText.setColumns(10);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launch.getMain().setVisible(true);
				setVisible(false);
			}
		});
		btnMainMenu.setFont(btnMainMenu.getFont().deriveFont(btnMainMenu.getFont().getSize() + 5f));
		GridBagConstraints gbc_btnMainMenu = new GridBagConstraints();
		gbc_btnMainMenu.fill = GridBagConstraints.BOTH;
		gbc_btnMainMenu.insets = new Insets(0, 0, 5, 5);
		gbc_btnMainMenu.gridx = 2;
		gbc_btnMainMenu.gridy = 4;
		panel.add(btnMainMenu, gbc_btnMainMenu);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_2 = new GridBagConstraints();
		gbc_rigidArea_2.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_2.gridwidth = 3;
		gbc_rigidArea_2.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea_2.gridx = 1;
		gbc_rigidArea_2.gridy = 5;
		panel.add(rigidArea_2, gbc_rigidArea_2);

	}
	
}
