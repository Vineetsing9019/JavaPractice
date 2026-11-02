// Learning oop (inheritance) - practice file from oop, pushed 2026-11-02
package inheritance;

public class Account {

	int ACC_NO;
	String holder;
	int balance;

	// Zero Constructor
	public Account() {
	}

	// Parameterized Constructor
	public Account(int ACC_NO, String holder, int balance) {
		super();
		this.ACC_NO = ACC_NO;
		this.holder = holder;
		this.balance = balance;
	}

	// Deposit Method
	public void deposit(int amount) {
		this.balance += amount;
		System.out.println("After deposit, updated balance is Rs. " + balance);
	}

	// Parent Withdraw Method
	public void withdraw(int amount) {
		this.balance -= amount;
		System.out.println("After withdraw, updated balance is Rs. " + balance);
	}

	public static void main(String[] args) {

		// Creating Account Object
		// Account account = new Account(100001, "Misty", 10000);
		// System.out.println(account);

		// Creating SavingAccount Object
		SavingAccount sa = new SavingAccount();

		// Deposit Amount
		sa.deposit(10000);

		// Withdraw Amount
		sa.withdraw(6000);

		// This withdrawal is not allowed because
		// minimum balance of Rs.1000 should remain
		sa.withdraw(4000);
	}
}

// Child Class
class SavingAccount extends Account {

	// Minimum balance should remain in the account
	int minBalance = 1000;

	// Overriding Parent withdraw() Method
	
	@Override // it is written with"@" it is annotation
	public void withdraw(int amount) {

		// Maximum amount that can be withdrawn
		int maxWithdrawal = balance - minBalance;

		// Check whether withdrawal is allowed
		if (amount <= maxWithdrawal) {
			this.balance -= amount;
			System.out.println("After withdraw, updated balance is Rs. " + balance);
		} else {
			System.err.println("Sorry! You can't withdraw more than Rs. " + maxWithdrawal);
		}
	}
}
