public class CurrentAc extends Account {

	

	CurrentAc(long account_no, double amount) {
		super(account_no, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getBalance() {
		// TODO Auto-generated method stub
		return this.amount;
	}

	@Override
	double depositeAmount(double deposite) {
		this.amount += deposite;
		this.amount -=10;
		System.out.println("Amount deposited ");
		System.out.println("Updated Amount");
		return getBalance();
	}

	@Override
	double WidrawAmount(double withdrawl) {
		this.amount -= withdrawl;
		this.amount -=10;
		System.out.println("Amount Withdrawl");
		System.out.println("Updated Amount");
		return getBalance();	

	}
}