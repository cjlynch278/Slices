import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

import java.awt.CardLayout;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Scanner;

//500 width 450 length
//400 top width
public class Launch {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton;
	private JPanel panel;
	
	public JPanel Main;
	public  JPanel Login;
	public JPanel Pizza;
	public  JPanel Settings;
	public JPanel NewUser ;
	public JPanel Order;
	public JPanel DeleteUser;
	public JPanel Toppings;
	public JPanel EditAccounts;
	public JPanel EditAccounts2;
	public JPanel Receipt;
	public JPanel EditPrices;
	
	public DefaultListModel<String> model;

	public DefaultListModel<String> AccountModel;
	public static ArrayList<String> orderList;
	public String Size;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Launch window = new Launch();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Launch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		  //frame.setSize(screenSize.width, screenSize.height);
		frame = new JFrame();
		frame.setBounds(200, 200, 525, 507);
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		model = new DefaultListModel<String>();
		AccountModel = new DefaultListModel<String>();
		orderList = new ArrayList<String>();
		
		System.out.println(orderList.size());
		
		
		Scanner input = null;
		AccountDB accounts = new AccountDB();

		String acctPIN;
		String line;
		String words[] = new String[2];
		String acctName;
		try {
			input = new Scanner(new File("Accounts"));

		} catch (FileNotFoundException e) {
			// e.printStackTrace();
		}
		while (input.hasNextLine() == true) {

			line = input.nextLine();
			if (!line.equals("")) {
				words = line.split(" ");
				acctPIN = words[0];
				acctName = words[1];
				// System.out.println(acctPIN + " " + acctName);
				Account acct = new Account(acctPIN, acctName);

				accounts.addAccount(acct);
				accounts.setCurrentUser(acctPIN);
			}
		}

		input.close();

		
		
		
		
		Receipt = new Receipt(orderList,model);
		EditAccounts2 = new EditAccounts2(frame,this);
		Toppings = new Toppings(frame,this,orderList,model);
		Pizza = new Pizza(frame,this,orderList,model);
		Main = new Main(frame,this,orderList,model, accounts, AccountModel);
		Login = new Login(frame, this, orderList,model, accounts, AccountModel);
		//Pizza = new Pizza(frmae, this);
		Settings = new Settings(frame, this, accounts, AccountModel);
		NewUser = new NewUser(frame,this, accounts);
		DeleteUser = new DeleteUser(frame,this, accounts, AccountModel);
		Order = new Order(frame,this,orderList, model);
		EditAccounts = new EditAccounts(frame,this);
		EditPrices = new EditPrices(frame, this);
		//final JPanel Toppings = new Toppings();
		
		frame.getContentPane().add(Receipt, "Receipt");
		Receipt.setVisible(false);
		frame.getContentPane().add(EditAccounts2, "EditAccounts2");
		EditAccounts2.setVisible(false);
		frame.getContentPane().add(EditAccounts,"EditAccounts");
		EditAccounts.setVisible(false);
		frame.getContentPane().add(Toppings, "Toppings");
		Toppings.setVisible(false);
		//frame.getContentPane().add(Toppings, "Toppings");
		frame.getContentPane().add(Settings, "Settings");
		Settings.setVisible(false);
		frame.getContentPane().add(Order, "Order");
		Order.setVisible(false);
		//frame.getContentPane().add(Pizza,"pizza");
		//Pizza.setVisible(false);
		frame.getContentPane().add(DeleteUser, "Delete User");
		frame.getContentPane().add(Login, "name_23596145660473");
		Login.setVisible(true);
		frame.getContentPane().add(NewUser, "NewUser");
		NewUser.setVisible(false);
		frame.getContentPane().add(Pizza, "Pizza");
		frame.setVisible(false);
		frame.getContentPane().add(EditPrices, "EditPrices");
		EditPrices.setVisible(false);
		
		frame.getContentPane().add(Main, "main");
		
		Main.setVisible(false);
		
		
		
	
	}
	public JPanel getLogin(){
		return Login;
	}
	public JPanel getSettings(){
		return Settings;
	}
	public JPanel getMain(){
		return Main;
	}
	public JPanel getOrder(){
		return Order;
	}
	public JPanel getNewUser(){
		return NewUser;
	}
	public JPanel getDeleteUser(){
		return DeleteUser;
	}
	public JPanel getPizza(){	
		return Pizza;
	}
	public JPanel getToppings(){
		return Toppings;
	}
	public void setSize(String size){
		Size = size;
	}
	public String getSize(){
		return Size;
	}
	public JPanel getEditAccounts(){
		return EditAccounts;
	}
	public JPanel getReceipt(){
		return Receipt;
	}
	public JPanel getEditAccounts2(){
		return EditAccounts2;
	}
	public JPanel getEditPrices(){
		return EditPrices;
	}


}
