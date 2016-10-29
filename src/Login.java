@@ -9,6 +9,10 @@ import com.jgoodies.forms.factories.FormFactory;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JTextField;
@@ -83,14 +87,42 @@ public class Login extends JPanel {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		Scanner input = null;
		ArrayList<String> accts = new ArrayList<String>();
		String acct;
		try {
			input = new Scanner(new File("Accounts"));
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
		}
		while(input.hasNextLine() == true){
			acct = input.nextLine();
			accts.add(acct);
			
			
		}
		for(String nxt : accts){
			System.out.println(nxt);
		}
		
		JButton LoginButton = new JButton("Login");
		LoginButton.setForeground(Color.BLACK);
		LoginButton.addActionListener(new ActionListener() {
		JPanel Main = new Main(frame);
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				frame.getContentPane().add(Main, "order");
				Main.setVisible(true);
				
				if (accts.contains(txtEnterPinHere.getText())){
					
					
					setVisible(false);
					frame.getContentPane().add(Main, "order");
					Main.setVisible(true);
				}
				
				
				//System.out.println(txtEnterPinHere.getText());
				
			}
		});
		
@@ -99,6 +131,8 @@ public class Login extends JPanel {
		add(txtEnterPinHere, "13, 10, 6, 1, fill, default");
		txtEnterPinHere.setColumns(10);
		add(LoginButton, "14, 14, 5, 1");
		
		
		JPanel Main = new Main(frame);
		
		JPanel Pizza = new Pizza();
