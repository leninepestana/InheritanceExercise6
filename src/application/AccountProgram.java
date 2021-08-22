package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class AccountProgram {

	public static void main(String[] args) {
		
		/* Class Account cannot be instantiated because it was created as abstract */
		
		//Account accOne = new Account(3459, "Martin", 1000.00);
		Account accTwo = new BusinessAccount(4891, "Daniel", 1000.00, 300.00);
		Account accThree = new SavingsAccount(6749, "Marta", 1000.00, 1.01);
		
	}

}
