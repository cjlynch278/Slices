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
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.UIManager;


public class EditAccounts2 extends JPanel {
	private JTextField txtEnterUserName;
	private JTextField txtEnterPin;
	private JTextField txtReenterPin;

	/**
	 * Create the panel.
	 */
	public EditAccounts2(JFrame frame, Launch launch, AccountDB accounts, Account edit) {
		setBackground(Color.LIGHT_GRAY);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 450, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 297, Short.MAX_VALUE))
		);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0};
		gbl_panel_3.rowHeights = new int[]{52, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Modify User");
		lblNewLabel_1.setFont(lblNewLabel_1.getFont().deriveFont(lblNewLabel_1.getFont().getSize() + 60f));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_3.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{40, 70, 70, 70, 40, 0};
		gbl_panel_1.rowHeights = new int[]{20, 50, 13, 50, 20, 50, 10, 0, 10, 45, 20};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
		panel_1.setLayout(gbl_panel_1);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_4 = new GridBagConstraints();
		gbc_rigidArea_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_rigidArea_4.gridwidth = 4;
		gbc_rigidArea_4.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_4.gridx = 0;
		gbc_rigidArea_4.gridy = 0;
		panel_1.add(rigidArea_4, gbc_rigidArea_4);
		
		txtEnterUserName = new JTextField();
		txtEnterUserName.setBackground(UIManager.getColor("Button.light"));
		txtEnterUserName.setFont(txtEnterUserName.getFont().deriveFont(txtEnterUserName.getFont().getSize() + 9f));
		txtEnterUserName.setHorizontalAlignment(SwingConstants.LEFT);
		txtEnterUserName.setText(edit.getName());
		GridBagConstraints gbc_txtEnterUserName = new GridBagConstraints();
		gbc_txtEnterUserName.gridwidth = 3;
		gbc_txtEnterUserName.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterUserName.fill = GridBagConstraints.BOTH;
		gbc_txtEnterUserName.gridx = 1;
		gbc_txtEnterUserName.gridy = 1;
		panel_1.add(txtEnterUserName, gbc_txtEnterUserName);
		txtEnterUserName.setColumns(10);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_2 = new GridBagConstraints();
		gbc_rigidArea_2.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_2.gridwidth = 3;
		gbc_rigidArea_2.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_2.gridx = 1;
		gbc_rigidArea_2.gridy = 2;
		panel_1.add(rigidArea_2, gbc_rigidArea_2);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.fill = GridBagConstraints.BOTH;
		gbc_rigidArea.gridheight = 9;
		gbc_rigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea.gridx = 0;
		gbc_rigidArea.gridy = 1;
		panel_1.add(rigidArea, gbc_rigidArea);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
		gbc_rigidArea_1.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_rigidArea_1.gridheight = 10;
		gbc_rigidArea_1.gridx = 4;
		gbc_rigidArea_1.gridy = 0;
		panel_1.add(rigidArea_1, gbc_rigidArea_1);
		
		txtEnterPin = new JTextField();
		txtEnterPin.setBackground(UIManager.getColor("Button.light"));
		txtEnterPin.setFont(txtEnterPin.getFont().deriveFont(txtEnterPin.getFont().getSize() + 9f));
		txtEnterPin.setHorizontalAlignment(SwingConstants.LEFT);
		txtEnterPin.setText(edit.getPIN());
		GridBagConstraints gbc_txtEnterPin = new GridBagConstraints();
		gbc_txtEnterPin.gridwidth = 3;
		gbc_txtEnterPin.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterPin.fill = GridBagConstraints.BOTH;
		gbc_txtEnterPin.gridx = 1;
		gbc_txtEnterPin.gridy = 3;
		panel_1.add(txtEnterPin, gbc_txtEnterPin);
		txtEnterPin.setColumns(10);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = 3;
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 1;
		gbc.gridy = 4;
		panel_1.add(rigidArea_5, gbc);
		
		txtReenterPin = new JTextField();
		txtReenterPin.setBackground(UIManager.getColor("Button.light"));
		txtReenterPin.setFont(txtReenterPin.getFont().deriveFont(txtReenterPin.getFont().getSize() + 9f));
		txtReenterPin.setHorizontalAlignment(SwingConstants.LEFT);
		txtReenterPin.setText(edit.getPIN());
		GridBagConstraints gbc_txtReenterPin = new GridBagConstraints();
		gbc_txtReenterPin.gridwidth = 3;
		gbc_txtReenterPin.insets = new Insets(0, 0, 5, 5);
		gbc_txtReenterPin.fill = GridBagConstraints.BOTH;
		gbc_txtReenterPin.gridx = 1;
		gbc_txtReenterPin.gridy = 5;
		panel_1.add(txtReenterPin, gbc_txtReenterPin);
		txtReenterPin.setColumns(10);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_3 = new GridBagConstraints();
		gbc_rigidArea_3.gridwidth = 2;
		gbc_rigidArea_3.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_3.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_3.gridx = 1;
		gbc_rigidArea_3.gridy = 6;
		panel_1.add(rigidArea_3, gbc_rigidArea_3);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launch.getEditAccounts().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// !edit.equals(accounts.getCurrentUser()) &&
				if(accounts.contains(txtEnterPin.getText()) && !edit.getPIN().equals(txtEnterPin.getText())){
					JOptionPane.showMessageDialog(null, "The PIN entered is already in use. Please re-enter PINs");
				
				} else if(txtEnterPin.getText().length() != 4){
					JOptionPane.showMessageDialog(null, "PIN should be 4 digits long. Please Re-enter PINs");
				
				} else if(txtEnterUserName.getText().isEmpty() || txtEnterUserName.getText().trim().length() == 0){
					JOptionPane.showMessageDialog(null, "No name entered. Please enter a name.");
				
				} else if(!txtEnterPin.getText().matches("[0-9]+")){
					JOptionPane.showMessageDialog(null, "The PIN should only contain numbers. Please re-enter PINs.");
				
				} else if(!txtEnterPin.getText().equals(txtReenterPin.getText())){
					JOptionPane.showMessageDialog(null, "The PIN entries were not equal. Please re-enter PINs.");
				
				}else{
					accounts.editAccount(txtEnterUserName.getText(),txtEnterPin.getText());

					launch.getSettings().setVisible(true);
					setVisible(false);
				}
				
			}
		});
		btnSubmit.setFont(btnSubmit.getFont().deriveFont(btnSubmit.getFont().getSize() + 8f));
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.fill = GridBagConstraints.BOTH;
		gbc_btnSubmit.insets = new Insets(0, 0, 5, 5);
		gbc_btnSubmit.gridx = 2;
		gbc_btnSubmit.gridy = 7;
		panel_1.add(btnSubmit, gbc_btnSubmit);
		
		Component rigidArea_7 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_7 = new GridBagConstraints();
		gbc_rigidArea_7.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_7.gridwidth = 3;
		gbc_rigidArea_7.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_7.gridx = 1;
		gbc_rigidArea_7.gridy = 8;
		panel_1.add(rigidArea_7, gbc_rigidArea_7);
		btnBack.setIcon(new ImageIcon(Order.class.getResource("/Icons/back (1).png")));
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.fill = GridBagConstraints.BOTH;
		gbc_btnBack.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack.gridx = 1;
		gbc_btnBack.gridy = 9;
		panel_1.add(btnBack, gbc_btnBack);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setFont(btnMainMenu.getFont().deriveFont(btnMainMenu.getFont().getSize() + 6f));
		GridBagConstraints gbc_btnMainMenu = new GridBagConstraints();
		gbc_btnMainMenu.fill = GridBagConstraints.BOTH;
		gbc_btnMainMenu.insets = new Insets(0, 0, 5, 5);
		gbc_btnMainMenu.gridx = 3;
		gbc_btnMainMenu.gridy = 9;
		panel_1.add(btnMainMenu, gbc_btnMainMenu);
		
		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_6 = new GridBagConstraints();
		gbc_rigidArea_6.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_6.gridwidth = 5;
		gbc_rigidArea_6.gridx = 0;
		gbc_rigidArea_6.gridy = 10;
		panel_1.add(rigidArea_6, gbc_rigidArea_6);
		setLayout(groupLayout);

	}
	
}
