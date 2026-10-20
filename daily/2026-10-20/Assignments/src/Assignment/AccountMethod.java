// Learning Java assignments (Assignment) - practice file from Assignments, pushed 2026-10-20
package Assignment;

public class AccountMethod {

	int accNo;
	String holderName;
	double balance;

	AccountMethod(int accNo, String holderName, double balance) {

		this.accNo = accNo;
		this.holderName = holderName;
		this.balance = balance;

	}

	void deposit(double amount) {

		balance = balance + amount;

		System.out.println("Amount Deposited : " + amount);
		System.out.println("Available Balance : " + balance);

	}

	void withdraw(double amount) {

		if (amount <= balance) {

			balance = balance - amount;

			System.out.println("Amount Withdrawn : " + amount);
			System.out.println("Available Balance : " + balance);

		} else {

			System.out.println("Insufficient Balance");

		}

	}

	public static void main(String[] args) {

		AccountMethod a1 = new AccountMethod(1001, "Sweety", 50000);

		AccountMethod a2 = new AccountMethod(1002, "Misty", 30000);

		System.out.println("----- Account 1 -----");
		a1.deposit(5000);
		a1.withdraw(2000);

		System.out.println();

		System.out.println("----- Account 2 -----");
		a2.deposit(10000);
		a2.withdraw(5000);

	}

}
