import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JLabel;

import java.awt.Component;

import javax.swing.Box;

import java.awt.Dimension;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;


public class Settings extends JPanel {


	public Settings(JFrame frame, Launch launch, AccountDB accounts, DefaultListModel<String> AccountsModel) {
		setBackground(Color.LIGHT_GRAY);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{20, 161, 160, 20, 0};
		gridBagLayout.rowHeights = new int[]{0, 33, 0, 35, 35, 23, 20, 35, 17, 35, 35, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_4 = new GridBagConstraints();
		gbc_rigidArea_4.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_4.gridheight = 13;
		gbc_rigidArea_4.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea_4.gridx = 0;
		gbc_rigidArea_4.gridy = 0;
		add(rigidArea_4, gbc_rigidArea_4);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_5 = new GridBagConstraints();
		gbc_rigidArea_5.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_5.gridheight = 13;
		gbc_rigidArea_5.gridx = 3;
		gbc_rigidArea_5.gridy = 0;
		add(rigidArea_5, gbc_rigidArea_5);
		
		JLabel lblWelcome = new JLabel("Settings");
		lblWelcome.setFont(lblWelcome.getFont().deriveFont(lblWelcome.getFont().getSize() + 60f));
		GridBagConstraints gbc_lblWelcome = new GridBagConstraints();
		gbc_lblWelcome.gridwidth = 2;
		gbc_lblWelcome.insets = new Insets(0, 0, 5, 5);
		gbc_lblWelcome.gridx = 1;
		gbc_lblWelcome.gridy = 1;
		add(lblWelcome, gbc_lblWelcome);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.gridwidth = 2;
		gbc_rigidArea.fill = GridBagConstraints.BOTH;
		gbc_rigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea.gridx = 1;
		gbc_rigidArea.gridy = 2;
		add(rigidArea, gbc_rigidArea);
		JButton OrderButton = new JButton("Create User");
		OrderButton.setFont(OrderButton.getFont().deriveFont(OrderButton.getFont().getSize() + 4f));
		OrderButton.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				
				
				setVisible(false);			
				
				NewUser NewUser = new NewUser(frame, launch, accounts);
				frame.getContentPane().add(NewUser, "NewUser");
				NewUser.setVisible(true);
			}
		});
		GridBagConstraints gbc_OrderButton = new GridBagConstraints();
		gbc_OrderButton.gridwidth = 2;
		gbc_OrderButton.fill = GridBagConstraints.BOTH;
		gbc_OrderButton.insets = new Insets(0, 0, 5, 5);
		gbc_OrderButton.gridx = 1;
		gbc_OrderButton.gridy = 3;
		add(OrderButton, gbc_OrderButton);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
		gbc_rigidArea_1.gridwidth = 2;
		gbc_rigidArea_1.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_1.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_1.gridx = 1;
		gbc_rigidArea_1.gridy = 4;
		add(rigidArea_1, gbc_rigidArea_1);
		
		//JPanel settings = new Settings(frame,launch, accounts, AccountsModel);
		JButton btnNewButton_2 = new JButton("Edit User");
		btnNewButton_2.setFont(btnNewButton_2.getFont().deriveFont(btnNewButton_2.getFont().getSize() + 4f));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AccountsModel.clear();
				
				for (Account a : accounts.getAccts() ){
						
					String entry = a.getPIN() + "  " + a.getName();
					AccountsModel.addElement(entry);
					
				}
				
				
				setVisible(false);
				launch.getEditAccounts().setVisible(true);
				
				
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.gridwidth = 2;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 5;
		add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnLogout = new JButton("Delete User");
		
		//JPanel Login = new Login(frame);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AccountsModel.clear();
				for (Account a : accounts.getAccts() ){
					//if(!accounts.getCurrentUser().equals(a)){
						
						String entry = a.getPIN() + "  " + a.getName();
						AccountsModel.addElement(entry);
					//}
				}setVisible(false);
				launch.getDeleteUser().setVisible(true);
			
			}
		});
		btnLogout.setFont(btnLogout.getFont().deriveFont(btnLogout.getFont().getSize() + 4f));
		GridBagConstraints gbc_btnLogout = new GridBagConstraints();
		gbc_btnLogout.gridwidth = 2;
		gbc_btnLogout.fill = GridBagConstraints.BOTH;
		gbc_btnLogout.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogout.gridx = 1;
		gbc_btnLogout.gridy = 7;
		add(btnLogout, gbc_btnLogout);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_3 = new GridBagConstraints();
		gbc_rigidArea_3.gridwidth = 2;
		gbc_rigidArea_3.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_3.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_3.gridx = 1;
		gbc_rigidArea_3.gridy = 8;
		add(rigidArea_3, gbc_rigidArea_3);
		
		JButton btnEditPrices = new JButton("Edit Prices");
		btnEditPrices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launch.getEditPrices().setVisible(true);
				setVisible(false);
			}
		});
		btnEditPrices.setFont(btnEditPrices.getFont().deriveFont(btnEditPrices.getFont().getSize() + 4f));
		GridBagConstraints gbc_btnEditPrices = new GridBagConstraints();
		gbc_btnEditPrices.gridwidth = 2;
		gbc_btnEditPrices.fill = GridBagConstraints.BOTH;
		gbc_btnEditPrices.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditPrices.gridx = 1;
		gbc_btnEditPrices.gridy = 9;
		add(btnEditPrices, gbc_btnEditPrices);
		
		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_6 = new GridBagConstraints();
		gbc_rigidArea_6.gridwidth = 2;
		gbc_rigidArea_6.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_6.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_6.gridx = 1;
		gbc_rigidArea_6.gridy = 10;
		add(rigidArea_6, gbc_rigidArea_6);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				launch.getMain().setVisible(true);
			}
		});
		btnBack.setIcon(new ImageIcon(Settings.class.getResource("/Icons/back (1).png")));
		btnBack.setFont(btnBack.getFont().deriveFont(btnBack.getFont().getSize() + 4f));
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.fill = GridBagConstraints.BOTH;
		gbc_btnBack.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack.gridx = 1;
		gbc_btnBack.gridy = 11;
		add(btnBack, gbc_btnBack);
		
		Component rigidArea_7 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_7 = new GridBagConstraints();
		gbc_rigidArea_7.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_7.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea_7.gridx = 1;
		gbc_rigidArea_7.gridy = 12;
		add(rigidArea_7, gbc_rigidArea_7);
	
		

	}

}
