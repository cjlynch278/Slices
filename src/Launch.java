import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

import java.awt.CardLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Launch {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton;
	private JPanel panel;

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
		frame.setBounds(200, 200, 500, 500);
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel Main = new Main(frame);
		final JPanel Order = new Order(frame);
		final JPanel Login = new Login(frame);
		final JPanel Pizza = new Pizza();
		
		//final JPanel Toppings = new Toppings();
		
		//frame.getContentPane().add(Toppings, "Toppings");
		
		frame.getContentPane().add(Pizza,"pizza");
		Pizza.setVisible(false);
		frame.getContentPane().add(Order, "order");
		frame.getContentPane().add(Login, "name_23596145660473");
		Login.setVisible(true);
		
		Order.setVisible(false);
		frame.getContentPane().add(Main, "main");
		
		Main.setVisible(false);
		
		
		
		
	}

}
