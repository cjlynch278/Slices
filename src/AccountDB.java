//import java.io.BufferedReader;
//import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;


public class AccountDB {

	private ArrayList<Account> accts = new ArrayList<Account>();
	private Account currentUser;
	private Account edit;
	public void setCurrentUser(String pin) {
		for (Account a : accts) {
			if (a.getPIN().equals(pin)) {
				currentUser = a;

			}
		}
	}

	public Account getCurrentUser() {
		return currentUser;
	}

	public void addAccount(Account acct) {
		// adding the accounts to the array
		accts.add(acct);
	}

	public void closeAccount(int remove) {
		// this will be used to close accounts

		if (!accts.get(remove).equals(currentUser)) {
			accts.remove(accts.get(remove));

			PrintWriter writer;
			try {
				writer = new PrintWriter("Accounts");
				writer.print("");
				writer.close();

			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			
			for (Account a : accts) {
				String line = a.getPIN() + " " + a.getName() + "\n";
				try {
					Files.write(Paths.get("Accounts"), line.getBytes(), StandardOpenOption.APPEND);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

	public ArrayList<Account> getAccts() {
		// returns the array to AccountTest so that the accounts can be printed
		return accts;
	}

	public boolean contains(String pin) {

		for (Account a : accts) {
			if (a.getPIN().equals(pin)) {
				return true;
			}
		}
		return false;

	}
	
	public void setEdit(int e){
		edit = accts.get(e);
		
	}
	public Account getEdit(){
		return edit;
	}
	
	public void editAccount(String name, String pin){
		boolean changeCU = false;
		if(edit.equals(currentUser)){
			changeCU = true;
			
		}
		accts.remove(edit);
		PrintWriter writer;
		try {
			writer = new PrintWriter("Accounts");
			writer.print("");
			writer.close();

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Account acct = new Account(pin, name);
		if(changeCU){
			currentUser= acct;
		}
		
		accts.add(acct);
		for (Account a : accts) {
			String line = a.getPIN() + " " + a.getName() + "\n";
			try {
				Files.write(Paths.get("Accounts"), line.getBytes(), StandardOpenOption.APPEND);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
	}
}
