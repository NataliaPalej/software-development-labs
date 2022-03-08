/**
 * Creating account object
 * @author Natalia
 */

public class Account 
{
	private int accNo;
	private String name;
	private double balance;
	private double overDraftLimit;
	
	/**
	 * Main constructor
	 * @param accNo stores account number
	 * @param name stores account name holder
	 * @param balance stores account balance
	 * @param overDraftLimit
	 */
	public Account(int accNo, String name, double balance, double overDraftLimit) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.overDraftLimit = overDraftLimit;
	}
	
	/**
	 * Second constructor
	 * @param accNo stores account number
	 * @param name stores account name holder
	 */
	public Account(int accNo, String name)
	{
		this.accNo = accNo;
		this.name = name;
	}
	
	public void deposit(double sum)
	{
		this.balance = this.balance + sum;
	}
	
	/**
	 * Method to withdraw money
	 * @param sum amount to be withdrawn
	 * Condition that checks: balance not lower than sum to withdraw
	 * overDraftLimit not higher than sum to withdraw
	 */
	public void withdraw(double sum)
	{
		if (this.overDraftLimit > sum && this.balance > sum)
		{
			this.balance = this.balance - sum;
		}
		else
		{
			System.out.println("Your balance or over draft limit is too low! Cannot withdraw the amount.\nYou tried to withdraw: " + sum + "\nYour balance is: " + this.balance + "\nOverdraft limit: " + this.overDraftLimit);
		}
	}
	
	/**
	 * Method that prints the account information
	 */
	
	public void printTable()
	{
		System.out.println("AccNo | Name | Balance | OverdraftLimit");
	}
	public void print()
	{
		System.out.println(this.accNo + " | "+ this.name + " | " + this.balance + " | " + this.overDraftLimit); 
	}
	
	
}
