package oop;

public class Demo1 {

	public static void main(String[] args) {
		// Creating a new bank account -> think instantiate an object	

		bankAccount acc1 = new bankAccount();
		acc1.name = "Wilson";
		acc1.balance = 10000;
		acc1.accountNumber = "07570506026";
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1000);
		acc1.deposit(2000);
		acc1.deposit(3000);
		acc1.withdraw(1500);
		
		System.out.println(acc1.toString());
		
		
		/*bankAccount acc2 = new bankAccount("Debit");
		bankAccount acc3 = new bankAccount("Debit", 1000);
		acc3.checkBalance();*/
		
		
		
		/*//Demo for inheritance
		System.out.println("==========");
		CDAccount c1 = new CDAccount();
		c1.name = "Sekut";
		c1.balance = 20000;
		c1.accType = "CD Account";
		System.out.println(c1.toString());
		c1.compound();*/
		
	}

}
