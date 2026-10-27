// Learning Java assignments (Assignment) - practice file from Assignments, pushed 2026-10-27
package Assignment;

public class AccountMethods {

	int accNo;
	String holderName;
	double balance;

	AccountMethods(int accNo, String holderName, double balance) {

		this.accNo = accNo;
		this.holderName = holderName;
		this.balance = balance;

	}

	void deposit(double amount) {

		balance = balance + amount;

		System.out.println(holderName + " deposited â‚¹" + amount);
		System.out.println("Current Balance = â‚¹" + balance);

	}

	void withdraw(double amount) {

		if (amount <= balance) {

			balance = balance - amount;

			System.out.println(holderName + " withdrew â‚¹" + amount);
			System.out.println("Current Balance = â‚¹" + balance);

		} else {

			System.out.println("Insufficient Balance");

		}

	}

	public static void main(String[] args) {

		AccountMethods a1 = new AccountMethods(1001, "Vineet", 50000);

		AccountMethods a2 = new AccountMethods(1002, "Rahul", 30000);

		System.out.println("----- Account 1 -----");
		a1.deposit(5000);
		a1.withdraw(2000);

		System.out.println();

		System.out.println("----- Account 2 -----");
		a2.deposit(10000);
		a2.withdraw(5000);

	}

}
