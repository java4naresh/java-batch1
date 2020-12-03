package corejavaprograms;

public class BankAccount 
{
	int accNum;
	String accHolderName;
	double accBal;
	static double accMinBal=500.0;
	static double homeLoanInterest=6.0;
	String branchName;
	static double carLoanInterest=10.0;
	
	public BankAccount(int accNum, String accHolderName, double accBal, String branchName) 
	{
		super();
		this.accNum = accNum;
		this.accHolderName = accHolderName;
		this.accBal = accBal;
		this.branchName = branchName;
		
		
	}
	
	/*public BankAccount() {
		// TODO Auto-generated constructor stub
	}*/

	public int getAccNum()
	{
		return accNum;
	}
	public void setAccNum(int accNum)
	{
		this.accNum = accNum;
	}
	public String getAccHolderName() 
	{
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName)
	{
		this.accHolderName = accHolderName;
	}
	public double getAccBal()
	{
		return accBal;
	}
	public void setAccBal(double accBal)
	{
		this.accBal = accBal;
	}
	public static double getAccMinBal()
	{
		return accMinBal;
	}
	public static void setAccMinBal(double accMinBal)
	{
		BankAccount.accMinBal = accMinBal;
	}
	public static double getHomeLoanInterest()
	{
		return homeLoanInterest;
	}
	public static void setHomeLoanInterest(double homeLoanInterest)
	{
		BankAccount.homeLoanInterest = homeLoanInterest;
	}
	public String getBranchName()
	{
		return branchName;
	}
	public void setBranchName(String branchName) 
	{
		this.branchName = branchName;
	}
	public static double getCarLoanInterest()
	{
		return carLoanInterest;
	}
	public static void setCarLoanInterest(double carLoanInterest) 
	{
		BankAccount.carLoanInterest = carLoanInterest;
	}
	static
	{
		System.out.println("********Welcome to SBI********");
	}
	public double withdraw(double withdraw)
	{
		return withdraw;
	}
	public static void signTermsAndCond()
	{
		System.out.println("[ ] I Agree With all the terms and conditions");
	}
	
	@Override
	public String toString()
	{
		return "BankAccount [accNum=" + accNum + ", accHolderName=" + accHolderName + ", accBal=" + accBal
				+", accMinBal=" + accMinBal+ ", homeLoanInterest=" + homeLoanInterest +", carLoanInterest=" +carLoanInterest +", branchName=" + branchName+"]";
	}

	public static void main(String[] args)
	{
		BankAccount ba=new BankAccount(12345678,"Divya",5000.0,"Manthani");
		System.out.println(ba);
		System.out.println("Withdraw Amount-"+ba.withdraw(1000));
		signTermsAndCond();
	}

}
