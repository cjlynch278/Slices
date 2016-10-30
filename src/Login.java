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
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;


public class Login extends JPanel {

	/**
	 * Create the panel.
	 */
	JFrame frame;
	
	
	private JTextField txtEnterPinHere;
	public Login(JFrame f) {
		frame = f;
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		Scanner input = null;
		
		
		AccountDB accounts = new AccountDB();
		
		
		//ArrayList<String> accts = new ArrayList<String>();
		
		//Account accts = new Account();
		String acctPIN;
		String line;
		String words[] = new String[2];
		String acctName;
		try {
			input = new Scanner(new File("Accounts"));
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
		}
		while(input.hasNextLine() == true){
			
			line = input.nextLine();
			words = line.split(" ");
			acctPIN = words[0];
			acctName = words[1];
			//System.out.println(acctPIN + "  " + acctName);
			Account acct = new Account(acctPIN, acctName);
			
			accounts.addAccount(acct);
			
		}
		
		ArrayList<Account> a = accounts.getAccts();
		
		
		
		JButton LoginButton = new JButton("Login");
		LoginButton.setForeground(Color.BLACK);
		LoginButton.addActionListener(new ActionListener() {
		JPanel Main = new Main(frame);
		
		public void actionPerformed(ActionEvent arg0) {
				
			if (accounts.contains(txtEnterPinHere.getText())){
				
				accounts.setCurrentUser(txtEnterPinHere.getText());
				setVisible(false);
				frame.getContentPane().add(Main, "order");
				Main.setVisible(true);
				
			}
			System.out.println(accounts.getCurrentUser().getName());
				
			//System.out.println(txtEnterPinHere.getText());
				
		}
		});
		
		txtEnterPinHere = new JTextField();
		txtEnterPinHere.setText("Enter Pin Here");
		add(txtEnterPinHere, "13, 10, 6, 1, fill, default");
		txtEnterPinHere.setColumns(10);
		add(LoginButton, "14, 14, 5, 1");
		
		
		JPanel Main = new Main(frame);
		
		JPanel Pizza = new Pizza();
		this.setVisible(false);
		
	}

}
