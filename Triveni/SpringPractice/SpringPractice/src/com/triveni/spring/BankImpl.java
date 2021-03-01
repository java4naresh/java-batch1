package com.triveni.spring;

public class BankImpl {
	private String bName;
	private String bAddress;
	private String distict;
	
	private AccountImpl impl;
	public BankImpl() {
		
	}

	public BankImpl(String bName, String bAddress, String distict, AccountImpl impl) {
		super();
		this.bName = bName;
		this.bAddress = bAddress;
		this.distict = distict;
		this.impl = impl;
	}

	/**
	 * @return the bName
	 */
	public String getbName() {
		return bName;
	}

	/**
	 * @return the bAddress
	 */
	public String getbAddress() {
		return bAddress;
	}

	/**
	 * @return the distict
	 */
	public String getDistict() {
		return distict;
	}

	/**
	 * @return the impl
	 */
	public AccountImpl getImpl() {
		return impl;
	}

	/**
	 * @param bName the bName to set
	 */
	public void setbName(String bName) {
		this.bName = bName;
	}

	/**
	 * @param bAddress the bAddress to set
	 */
	public void setbAddress(String bAddress) {
		this.bAddress = bAddress;
	}

	/**
	 * @param distict the distict to set
	 */
	public void setDistict(String distict) {
		this.distict = distict;
	}

	/**
	 * @param impl the impl to set
	 */
	public void setImpl(AccountImpl impl) {
		this.impl = impl;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankImpl [bName=" + bName + ", bAddress=" + bAddress + ", distict=" + distict + ", impl=" + impl + "]";
	}
	
	

}
