import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;

import javax.swing.Box;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;





public class Login extends JPanel{

	/**
	 * Create the panel.
	 */
	JFrame frame;
	private JTextField txtEnterPinHere;

	public Login(JFrame f, Launch launch, ArrayList<String> orderList, DefaultListModel<String> model, AccountDB accounts, DefaultListModel<String> AccountsModel) {
		setBackground(Color.LIGHT_GRAY);
		setForeground(Color.LIGHT_GRAY);
		frame = f;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 40, 294, 40, 0 };
		gridBagLayout.rowHeights = new int[] { 31, 20, 66, 28, 40, 23, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(lblLogin.getFont().deriveFont(lblLogin.getFont().getSize() + 60f));
		GridBagConstraints gbc_lblLogin = new GridBagConstraints();
		gbc_lblLogin.fill = GridBagConstraints.BOTH;
		gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogin.gridx = 1;
		gbc_lblLogin.gridy = 0;
		add(lblLogin, gbc_lblLogin);

		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
		gbc_rigidArea_1.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_1.gridheight = 6;
		gbc_rigidArea_1.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_1.gridx = 0;
		gbc_rigidArea_1.gridy = 0;
		add(rigidArea_1, gbc_rigidArea_1);

		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_3 = new GridBagConstraints();
		gbc_rigidArea_3.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_3.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_3.gridx = 1;
		gbc_rigidArea_3.gridy = 1;
		add(rigidArea_3, gbc_rigidArea_3);

		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.fill = GridBagConstraints.BOTH;
		gbc_rigidArea.gridheight = 6;
		gbc_rigidArea.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea.gridx = 2;
		gbc_rigidArea.gridy = 0;
		add(rigidArea, gbc_rigidArea);

		txtEnterPinHere = new JTextField();
		txtEnterPinHere.setFont(txtEnterPinHere.getFont().deriveFont(txtEnterPinHere.getFont().getSize() + 9f));
		txtEnterPinHere.setText("Enter Pin Here");
		GridBagConstraints gbc_txtEnterPinHere = new GridBagConstraints();
		gbc_txtEnterPinHere.fill = GridBagConstraints.BOTH;
		gbc_txtEnterPinHere.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterPinHere.gridx = 1;
		gbc_txtEnterPinHere.gridy = 2;
		add(txtEnterPinHere, gbc_txtEnterPinHere);
		txtEnterPinHere.setColumns(10);

		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_5 = new GridBagConstraints();
		gbc_rigidArea_5.fill = GridBagConstraints.VERTICAL;
		gbc_rigidArea_5.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_5.gridx = 1;
		gbc_rigidArea_5.gridy = 3;
		add(rigidArea_5, gbc_rigidArea_5);

		
	
		
		JButton LoginButton = new JButton("Login");
		LoginButton.setFont(LoginButton.getFont().deriveFont(LoginButton.getFont().getSize() + 9f));
		LoginButton.setForeground(Color.BLACK);
		LoginButton.addActionListener(new ActionListener() {
			JPanel Main = new Main(frame, launch, orderList, model, accounts, AccountsModel);

			public void actionPerformed(ActionEvent arg0) {
				
				if (accounts.contains(txtEnterPinHere.getText())) {

					accounts.setCurrentUser(txtEnterPinHere.getText());
					setVisible(false);
					frame.getContentPane().add(Main, "order");
					Main.setVisible(true);
					
				} else {
					JOptionPane.showMessageDialog(null, "Invalid entry. Please reenter PIN.");
				}
				
				// System.out.println(txtEnterPinHere.getText());
				/*
				 * setVisible(false); frame.getContentPane().add(Main, "order");
				 * Main.setVisible(true);
				 */

			}
		});
		GridBagConstraints gbc_LoginButton = new GridBagConstraints();
		gbc_LoginButton.insets = new Insets(0, 0, 5, 5);
		gbc_LoginButton.fill = GridBagConstraints.BOTH;
		gbc_LoginButton.gridx = 1;
		gbc_LoginButton.gridy = 4;
		add(LoginButton, gbc_LoginButton);

		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_2 = new GridBagConstraints();
		gbc_rigidArea_2.fill = GridBagConstraints.BOTH;
		gbc_rigidArea_2.gridwidth = 3;
		gbc_rigidArea_2.gridx = 0;
		gbc_rigidArea_2.gridy = 6;
		add(rigidArea_2, gbc_rigidArea_2);
		// JPanel Main = new Main(frame);

		this.setVisible(false);

	}

}
