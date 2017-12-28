package oop;

public class bankAccount implements iRate{
	String accountNumber;
	
	//static membuat nilai menjadi milik CLASS, (Mau berapapun objectnya nilai dari variable static akan tetap sama.
	//ubah 1 menggunakan "METHOD.NAMA_FUNCTION()" nilai dari variable static akan berubah untuk semua objek.
	private static final String routingNumber = "0000";
	
	String name;
	String ssn;
	String accType;
	double balance = 0;
	
	//Constructor definition: unique method.
		//1. they are used to define / setup/ initialize properties of an object
		//2. Constructor are IMPLICITLY called upon instantiation
		//3. the same name as the class itself
		//4. constructor has no return type at all
	bankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	//overloading: same name method with different argument.
	bankAccount(String type){
		System.out.println("New Account type : "+type);
	}
	
	bankAccount(String type, int initDeposit){
		System.out.println("New Account type : "+type+" With Initial Deposit Of "+initDeposit);
		String msg ="";
		if(initDeposit < 1000) {
			msg="Minimum Deposit Is 1000 Bitch";
		}else {
			msg="Thx for your Initial deposit of "+initDeposit;
			balance = balance + initDeposit;
		}
		System.out.println(msg);
		
	}
	
	//interface method
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	
	
	
	
	//define method
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("Withdraw");
	}
	
	//private : hnya bsa di panggil di dalam file class tersebut sndiri.
	private void showActivity(String act){
		System.out.println("Your Recent Transaction : " +act);
		System.out.println("Your new Balance is : "+balance);
	}
	
	void checkBalance() {
		System.out.println(balance);
	}	
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[" + name + ", "+ accountNumber+ routingNumber + ", Balance = " + balance +  "+";
	}
}
