package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class AccountProgram {

	public static void main(String[] args) {
		
		Account accOne = new Account(5647, "Francis Copalla", 1000.00);
		accOne.withdraw(200);		
		System.out.println(accOne);
		
		Account accTwo = new SavingsAccount(6758, "Nelson Torres", 1000.0, 0.01);
		accTwo.withdraw(200.0);
		System.out.println(accTwo);
		
		Account accThree = new BusinessAccount(7820, "Luis Rdrigues", 1000.0, 400.00);
		accThree.withdraw(200);
		System.out.println(accThree);

	}

}
