// Learning oop (day 18) - practice file from oop, pushed 2026-10-24
package day18;

public class FinalDemo {
	
	// we need to set the value to the final constants // 1. declaration time (if the value is same for all objects) //or // 2. within the parameterized contructor( )

    final int ACC_NO; contstans
    String holderName, email;
    int balance;
    final String IFSC = "HSBC9019";

    public FinalDemo(int ACC_NO, String holderName, String email, int balance) {

        this.ACC_NO = ACC_NO;
        this.holderName = holderName;
        this.email = email;
        this.balance = balance;
    }

    @Override
    public String toString() {

        return "ACC_NO = " + ACC_NO +
                ", Holder Name = " + holderName +
                ", Email = " + email +
                ", Balance = " + balance +
                ", IFSC = " + IFSC;
    }

    public static void main(String[] args) {

        FinalDemo f1 = new FinalDemo(1001, "Misty", "misty@gmail.com", 10000);
        FinalDemo f2 = new FinalDemo(1002, "Sweety", "sweety@gmail.com", 100000);

        System.out.println(f1);
        System.out.println(f2);
    }
}
