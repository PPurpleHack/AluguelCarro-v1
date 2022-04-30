package model;

import java.time.LocalDate;

public class PaymentData {

	private String safeCode;
	private String ownerName;
	private String cardNumber;
	// private FlagEnum flag;
	private LocalDate expirationDate;
	
	public PaymentData(){}
	public PaymentData(
		String safeCode,
		String ownerName,
		String cardNumber,
		LocalDate expirationDate
	) {
		this.safeCode = safeCode;
		this.ownerName = ownerName;
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
	}
	
	public String getSafeCode() {
		return safeCode;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	
	public LocalDate getExpirationDate() {
		return expirationDate;
	}
	
	public void setSafeCode(String safeCode) {
		this.safeCode = safeCode;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}
}
