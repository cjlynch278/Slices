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


public class Main extends JPanel {

	/**
	 * Create the panel.
	 */
	public Main(JFrame frame, Launch launch, ArrayList<String> orderList, DefaultListModel<String> model, AccountDB accounts, DefaultListModel<String> AccountsModel) {
		setBackground(Color.LIGHT_GRAY);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{20, 321, 20, 0};
		gridBagLayout.rowHeights = new int[]{0, 33, 0, 70, 10, 70, 10, 70, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel settings = new Settings(frame,launch, accounts, AccountsModel);
		JButton btnNewButton_2 = new JButton("Settings");
		btnNewButton_2.setFont(btnNewButton_2.getFont().deriveFont(btnNewButton_2.getFont().getSize() + 4f));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().add(settings);
				setVisible(false);
				settings.setVisible(true);
			}
		});
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_4 = new GridBagConstraints();
		gbc_rigidArea_4.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_4.gridheight = 9;
		gbc_rigidArea_4.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea_4.gridx = 0;
		gbc_rigidArea_4.gridy = 0;
		add(rigidArea_4, gbc_rigidArea_4);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_5 = new GridBagConstraints();
		gbc_rigidArea_5.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_5.gridheight = 9;
		gbc_rigidArea_5.gridx = 2;
		gbc_rigidArea_5.gridy = 0;
		add(rigidArea_5, gbc_rigidArea_5);
		
		JLabel lblWelcome = new JLabel("Welcome!");
		lblWelcome.setFont(lblWelcome.getFont().deriveFont(lblWelcome.getFont().getSize() + 20f));
		GridBagConstraints gbc_lblWelcome = new GridBagConstraints();
		gbc_lblWelcome.insets = new Insets(0, 0, 5, 5);
		gbc_lblWelcome.gridx = 1;
		gbc_lblWelcome.gridy = 1;
		add(lblWelcome, gbc_lblWelcome);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.fill = GridBagConstraints.BOTH;
		gbc_rigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea.gridx = 1;
		gbc_rigidArea.gridy = 2;
		add(rigidArea, gbc_rigidArea);
		JButton OrderButton = new JButton("Order");
		OrderButton.setFont(OrderButton.getFont().deriveFont(OrderButton.getFont().getSize() + 4f));
		OrderButton.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				launch.getOrder().setVisible(true);
				
				setVisible(false);
				
				
			}
		});
		GridBagConstraints gbc_OrderButton = new GridBagConstraints();
		gbc_OrderButton.fill = GridBagConstraints.BOTH;
		gbc_OrderButton.insets = new Insets(0, 0, 5, 5);
		gbc_OrderButton.gridx = 1;
		gbc_OrderButton.gridy = 3;
		add(OrderButton, gbc_OrderButton);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
		gbc_rigidArea_1.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_1.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_1.gridx = 1;
		gbc_rigidArea_1.gridy = 4;
		add(rigidArea_1, gbc_rigidArea_1);
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 5;
		add(btnNewButton_2, gbc_btnNewButton_2);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_2 = new GridBagConstraints();
		gbc_rigidArea_2.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_2.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_2.gridx = 1;
		gbc_rigidArea_2.gridy = 6;
		add(rigidArea_2, gbc_rigidArea_2);
		
		JButton btnLogout = new JButton("Logout");
		
		//JPanel Login = new Login(frame);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//frame.getContentPane().add(Login);
				setVisible(false);
				//launch.getLogin().setVisible(true);
				Login Login = new Login(frame, launch, orderList,model, accounts, AccountsModel);
				//EditAccounts2 EditAccounts2 = new EditAccounts2(frame, launch, accounts, accounts.getEdit());
				//frame.getContentPane().add(EditAccounts2, "EditAccounts2");
				//frame.getContentPane().add(EditAccounts2, "EditAccounts2");
				frame.getContentPane().add(Login, "name_23596145660473");
				Login.setVisible(true);
				//EditAccounts2.setVisible(true);
			}
		});
		btnLogout.setFont(btnLogout.getFont().deriveFont(btnLogout.getFont().getSize() + 4f));
		GridBagConstraints gbc_btnLogout = new GridBagConstraints();
		gbc_btnLogout.fill = GridBagConstraints.BOTH;
		gbc_btnLogout.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogout.gridx = 1;
		gbc_btnLogout.gridy = 7;
		add(btnLogout, gbc_btnLogout);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_3 = new GridBagConstraints();
		gbc_rigidArea_3.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_3.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea_3.gridx = 1;
		gbc_rigidArea_3.gridy = 8;
		add(rigidArea_3, gbc_rigidArea_3);
	
		

	}

}
