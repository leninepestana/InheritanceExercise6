package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class AccountProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Account> account = new ArrayList<>();
		
		account.add(new SavingsAccount(3785, "Martin", 1000.00, 0.01));
		account.add(new BusinessAccount(4982, "Daniel", 1000.00, 300.00));
		account.add(new SavingsAccount(7840, "Laura", 700.00, 0.01));
		account.add(new BusinessAccount(4890, "Maria", 700.00, 400.00));
		
		double sum = 0.0;
		for (Account a : account) {
			sum += a.getBalance();
		}

		System.out.println("Total balance: " + sum);
		System.out.println();
		
		for(Account a : account) {
			a.deposit(10.00);
		}
		
		for(Account a : account) {
			System.out.printf("Updated accont: %d, Balance: %.2f %n", a.getNumber(), a.getBalance());
		}
		
	}

}
