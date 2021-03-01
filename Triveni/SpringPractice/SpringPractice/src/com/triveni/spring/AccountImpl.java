package com.triveni.spring;

public class AccountImpl {
	private String jointAccount;
	private String demartAccount;
	
	private LoansImpl impls;
	public AccountImpl() {
		
	}
	

	public AccountImpl(String jointAccount, String demartAccount, LoansImpl impls) {
		super();
		this.jointAccount = jointAccount;
		this.demartAccount = demartAccount;
		this.impls = impls;
	}


	/**
	 * @return the jointAccount
	 */
	public String getJointAccount() {
		return jointAccount;
	}


	/**
	 * @return the demartAccount
	 */
	public String getDemartAccount() {
		return demartAccount;
	}


	/**
	 * @return the impls
	 */
	public LoansImpl getImpls() {
		return impls;
	}


	/**
	 * @param jointAccount the jointAccount to set
	 */
	public void setJointAccount(String jointAccount) {
		this.jointAccount = jointAccount;
	}


	/**
	 * @param demartAccount the demartAccount to set
	 */
	public void setDemartAccount(String demartAccount) {
		this.demartAccount = demartAccount;
	}


	/**
	 * @param impls the impls to set
	 */
	public void setImpls(LoansImpl impls) {
		this.impls = impls;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccountImpl [jointAccount=" + jointAccount + ", demartAccount=" + demartAccount + ", impls=" + impls
				+ "]";
	}




}
