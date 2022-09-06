public abstract class Account {
	double amount;
	long account_no;
	
	Account(long account_no,double amount){
		this.amount = amount;
		this.account_no = account_no;
	}
	abstract double  getBalance();
	abstract double depositeAmount(double deposit);
	abstract double WidrawAmount(double withdrawl);
	

}