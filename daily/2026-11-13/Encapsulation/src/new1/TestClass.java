// Learning encapsulation (new1) - practice file from Encapsulation, pushed 2026-10-20
package new1;

public class TestClass {

	int accNo;
	String holder, cardNo;
	private String pinNo;
	
	public String getPinNo() {
		return pinNo;
	}
	
	public void setPin(String pinNo) {
		this.pinNo = pinNo;
	}
	
	
	//deposit, withdraw
	// getter-setter method - provision to read /write the private data members
	
	
	//to update  the balqance
	public void setBalance(int balance) {
		//server side logs ---location/ ip / datetime we can add what we want
		this.balance = balance;
	}
	
	// read the value BALANCE
	
	public int getBalance() {
		return balance;
	}
	
	
	
	
	
	
	
	
	
	
	
}

