package homeWork;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;

	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public Account() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/**
	 * 月利率
	 **/
	public double getMonthlyInterest() {

		return this.annualInterestRate / 12;
	}

	/**
	 * 取款
	 **/
	protected boolean withdraw(double amount) {
		if (this.balance >= amount) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 存款
	 **/
	public double deposit(double amount) {
		double sum = this.balance + amount;
		this.setBalance(sum);
		return this.getBalance();
	}

}
