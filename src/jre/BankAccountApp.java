package jre;

public class BankAccountApp {
	
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("465329874");
		BankAccount acc2 = new BankAccount("276098874");
		BankAccount acc3 = new BankAccount("907119620");
		
	}
	
}


class BankAccount {
	// Properties of Bank Account
	private static int id = 1000;
	private String accountNumber;
	private String routingNumber;
	private String name;
	private String SSN;
	private double balance;
	
	// Constructor
	public BankAccount(String SSN) {
		System.out.println("New Account Created");
		this.SSN= SSN;
		id++ ;
		setAccountNumber();
		
}

private void setAccountNumber() {
	int random = (int) (Math.random() * 100);
	accountNumber = id + "" + random + SSN.substring(0,2);
	System.out.println("Your Account Number: " + accountNumber);
  }

}