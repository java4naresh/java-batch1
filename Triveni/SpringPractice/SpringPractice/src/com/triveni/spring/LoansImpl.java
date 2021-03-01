package com.triveni.spring;

public class LoansImpl {
	private String personalLoan;
	private String homeLoan;
	private String carLoan;
	
	public LoansImpl() {
		
	}
	public LoansImpl(String personalLoan, String homeLoan, String carLoan) {
		super();
		this.personalLoan = personalLoan;
		this.homeLoan = homeLoan;
		this.carLoan = carLoan;
	}

	



	/**
	 * @return the personalLoan
	 */
	public String getPersonalLoan() {
		return personalLoan;
	}


	/**
	 * @return the homeLoan
	 */
	public String getHomeLoan() {
		return homeLoan;
	}


	/**
	 * @return the carLoan
	 */
	public String getCarLoan() {
		return carLoan;
	}


	/**
	 * @param personalLoan the personalLoan to set
	 */
	public void setPersonalLoan(String personalLoan) {
		this.personalLoan = personalLoan;
	}


	/**
	 * @param homeLoan the homeLoan to set
	 */
	public void setHomeLoan(String homeLoan) {
		this.homeLoan = homeLoan;
	}


	/**
	 * @param carLoan the carLoan to set
	 */
	public void setCarLoan(String carLoan) {
		this.carLoan = carLoan;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoansImpl [personalLoan=" + personalLoan + ", homeLoan=" + homeLoan + ", carLoan=" + carLoan + "]";
	}
	
	
	
	
	
	

}
