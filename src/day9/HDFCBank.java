package day9;

import java.util.Scanner;

public class HDFCBank implements BankingServices
{
	private double balance;
	Scanner sc=new Scanner(System.in);
	public HDFCBank(double balance)
	{
		this.balance=balance;
	}
	
	@Override
	public void deposit() {
		System.out.println("Enter Amount to deposit");
		double depositAmount=sc.nextDouble();
		if (depositAmount <= 0) {
			
		}
	}

	@Override
	public void withdraw() {
		System.out.println("Enter Amount to withdraw");
		double withdrawAmount=sc.nextDouble();
		this.balance-=withdrawAmount;
		
	}

	@Override
	public void onlineTransfer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Current Balance is "+ this.balance);
	}

}