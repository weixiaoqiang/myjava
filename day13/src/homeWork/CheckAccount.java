package homeWork;

public class CheckAccount extends Account {
	public CheckAccount(int id, double balance, double annualInterestRate, double overdraught) {
		super(id, balance, annualInterestRate);
		this.overdraught = overdraught;
	}

	public CheckAccount() {

	}

	private double overdraught;

	public double getOverdraught() {
		return overdraught;
	}

	public void setOverdraught(double overdraught) {
		this.overdraught = overdraught;
	}

	public boolean withdraw(double amount) {
		double sum = this.overdraught + getBalance();
		if (sum >= amount) {
			double yue;
			if (amount > this.getBalance()) {
				yue = this.getOverdraught() - (amount - this.getBalance());
				this.setOverdraught(yue);
				this.setBalance(0);
				return true;
			} else {
				yue = this.getBalance() - amount;
				this.setBalance(yue);
				return true;
			}
		} else {
			return false;
		}
	}

}
