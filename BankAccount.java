package com.subodh.collection;

public class BankAccount {
	private String branch;
	private int acNo;
	private String acHName;
	private double balance;
	
	public BankAccount(int acNo, String acHName, double balance,String branch) {
		super();
		this.branch=branch;
		this.acNo = acNo;
		this.acHName = acHName;
		this.balance = balance;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getAcNo() {
		return acNo;
	}
	public String getAcHName() {
		return acHName;
	}

	public void setAcHName(String acHName) {
		this.acHName = acHName;
	}
	
	public void deposit(double amt) {
		this.balance=balance+amt;
	}
	
	public void withdraw(double amt) {
		this.balance=balance-amt;
	}
	
	public void currentBalance() {
		System.out.println(balance);
	}
	

//	@Override
//	public int hashCode() {
//		return (int)acNo;
//	}
	
	@Override
	public int hashCode() {
		System.out.println("In Hash code:"+this);
		//return branch.hashCode();	//Wrong design there will be a change same hash code number is generated for the two different branches
									//The correct design is :assign branchId to each branch separately by yourself in the program
									//and return that id from this hashCode() method
		return BranchMap.getBranchId(branch);
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("In Equals:"+this+" "+obj);
		if(obj instanceof BankAccount) {
			BankAccount acc=(BankAccount)obj;
			
			return this.branch.equals(acc.branch) &&
					this.acNo==acc.acNo;	
		}
		return false;
	}

	@Override
	public String toString() {
		return "\nBankAccount [acNo=" + acNo + ", acHName=" + acHName + ", balance=" + balance + ", branch="+ branch +"]";
	}

	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	

