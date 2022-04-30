package model;

public class Driver extends User{
	
	private PaymentData payment; 
	
	public Driver() {
		super();
	}
	
	public void rentCar() {
		if(this.payment == null) {
			throw new NullPointerException("Payment no initialized");
		}
		System.out.println("Alugando carro");
	}
	
	public PaymentData getPayment() {
		return payment;
	}
	
	public void setPayment(PaymentData payment) {
		this.payment = payment;
	}
	
}
