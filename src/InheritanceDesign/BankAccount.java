package InheritanceDesign;

public class BankAccount extends Asset{

	private String bankAccountNo;
	private double balance;
	
	public BankAccount(String name, String bankAccountNo, double balance) {
		super(name);
		this.bankAccountNo = bankAccountNo;
		this.balance = balance;
	}

	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public double getDebt() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getAssetValue() {
		// TODO Auto-generated method stub
		return getBalance();
	}
	
	public void printSummary() {
		System.out.println("");
		System.out.printf("Asset Name:: %s\n", this.getName());
		System.out.printf("Account No: %s\n", this.getBankAccountNo());
		System.out.printf("Balance: %10.2f\n", this.getNetValue());	
		System.out.println("");
		}	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
