package partF;

public class Bank{
	public static void main(String[] args) {
	BankAccount b=new BankAccount();
	b.deposit(5000);
	b.withdraw(1000);
	b.checkBalance();
	}
}

class BankAccount {
	private double balance=0;
	
	void deposit(double amount) {
		balance +=amount;
		System.out.println("Deposited Amount: "+amount);
	}
	void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
			System.out.println("Withdrawn Amount: "+amount);
		}
		else {
			System.out.println("Insufficient Balance!");
		}
	}
	void checkBalance() {
		System.out.println("Available Balance: "+balance);
	}
	
}
