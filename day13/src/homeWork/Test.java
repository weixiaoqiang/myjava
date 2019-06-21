package homeWork;

import java.util.Scanner;

public class Test {
	Account account = new Account();
	Scanner input = new Scanner(System.in);
	CheckAccount check;

	public void statr() {
		while (true) {
			System.out.println("1.添加账户信息");
			System.out.println("2.取款");
			System.out.println("3.存款");
			String choose = input.next();
			switch (choose) {
			case "1":
				addUsers();
				break;
			case "2":
				withdraw();
				break;
			case "3":
				deposit();
				break;
			default:
				break;
			}

		}
	}

	/**
	 * 初始化用户
	 **/
	public void addUsers() {
		System.out.println("请输入账户ID：");
		int id = input.nextInt();
		System.out.println("请输入账户余额：");
		double balance = input.nextDouble();
		System.out.println("请输入年利率：");
		double annualInterestRate = input.nextDouble();
		System.out.println("请输入可以透支余额：");
		double overdraught = input.nextDouble();
		check = new CheckAccount(id, balance, annualInterestRate, overdraught);

	}

	/**
	 * 取款
	 **/
	public void withdraw() {
		System.out.println("您要取多少元？");
		double amount = input.nextDouble();
		boolean rseult = check.withdraw(amount);
		if (rseult) {

			System.out.println("您的账户余额为：" + check.getBalance() + "元" + "透支余额为" + check.getOverdraught() + "元");

		} else {
			System.out.println("账户余额不足且超出透支额度无法取款");
		}
	}

	/**
	 * s 存款
	 **/
	public void deposit() {
		System.out.println("您要存多少元？");
		double amount = input.nextDouble();
		double balance = check.deposit(amount);
		System.out.println("您的余余额为：" + balance + "元");
		System.out.println("月利率为：" + check.getMonthlyInterest());
	}

}
