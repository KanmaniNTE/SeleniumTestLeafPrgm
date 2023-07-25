package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("The amount deposited in Axis Bank");
	}
	public static void main(String[] args) {
		AxisBank bnk=new AxisBank();
		bnk.deposit();
	}
}
