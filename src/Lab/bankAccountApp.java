package Lab;

import java.util.Random;

public class bankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankAccount ba = new bankAccount("4354561234", 200);
		ba.setName("Wilson");
		System.out.println(ba.getName());
		ba.makeDeposit(100);
		ba.makeDeposit(200);
		ba.payBill(50);
		ba.accrue();
	}

}

class bankAccount implements IInterest{
	//properties of bank account
	private static int ID = 1000;  		//internal ID
	private String accNumber;   //id + 2 random digit number + 2 first of ssn
	private static final String routeNumber = "085774862790";
	private String name;
	private String ssn;
	private double balance;
	
	//Constructor
	public bankAccount(String ssn, double balance) {
		if(balance <= 100) {
			System.out.println("Initial Deposit Is to Small");
		}else {
		this.balance = balance;
		System.out.println("New Account Created");
		this.ssn = ssn;
		ID++;
		setAccountNumber();}
	}
	
	private void setAccountNumber() {
		Random rd = new Random();
		int rando = rd.nextInt(90) + 10;		
		accNumber = ID +""+ rando + ssn.substring(0,2);
		System.out.println("Your Account Number is : " + accNumber);
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(int amount) {
		balance = balance = amount;
		System.out.println("Paying bill : " + amount);
		showBalance();
	}
	
	public void makeDeposit(int depo) {
		balance = balance + depo;
		System.out.println("Making Deposit : "+ depo);
		showBalance();
	}

	public void showBalance() {
		System.out.println("Balance : " + balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
}
