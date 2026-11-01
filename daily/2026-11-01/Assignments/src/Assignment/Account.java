// Learning Java assignments (Assignment) - practice file from Assignments, pushed 2026-11-01
package Assignment;

public class Account {

	int accNo;
	String holderName;
	double balance;

	Account() {

		accNo = 1000;
		holderName = "Unknown";
		balance = 0;

	}

	Account(int accNo, String holderName, double balance) {

		this.accNo = accNo;
		this.holderName = holderName;
		this.balance = balance;

	}

	@Override
	public String toString() {

		return "Account No = " + accNo +
				", Holder Name = " + holderName +
				", Balance = " + balance;

	}

	public static void main(String[] args) {

		Account a1 = new Account();

		Account a2 = new Account(1001, "Vineet", 50000);

		System.out.println(a1);

		System.out.println(a2);

	}

}

