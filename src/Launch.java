import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
	
	public static DefaultListModel<String> model;
	public static DefaultListModel<String> priceModel;
	AccountDB accounts = new AccountDB();
	ArrayList<Double> prices;

	public static DefaultListModel<String> AccountModel;
	public static ArrayList<String> orderList;
	public static ArrayList<String> priceList;
	public String Size;
	public static double total;
	public static JTextField priceText;
	public static JTextField tax;
	public static JTextField subTotal;
	
	
	
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
		frame.setBounds(0,0,600,800);
		frame.setMinimumSize(new Dimension(700, 600));
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		
		
		model = new DefaultListModel<String>();
		priceModel = new DefaultListModel<String>();
		AccountModel = new DefaultListModel<String>();
		orderList = new ArrayList<String>();
		priceList = new ArrayList<String>();
		priceText = new JTextField("default");
		tax = new JTextField("default");
		subTotal = new JTextField("default");
		
		total = 0;
		
		Scanner input = null;
		
		File file = new File("Prices");
		 prices = new ArrayList<Double>();
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

		String acctPIN;
		String line;
		String words[] = new String[2];
		String acctName = "";
		try {
			input = new Scanner(new File("Accounts"));
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Accounts file not found.");
			// e.printStackTrace();
		}
		while (input.hasNextLine() == true) {

			line = input.nextLine();
			if (!line.equals("")) {
				words = line.split(" ");
				acctPIN = words[0];
				for(int i = 1; i <words.length; i++){
					acctName += words[i] + " ";
				}
				Account acct = new Account(acctPIN, acctName);

				accounts.addAccount(acct);
				accounts.setCurrentUser(acctPIN);
				acctName = "";
			}
		}

		input.close();

	
		Receipt = new Receipt(orderList,model,this, total,priceList,priceModel, priceText, tax, subTotal);
		//EditAccounts2 = new EditAccounts2(frame,this, accounts);
		Toppings = new Toppings(this,model, orderList, total,priceList,priceModel);
		Pizza = new Pizza(this, model, orderList,priceList);
		Main = new Main(frame,this,orderList,model, accounts, AccountModel, total,priceList,priceModel);
		Login = new Login(frame, this, orderList,model, accounts, AccountModel, total,priceList,priceModel);
		//Pizza = new Pizza(frmae, this);
		Settings = new Settings(frame, this, accounts, AccountModel);
		NewUser = new NewUser(frame,this, accounts);
		DeleteUser = new DeleteUser(frame,this, accounts, AccountModel);
		Order = new Order(this,model,orderList, total,priceList, priceModel);
		EditAccounts = new EditAccounts(frame,this, accounts, AccountModel);
		EditPrices = new EditPrices(frame, this);
		//final JPanel Toppings = new Toppings();
		
		frame.getContentPane().add(Receipt, "Receipt");
		Receipt.setVisible(false);
		//frame.getContentPane().add(EditAccounts2, "EditAccounts2");
		//EditAccounts2.setVisible(false);
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
	public JPanel getSettings(){
		return Settings;
	}
	public JPanel getMain(){
		double total = 0;
		for( int i = 0; i < priceList.size(); i ++){
			total += Double.parseDouble(priceList.get(i));
			System.out.println(total);
		}
		priceText.setText(total + " ");
		return Main;
	}
	public JPanel getOrder(){
		double total = 0;
		for( int i = 0; i < priceList.size(); i ++){
			total += Double.parseDouble(priceList.get(i));
			System.out.println(total);
		}
		priceText.setText(total + " ");
		return Order;
	}
	public JPanel getNewUser(){
		return NewUser;
	}
	public JPanel getDeleteUser(){
		return DeleteUser;
	}
	public JPanel getPizza(){	
		double total = 0;
		for( int i = 0; i < priceList.size(); i ++){
			total += Double.parseDouble(priceList.get(i));
			System.out.println(total);
		}
		priceText.setText(total + " ");
		return Pizza;
	}
	public JPanel getToppings(){
		double total = 0;
		for( int i = 0; i < priceList.size(); i ++){
			total += Double.parseDouble(priceList.get(i));
			System.out.println(total);
		}
		priceText.setText(total + " ");
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
		double total = 0;
		priceModel.clear();
		
		for( int i = 0; i < priceList.size(); i ++){
			total += Double.parseDouble(priceList.get(i));
			priceModel.addElement(priceList.get(i));
		}
		priceText.setText("Total: " + (double)(total + (total/prices.get(7))) + " ");
		tax.setText("Tax " + total/prices.get(7) +" ");
		subTotal.setText("SubTotal: "+total + " ");
		return Receipt;
	}
	public JPanel getEditPrices(){
		return EditPrices;
	}


}
