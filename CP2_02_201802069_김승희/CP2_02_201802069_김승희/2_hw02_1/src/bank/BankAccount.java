package bank;

public class BankAccount {
	private String name;
	
	private long balance;
	private double rate;

	public BankAccount(String name, int balance, double rate) { //ó�� ���¸� ������ ���� int�� ���� �������� �ִ� �ݾ����� �Ѵ�.
		setBankAccount(name, balance, rate);
	}

	public String getName() {
		return name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBankAccount(String name, int balance, double rate) {
		this.name = name;
		this.balance = balance;
		this.rate = rate;
	}

	public long deposit(long money) {
		this.balance=this.balance+money;
		return this.balance;
	}

	public long withdraw(long money) {
		if (this.balance < money)
			System.out.println("�ܾ��� �����մϴ�.");
		else
			this.balance = this.balance - money;
		
		return this.balance;
	}

	public int installmentSavingPredict(int month, long money) {
		int num;
		num =(int)(money * this.rate / 12 * (month * (month + 1) / 2) + money * month);
		num = (int)(num + this.balance);
		return num;
	}

	public long fixedDepositPredict(int month, long money) {
		long num = 0; //BigInteger ����ϸ�~~~~
		long n = this.balance + money;
		double r = Math.pow(1 + (this.rate / 12), month);
		num = (long) (n * (r - 1));
		n =num + n;
		return n;
	}
}
