import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Type of Account");
		System.out.println("Press 1. for Saving Account");
		System.out.println("Press 2. for Current Accout");
		int option = sc.nextInt();
		sc.nextLine();
		Account acc = null;
		
		System.out.println("Enter Account number : ");
		long acc_no = sc.nextLong();
		
		// default bank balance is 1000
		
		double balance = 1000;
		
		System.out.println();
		if(option == 1) {
			acc = new SavingAc(acc_no,balance);
			
		}
		else if( option ==2) {
			acc = new CurrentAc(acc_no,balance);
			
		}
		else
			System.out.println("Wrong Option");
		
		System.out.println("Choose any one option");
		System.out.println("1. Get Account Balance");
		System.out.println("2. Deposit Amount");
		System.out.println("3. Withdrawl Amount");
		System.out.println("0. Exit");
//		int opt2=sc.nextInt();;
		int opt2 =9;
		do {

			System.out.println("Choose any one option");
			System.out.println("1. Get Account Balance");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Withdrawl Amount");
			System.out.println("0. Exit");
			opt2 = sc.nextInt();
		sc.nextLine();
		
		switch(opt2)
		{
		case 1: System.out.println( acc.getBalance());
		break;
		case 2: System.out.println("Enter an amount to deposit");
		double dep = sc.nextDouble();
		
		System.out.println(acc.depositeAmount(dep));
		break;
		case 3:
			System.out.println("Enter an amount to withdrawl ");
			double withdraw = sc.nextDouble();
			if(acc.getBalance() < withdraw) {
				System.out.println("amount is too high");
			}
			else {
				System.out.println(acc.WidrawAmount(withdraw));
				
			}
			break;
		case 0: System.exit(0);
		default: System.out.println("wrong output");
		
		}
		}while(opt2 !=0);
		sc.close();
		
	}


}