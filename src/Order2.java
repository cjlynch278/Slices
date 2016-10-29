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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;


public class Order2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Order2(JFrame frame) {
		setBackground(Color.LIGHT_GRAY);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 206, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
					.addGap(27))
		);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Order!");
		lblNewLabel_1.setFont(lblNewLabel_1.getFont().deriveFont(lblNewLabel_1.getFont().getSize() + 15f));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridheight = 2;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_3.add(lblNewLabel_1, gbc_lblNewLabel_1);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0};
		gbl_panel_2.rowHeights = new int[]{38, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 0.0};
		gbl_panel_2.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel = new JLabel("Cart");
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getSize() + 7f));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		listModel.addElement("hayyylo");
		listModel.addElement("Yasss");
		for(int i = 0; i< 103; i++){
			listModel.addElement("Yassssss");
		}
		
		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_6 = new GridBagConstraints();
		gbc_rigidArea_6.gridheight = 3;
		gbc_rigidArea_6.gridx = 1;
		gbc_rigidArea_6.gridy = 0;
		panel_2.add(rigidArea_6, gbc_rigidArea_6);
		
		JScrollPane scrollPane = new JScrollPane();
		
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		panel_2.add(scrollPane, gbc_scrollPane);
		
		DefaultListModel<String> model = new DefaultListModel<>();
		JList<String> list = new JList<String>(model);
		list.setFont(list.getFont().deriveFont(list.getFont().getSize() + 8f));
		scrollPane.setViewportView(list);
		for(int i =0; i< 100 ; i++){
			model.addElement("yassss");
		}
				
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_5 = new GridBagConstraints();
		gbc_rigidArea_5.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea_5.gridx = 0;
		gbc_rigidArea_5.gridy = 2;
		panel_2.add(rigidArea_5, gbc_rigidArea_5);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{41, 81, 69, -46, 0};
		gbl_panel_1.rowHeights = new int[]{21, 52, 23, 52, 22, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_4 = new GridBagConstraints();
		gbc_rigidArea_4.gridwidth = 4;
		gbc_rigidArea_4.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_4.gridx = 0;
		gbc_rigidArea_4.gridy = 0;
		panel_1.add(rigidArea_4, gbc_rigidArea_4);
		
		JButton btnNewButton = new JButton("Pizza");
		btnNewButton.setFont(btnNewButton.getFont().deriveFont(btnNewButton.getFont().getSize() + 9f));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		gbc_rigidArea_1.gridheight = 5;
		gbc_rigidArea_1.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_1.gridx = 3;
		gbc_rigidArea_1.gridy = 1;
		panel_1.add(rigidArea_1, gbc_rigidArea_1);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea.gridx = 0;
		gbc_rigidArea.gridy = 3;
		panel_1.add(rigidArea, gbc_rigidArea);
		
		JButton btnNewButton_1 = new JButton("Beverage");
		btnNewButton_1.setFont(btnNewButton_1.getFont().deriveFont(btnNewButton_1.getFont().getSize() + 9f));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(Order2.class.getResource("/Backicon/back (1).png")));
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.fill = GridBagConstraints.BOTH;
		gbc_btnBack.insets = new Insets(0, 0, 0, 5);
		gbc_btnBack.gridx = 1;
		gbc_btnBack.gridy = 5;
		panel_1.add(btnBack, gbc_btnBack);
		setLayout(groupLayout);

	}
}
