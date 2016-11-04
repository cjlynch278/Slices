public class Account {
	private String name;
	private String pin;
	
	//constructor collecting all of the data
	public Account(String p, String n){
		name= n;
		pin = p;
	}
	public String getPIN(){
		return pin;
	}
	public String getName(){
		return name;
	}
	

}
